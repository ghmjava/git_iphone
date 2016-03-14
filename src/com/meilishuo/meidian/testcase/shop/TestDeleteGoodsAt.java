//package com.meilishuo.meidian.testcase.shop;
//
//import android.util.Log;
//import com.meilishuo.meidian.init.BaseClass;
//import com.meilishuo.meidian.init.Shop;
//import com.meilishuo.meidian.page.GoodAt_ServicePage;
//import com.meilishuo.meidian.page.HomePage;
//import com.meilishuo.meidian.page.MiaoHomePage;
//import com.meilishuo.meidian.page.ShopPage;
//
///**
// * Created by MLS on 15/8/28.
// */
//public class TestDeleteGoodsAt extends BaseClass {
//    @Shop
//    public void testDeleteGoodsAt() {
//        init();
//        //点击我的美店
//        MiaoHomePage.getClickMeidian(solo);
//        Log.d(TAG, "点击我的美店");
//        solo.sleep(2000);
//
//
//        //点击店铺资料
//        solo.clickOnView(solo.getView(HomePage.view_profile));
//        Log.d(TAG, "点击店铺资料");
//        solo.sleep(2000);
//
//        //等待ShopDetailSettingActivity启动
//        ShopPage.get_shopdetail(solo);
//        Log.d(TAG, "启动店铺资料页面");
//
//        //点击擅长
//        solo.clickOnView(solo.getView(ShopPage.good_at_layout));
//        Log.d(TAG, "点击擅长");
//        solo.sleep(1000);
//
//        //启动擅长页
//        GoodAt_ServicePage.get_GoodAt_Service(solo);
//        Log.d(TAG, "启动个人简介");
//
//        //点击被选择的擅长
//        GoodAt_ServicePage.getClickText(solo,1);
//        solo.sleep(1000);
//        //点击保存
//        GoodAt_ServicePage.getClickRight(solo);
//        solo.sleep(1000);
//        //启动Home页
//        ShopPage.get_shopdetail(solo);
//        solo.sleep(1000);
//
//
//    }
//}
