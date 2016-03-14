package com.meilishuo.meidian.testcase.test;

import android.util.Log;
import android.view.KeyEvent;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.CommonMethod;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.OrderDetailPage;
import com.meilishuo.meidian.page.OrderPage;

@SuppressWarnings("unchecked")
public class TestOrderList extends BaseClass{
	//@Discover
	public void testOrderList(){
		//初始化
		init2();
		//点击我的美店
		MiaoHomePage.getClickMeidian(solo);
		Log.d(TAG, "点击我的美店");
		solo.sleep(2000);


		//点击订单管理
		HomePage.getClickOrder(solo);
		Log.d(TAG, "点击订单管理");
		solo.sleep(2000);

		//等待订单管理页面启动
		OrderPage.get_OrderList(solo);
		Log.d(TAG, "启动订单管理页面");

		//标题、返回按钮、确认消费码UI
		assertTrue(solo.waitForView(solo.getView(OrderPage.tv_head_left)));
		assertTrue(solo.waitForView(solo.getView(OrderPage.tv_head_right)));
		//assertTrue(solo.waitForView(solo.getView(OrderPage.tv_head_tilte)));
		Log.d(TAG, "标题、返回按钮、确认消费码确认");
		solo.sleep(1000);
		//全部、未消费、未付款、交易成功、退款单UI确定
		solo.waitForText("^全部$");
		solo.waitForText("^未消费$");
		solo.waitForText("^未付款$");
		solo.waitForText("^交易成功$");
		solo.waitForText("^退款单$");
		Log.d(TAG, "tab 确认");
		solo.sleep(1000);
//		assertTrue(solo.waitForView(solo.getView("url")));
		//VIP标识、、收货人姓名、手机号、订单状态、订单创建时间等存在
		assertTrue(solo.waitForView(solo.getView(OrderPage.is_vip)));
		assertTrue(solo.waitForView(solo.getView(OrderPage.tv_name)));
		assertTrue(solo.waitForView(solo.getView(OrderPage.tv_phone)));
		assertTrue(solo.waitForView(solo.getView(OrderPage.state)));
		assertTrue(solo.waitForView(solo.getView(OrderPage.creat_time)));


		//商品名称、图片、规格、退款状态、本单总收入UI确认
		assertTrue(solo.waitForView(solo.getView(OrderPage.image)));
		assertTrue(solo.waitForView(solo.getView(OrderPage.service_name)));
		assertTrue(solo.waitForView(solo.getView(OrderPage.model_name)));
		assertTrue(solo.waitForView(solo.getView(OrderPage.refund)));
		solo.waitForText("^本单总收入：$");
		assertTrue(solo.waitForView(solo.getView(OrderPage.income)));
		Log.d(TAG, "订单信息存在");
		solo.sleep(1000);
		//点击订单信息
		OrderPage.click_Order(solo,0);
		Log.d(TAG, "点击订单");
		solo.sleep(3000);

		//启动订单详情页
		OrderDetailPage.get_orderdetail(solo);
		Log.d(TAG, "启动订单详情页");
		//点击返回
		OrderDetailPage.getBack(solo);
		Log.d(TAG , "click wait");
		solo.sleep(3000);
		
		//下拉刷新
		CommonMethod.page_refresh(solo);
		Log.d("Robotium", "refresh wait");
		solo.sleep(3000);
		
		//向上滑动屏幕
		CommonMethod.up_screen(solo);
		solo.sleep(3000);
		
		//向下滑动屏幕
		//CommonMethod.down_screen(solo);
		//solo.sleep(3000);

		//向左滑动
		solo.scrollToSide(KeyEvent.KEYCODE_DPAD_LEFT);
		solo.sleep(1000);

		solo.scrollToSide(KeyEvent.KEYCODE_DPAD_LEFT);
		solo.sleep(1000);

		solo.scrollToSide(KeyEvent.KEYCODE_DPAD_LEFT);
		solo.sleep(1000);

		solo.scrollToSide(KeyEvent.KEYCODE_DPAD_LEFT);
		solo.sleep(1000);
		Log.d(TAG,"向左滑屏");

		//向右滑屏
		solo.scrollToSide(KeyEvent.KEYCODE_DPAD_RIGHT);
		solo.sleep(1000);

		solo.scrollToSide(KeyEvent.KEYCODE_DPAD_RIGHT);
		solo.sleep(1000);

		solo.scrollToSide(KeyEvent.KEYCODE_DPAD_RIGHT);
		solo.sleep(1000);
		solo.scrollToSide(KeyEvent.KEYCODE_DPAD_RIGHT);
		solo.sleep(1000);
		Log.d(TAG, "向右滑动页面");

		
		
	}
}
