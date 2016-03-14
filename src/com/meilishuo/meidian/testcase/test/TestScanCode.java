//package com.meilishuo.meidian.testcase.test;
//
//import com.meilishuo.meidian.init.BaseClass;
//import com.meilishuo.meidian.init.TestCase;
//import com.meilishuo.meidian.page.HomePage;
//
//public class TestScanCode extends BaseClass{
//	@TestCase
//	public void testOrderList(){
//		init();
//        HomePage.getClickOrder(solo);
//
//		//等待启动OrderListActivity
//		solo.waitForActivity("OrderListActivity");
//		solo.sleep(1000);
//
//		//点击扫一扫
//		solo.clickOnText("扫一扫");
//		solo.sleep(1000);
//
//		//启动扫一扫页面
//		assertTrue("Activity \"CaptureActivity\" is not started.",solo.waitForActivity("CaptureActivity"));
//		solo.sleep(1000);
//
//		//点击取消
//		solo.clickOnText("^返回$");
//		solo.sleep(1000);
//
//
//
//	}
//}
//
