#/bin/sh
#robotium的项目路径应该在rd代码svn中，具体应该是Meilishuo/test/UITest
Version=$1
groupname=$2
device=$3
project_path=/Users/MLS/git-workspace/git-meidian/$Version

echo "下载新的apk"
rm -rf tempapk
mkdir tempapk
cd tempapk
curl -O http://172.17.18.136:8080/jenkins/job/android_meimiao_v3.3.3_release/lastSuccessfulBuild/artifact/build/outputs/apk/android_meimiao_v3.3.3_release-release.apk
echo "You have just got Pandora-release."
echo "resign and install on your device:$device."

mv android_meimiao_v3.3.3_release-release.apk Pandora-release.zip
unzip Pandora-release.zip
rm -rf META-INF
rm -rf Pandora-release.zip
zip -r Pandora-release.apk *
echo "Resign  Pandora-release.apk"
jarsigner -keystore ~/.android/debug.keystore -storepass android -keypass android Pandora-release.apk androiddebugkey
jarsigner -digestalg SHA1 -sigalg MD5withRSA  -keystore ~/.android/debug.keystore -storepass android -keypass android Pandora-release.apk  androiddebugkey
jarsigner -verify -verbose -certs Pandora-release.apk
echo "Uninstall Pandora-release.apk on $device"
adb -s $device uninstall com.meilishuo.meimiao
echo "Install  Pandora-release.apk on $device"
adb -s $device install Pandora-release.apk
echo "Delete tempapk"
cd ..
rm -rf tempapk
echo "Install and resign done!"

echo "删除测试包"
adb uninstall com.meilishuo.meimiao.test

echo "打包安装测试代码"
pwd
cd /Users/MLS/git-workspace/git-meidian/$Version
echo git pull
git pull
pwd
mvn clean package android:deploy

echo "Run roboitum"
echo "command--->"+adb -s $device shell am instrument -w  -e annotation com.meilishuo.meidian.init.$2  com.meilishuo.meimiao.test/com.zutubi.android.junitreport.JUnitReportTestRunner
adb -s $device shell am instrument -w  -e annotation com.meilishuo.meidian.init.$2  com.meilishuo.meimiao.test/com.zutubi.android.junitreport.JUnitReportTestRunner

echo "fetch junit report from phone"
rm -rf target/$2
mkdir -p target/$2

ret=`cat /data/data/com.meilishuo.meimiao/files/junit-report.xml|grep '</testsuites>'|grep -v cat|wc -l`
if [ret = 0]
then
  echo "</testsuites>" >>/data/data/com.meilishuo.meimiao/files/junit-report.xml
fi
adb -s $device pull /data/data/com.meilishuo.meimiao/files/junit-report.xml target/$2
echo "generate html report"
xsltproc JUNIT.XSL  target/$2/junit-report.xml > target/$2/index.html


echo "backup start"
lowername=`echo $groupname |tr '[A-Z]' '[a-z]'`

echo "copy result target folder to tomcat"

currentDate=`date +%Y%m%d`

rm -rf /Users/MLS/work/$Version/android-$Version-$currentDate

mkdir -p /Users/MLS/work/$Version/android-$Version-$currentDate

cp -r  /Users/MLS/git-workspace/git-meidian/$Version/target/$2  /Users/MLS/work/$Version/android-$Version-$currentDate/

