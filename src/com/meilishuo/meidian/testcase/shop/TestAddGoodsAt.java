//package com.meilishuo.meidian.testcase.shop;
//
//import android.util.Log;
//import com.meilishuo.meidian.init.BaseClass;
//import com.meilishuo.meidian.init.CommonMethod;
//import com.meilishuo.meidian.page.GoodAt_ServicePage;
//import com.meilishuo.meidian.page.HomePage;
//import com.meilishuo.meidian.page.MiaoHomePage;
//import com.meilishuo.meidian.page.ShopPage;
//
///**
// * Created by MLS on 15/8/28.
// */
//public class TestAddGoodsAt extends BaseClass {
//
//    public void testAddGoodsAt() {
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
//       //点击化妆造型
//        GoodAt_ServicePage.getClickParent(solo,1);
//        solo.sleep(2000);
//
//        //child显示正确
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,0).equals("全部"));
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,1).equals("精致修眉"));
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,2).equals("清新日常妆"));
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,3).equals("新娘宴会妆"));
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,4).equals("彩妆课程"));
//        Log.d(TAG,"child显示正确");
//        solo.sleep(1000);
//
//        //点击彩妆课程
//        GoodAt_ServicePage.getClickChild(solo,4);
//        solo.sleep(1000);
//
//        //彩妆课程被选择
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.text,1).equals("彩妆课程"));
//        Log.d(TAG,"彩妆课程被选");
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
