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
public class TestCoverMove extends BaseClass {
    @Discover
    public void testCoverUi() {
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
        Log.d(TAG,"启动店铺资料页面");

        //点击封面
        solo.clickOnView(solo.getView(ShopPage.ba_cover));
        Log.d(TAG,"点击封面");
        solo.sleep(2000);

        //等待我的封面页面启动
        AddBaCoverPage.get_addbacover(solo);
        Log.d(TAG, "启动我的封面页面");

        //点击下移按钮
        solo.clickOnView(solo.getView(AddBaCoverPage.down_arrow,0));
        Log.d(TAG,"点击下移按钮");
        solo.sleep(1000);

        //点击上移按钮
        solo.clickOnView(solo.getView(AddBaCoverPage.up_arrow,0));
        Log.d(TAG,"点击上移按钮");
        solo.sleep(1000);

        //点击提交按钮
        solo.clickOnView(solo.getView(AddBaCoverPage.tv_head_right));
        Log.d(TAG,"点击提交按钮");
        solo.sleep(1000);

        //返回至店铺资料页面
        ShopPage.get_shopdetail(solo);
        Log.d(TAG,"返回至店铺资料页面");






    }
}
