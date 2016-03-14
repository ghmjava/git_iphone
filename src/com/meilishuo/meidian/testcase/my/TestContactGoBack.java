package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.SearchPersonPage;

/**
 * Created by MLS on 15/9/16.
 */
public class TestContactGoBack extends BaseClass {
    @Discover
    public void testUI() {
        //初始化
        init();

        //点击找人icon
        MiaoHomePage.getClickSearchPerson(solo);
        solo.sleep(1000);

        //进入找人页面
        SearchPersonPage.get_SearchPerson(solo);
        Log.d(TAG, "进入找人页面");
        solo.sleep(1000);

        //点击返回按钮
        SearchPersonPage.clickGoBack(solo);
        Log.d(TAG,"点击返回按钮");
        solo.sleep(1000);

        //启动我的页面
        MiaoHomePage.get_home(solo);
        Log.d(TAG,"启动我的页面");
        solo.sleep(1000);










    }

}
