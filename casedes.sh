#!/bin/bash

function ergodic(){
  for file in `ls $1`
  do
    if [ -d $1"/"$file ]
    then
      ergodic $1"/"$file
    else
      path=$1"/"$file
      name=$file
#      local size=`du --max-depth=1 $path|awk '{print $1}'`
      if [ "`cat testClass.properties|grep -c $name`" != 0 ];then
        echo $name" have existed."
      else
        echo $name" does not exist."
        echo $name>>testClass.properties
      fi
      echo $path>path.properties
      sed -i '' 's/src\///g' path.properties
      sed -i '' 's/.java//g' path.properties
      sed -i '' 's/\//./g' path.properties
      #get method
      for method in `sed -n '/void/p' $path`
      do
        echo $method>temp.properties
        sed -i '' 's/[[:space:]]//g' temp.properties
        temp=`sed '1p' temp.properties`
        str1=${temp##*void}
        str2=${str1%(*}
        path2=`sed -n '1p' path.properties`
        if [ "`cat testMethod.properties|grep -c $path2'#'$str2`" != 0 ];then
            echo $path2'#'$str2" have existed."
        else
            echo $path2'#'$str2" does not exist."
            echo $path2"#"$str2"=">>testMethod.properties
        fi
      done
    fi
  done


}

IFS=$'\n'                      #这个必须要，否则会在文件名中有空格时出错
INIT_PATH="src/com/meilishuo/meidian/testcase";
ergodic $INIT_PATH


