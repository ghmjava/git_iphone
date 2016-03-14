package com.meilishuo.meidian.testcase.goods;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.AddShopPage;
import com.meilishuo.meidian.page.GoodsPage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;

@SuppressWarnings("unchecked")
public class TestClickGoodsList extends BaseClass{

	@Discover
	public void testGoodsList(){
		init();

		//点击我的美店
		MiaoHomePage.getClickMeidian(solo);
		solo.sleep(2000);

		//点击我的商品
		HomePage.getClickGoods(solo);
		solo.sleep(3000);

		//启动我的商品页面
		GoodsPage.get_GoodsList(solo);
		Log.d(TAG, "启动我的商品页面");
		solo.sleep(2000);

		//预览商品、商品二维码、分享到微信、分享朋友圈
		assertTrue(solo.waitForView(solo.getView(GoodsPage.iv_show)));
		assertTrue(solo.searchText("^预览商品$"));
		assertTrue(solo.waitForView(solo.getView(GoodsPage.iv_qrcode)));
		assertTrue(solo.searchText("^商品二维码$"));
		assertTrue(solo.waitForView(solo.getView(GoodsPage.iv_weixin)));
		assertTrue(solo.searchText("^分享到微信$"));
		assertTrue(solo.waitForView(solo.getView(GoodsPage.iv_friend)));
		assertTrue(solo.searchText("^分享朋友圈$"));
		Log.d("Robotium", "check wait");
		
		//检查编辑按钮、取消按钮是否出现
		assertTrue(solo.waitForView(solo.getView(GoodsPage.edit)));
		assertTrue(solo.waitForView(solo.getView(GoodsPage.tv_add)));
		
		//点击取消按钮
		solo.clickOnText("取消");
		Log.d("Robotium", "click quxiao wait");
		solo.sleep(1000);
		//点击商品
		solo.clickOnView(solo.getView(GoodsPage.image));
		solo.sleep(1000);
		//点击编辑
	    solo.clickOnView(solo.getView(GoodsPage.edit));
	    Log.d("Robotium", "click edite");
		solo.sleep(2000);	
		//启动GoosAddNewActivity
		assertTrue("Activity \"GoosAddNewActivity\" is not started.", solo.waitForActivity(AddShopPage.Activity, 30000));
		solo.sleep(2000);
		
		//点击返回
		solo.clickOnText("返回");
		
		//点击商品列表
		solo.clickOnView(solo.getView(GoodsPage.image));
		solo.sleep(1000);
		
		//点击商品二维码按钮
		solo.clickOnView(solo.getView(GoodsPage.iv_qrcode));
		Log.d("Robotium", "click show wait");
		solo.sleep(2000);
		
		//出现商品二维码
		assertTrue(solo.waitForView(solo.getView(GoodsPage.qrcode)));
		//assertTrue(solo.waitForView(solo.getView("tip")));
		
		//点击页面其他部位收回二维码
		solo.clickOnView(solo.getView("layout_header"));
		Log.d("Robotium", "click wait");
		solo.sleep(1000);
		
		//点击分享到微信
		solo.clickOnView(solo.getView(GoodsPage.image));
		solo.sleep(1000);
		solo.clickOnView(solo.getView(GoodsPage.iv_weixin));
		Log.d("Robotium", "click share_weixin");
		solo.sleep(1000);
		//进入微信登陆
		//assertTrue("Activity \"SimpleLoginUI\" is not started.", solo.waitForActivity("com.tencent.mm.ui.account.SimpleLoginUI", 30000));
		//solo.sleep(2000);
		//点击分享朋友圈
//		solo.clickOnView(solo.getView("image"));
//		solo.sleep(1000);
//		solo.clickOnView(solo.getView("iv_friend"));
//		Log.d("Robotium", "click share_friend");
//		solo.sleep(1000);
//		//点击预览商品按钮
//		solo.clickOnView(solo.getView("image"));
//		solo.sleep(1000);
//
//		solo.clickOnView(solo.getView("iv_show"));
//		Log.d("Robotium", "click show wait");
//		solo.sleep(2000);
//
//		//等待WebActivity启动
//		assertTrue("Activity \"WebActivity\" is not started.", solo.waitForActivity("WebActivity", 30000));
//		 solo.sleep(2000);
		
	}
}


