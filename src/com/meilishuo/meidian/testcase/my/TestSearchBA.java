package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.BAHomePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.SearchPersonPage;

/**
 * Created by MLS on 15/9/8.
 */
public class TestSearchBA extends BaseClass {
    @Discover
    public void testUI() {
        //初始化
        init();

        //点击找人icon
        MiaoHomePage.getClickSearchPerson(solo);
        solo.sleep(1000);

        //进入找人页面
        SearchPersonPage.get_SearchPerson(solo);
        Log.d(TAG,"进入找人页面");
        solo.sleep(1000);

        //输入gaogao进行查询
        solo.enterText(0,"gaogao");
        Log.d(TAG,"输入gaogao进行搜索");
        solo.sleep(3000);

        //点击第三个头像
        SearchPersonPage.clickHeadPhoto(solo,2);
        Log.d(TAG,"点击第三个头像");
        solo.sleep(2000);

        //进入个人页
        BAHomePage.get_BAHome(solo);
        Log.d(TAG,"进入BA个人页");
        solo.sleep(1000);







    }
}
