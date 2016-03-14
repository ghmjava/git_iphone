package com.meilishuo.meidian.testcase.shop;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.CommonMethod;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.DianBAInfoCommitPage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.ShopPage;

/**
 * Created by MLS on 15/8/28.
 */
public class TestRoleUI extends BaseClass{
    @Discover
    public void testRoleUi() {
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
        ShopPage.get_shopdetail(solo);
        Log.d(TAG, "启动店铺资料页面");

        //点击身份
        solo.clickOnView(solo.getView(ShopPage.role_layout));
        Log.d(TAG, "点击身份");
        solo.sleep(1000);

        //启动身份页
        DianBAInfoCommitPage.get_bainfo(solo);
        Log.d(TAG, "启动身份页");

        //页面标题、返回按钮、保存按钮、文本输入框确认
        assertTrue(CommonMethod.get_title(solo).equals("身份"));
        assertTrue(solo.waitForView(solo.getView(DianBAInfoCommitPage.tv_head_left)));
        assertTrue(solo.waitForView(solo.getView(DianBAInfoCommitPage.tv_head_right)));
        assertTrue(solo.waitForView(solo.getView(DianBAInfoCommitPage.content)));
        Log.d(TAG, "UI 确认");
        //点击返回
        DianBAInfoCommitPage.getClickLeft(solo);
        solo.sleep(2000);

        //启动Home页
        ShopPage.get_shopdetail(solo);
        solo.sleep(1000);


    }
}
