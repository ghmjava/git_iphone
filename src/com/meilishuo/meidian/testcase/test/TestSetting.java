//package com.meilishuo.meidian.testcase.test;
//
//import android.util.Log;
//import com.meilishuo.meidian.init.BaseClass;
//import com.meilishuo.meidian.init.CommonMethod;
//import com.meilishuo.meidian.init.TestCase;
//import com.meilishuo.meidian.page.HomePage;
//
//public class TestSetting extends BaseClass{
//
//@TestCase
//public void testSetting() {
//	init();
//    HomePage.getClickSetting(solo);
//    solo.sleep(1000);
//    //title标题
//    assertTrue(solo.searchText("设置"));
//    //assertTrue(CommonMethod.get_title(solo).equals("设置"));
//    //返回
//    assertTrue(solo.searchText("返回"));
//    //assertTrue(solo.waitForView(solo.get("com.meilishuo.meidian:id/view_pager[0]")));
//    assertTrue(solo.searchText("美店禁售商品管理"));
//    assertTrue(solo.searchText("美店注册使用协议"));
//    assertTrue(solo.searchText("关于美店"));
//    solo.sleep(1000);
//
//    //点击美店禁售商品管理
//    solo.clickOnView(solo.getView("layout_goods_forbid"));
//    solo.sleep(3000);
//    assertTrue(solo.searchText("返回"));
//    assertTrue(solo.searchText("关闭"));
//    solo.clickOnView(solo.getView("txt_left"));
//    solo.sleep(3000);
//
//    //点击美店注册使用协议
//    solo.clickOnView(solo.getView("layout_use_protocal"));
//    solo.sleep(3000);
//    assertTrue(solo.searchText("返回"));
//    assertTrue(solo.searchText("关闭"));
//    solo.clickOnView(solo.getView("txt_left"));
//    solo.sleep(3000);
//
//    //点击关于美店
//    solo.clickOnView(solo.getView("layout_about"));
//    solo.sleep(3000);
//    assertTrue(solo.searchText("返回"));
//    assertTrue(CommonMethod.get_title(solo).equals("关于"));
//    solo.clickOnView(solo.getView("txt_left"));
//    solo.sleep(3000);
//
//    //退出登录
//    assertTrue(solo.searchText("退出登录"));
//    Log.d("Robotium", "search loginout");
//    solo.sleep(1000);
//    solo.clickOnView(solo.getView("btn_logout"));
//    Log.d("Robotium", "click");
//    solo.sleep(1000);
//    assertTrue(solo.searchText("你确定退出美店吗"));
//    assertTrue(solo.searchButton("确定"));
//    assertTrue(solo.searchButton("取消"));
//    solo.clickOnView(solo.getView("button1"));
//    Log.d("Robotium", "click over");
//    solo.sleep(3000);
//    //跳转至登录页面
//
//    assertTrue(solo.searchText("登录"));
//   // assertTrue(CommonMethod.get_title(solo).equals("登录"));
//    Log.d("Robotium", "wait");
//
//}
//}
