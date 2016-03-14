package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.SearchPersonPage;

/**
 * Created by MLS on 15/9/16.
 */
public class TestFansPageClickBack extends BaseClass {
    @Discover
    public void testFollowPageClickBack() {
        //初始化
        init();
        //点击粉丝
        MiaoHomePage.getClickFans(solo);
        solo.sleep(2000);

        //启动粉丝页面
        SearchPersonPage.get_SearchPerson(solo);
        Log.d(TAG, "启动粉丝页面");
        solo.sleep(1000);

        //点击返回按钮
        SearchPersonPage.clickGoBack(solo);
        solo.sleep(1000);

        //启动我的页面
        MiaoHomePage.get_home(solo);
        Log.d(TAG, "启动我的页面");
        solo.sleep(1000);

    }
}
