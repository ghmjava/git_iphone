package com.meilishuo.meidian.testcase.shop;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.AddBaCoverPage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.ShopPage;

/**
 * Created by MLS on 15/8/28.
 */
public class TestClickCover extends BaseClass {
    @Discover
    public void testClickCover() {
        init();
        //点击我的美店
        MiaoHomePage.getClickMeidian(solo);
        Log.d(TAG, "点击我的美店");
        solo.sleep(2000);


        //点击店铺资料
        solo.clickOnView(solo.getView(HomePage.view_profile));
        Log.d(TAG, "点击店铺资料");
        solo.sleep(2000);

        //等待ShopDetailSettingActivity启动
        assertTrue("Activity\"ShopDetailSettingActivity\"is not start", solo.waitForActivity(ShopPage.ShopDetailSettingActivity));
        solo.sleep(1000);

        //点击封面
        solo.clickOnView(solo.getView(ShopPage.ba_cover));
        Log.d(TAG,"点击封面");
        solo.sleep(2000);

        //等待我的封面页面启动
        assertTrue("Activity\"AddBaCoverActivity\"is not start",solo.waitForActivity(AddBaCoverPage.Activity));
        Log.d(TAG, "启动我的封面页面");
        solo.sleep(2000);
    }
}
