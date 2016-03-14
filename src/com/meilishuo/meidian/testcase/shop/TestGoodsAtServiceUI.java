//package com.meilishuo.meidian.testcase.shop;
//
//import android.util.Log;
//import com.meilishuo.meidian.init.BaseClass;
//import com.meilishuo.meidian.init.CommonMethod;
//import com.meilishuo.meidian.init.Shop;
//import com.meilishuo.meidian.page.*;
//
///**
// * Created by MLS on 15/8/28.
// */
//public class TestGoodsAtServiceUI extends BaseClass {
//    @Shop
//    public void testGoodsAtServiceUi() {
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
//        //页面标题、返回按钮、保存按钮等各UI确认
//        assertTrue(CommonMethod.get_title(solo).equals("擅长"));
//        assertTrue(solo.waitForView(solo.getView(GoodAt_ServicePage.tv_head_left)));
//        assertTrue(solo.waitForView(solo.getView(GoodAt_ServicePage.tv_head_right)));
//        assertTrue(solo.waitForView(solo.getView(GoodAt_ServicePage.parent_text)));
//        assertTrue(solo.waitForView(solo.getView(GoodAt_ServicePage.child_text)));
//        assertTrue(solo.waitForView(solo.getView(GoodAt_ServicePage.selected)));
//        assertTrue(solo.waitForView(solo.getView(GoodAt_ServicePage.text)));
//        Log.d(TAG, "UI 确认");
//
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.parent_text,0).equals("皮肤护理"));
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.parent_text,1).equals("化妆造型"));
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.parent_text,2).equals("美发造型"));
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.parent_text,3).equals("美甲美睫"));
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.parent_text,4).equals("微整面诊"));
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.parent_text,5).equals("私人定制"));
//
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,0).equals("全部"));
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,1).equals("深层清洁"));
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,2).equals("保湿补水"));
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,3).equals("美白嫩肤"));
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,4).equals("紧致减龄"));
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,5).equals("面部其它"));
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,6).equals("手颈保养"));
//        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,7).equals("身体按摩"));
//
//        //点击返回
//        DianBAInfoCommitPage.getClickLeft(solo);
//        solo.sleep(2000);
//
//        //启动Home页
//        ShopPage.get_shopdetail(solo);
//        solo.sleep(1000);
//
//
//    }
//}
