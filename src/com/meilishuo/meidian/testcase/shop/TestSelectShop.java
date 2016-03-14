package com.meilishuo.meidian.testcase.shop;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.CommonMethod;
import com.meilishuo.meidian.page.DianBAInfoCommitPage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.ShopPage;

//import com.meilisuo.meidian.init.BaseClass;
//import com.meilishuo.meidian.init.CommonMethod;

@SuppressWarnings("unchecked")
public class TestSelectShop extends BaseClass{
	//@TestCase
	public void testClickShop(){
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

		//点击所在门店
		solo.clickOnView(solo.getView(ShopPage.layout_shop));
		Log.d(TAG, "点击身份");
		solo.sleep(1000);

		//启动所在门店页
		DianBAInfoCommitPage.get_bainfo(solo);
		Log.d(TAG, "启动门店页");

		//清空内容
		solo.clearEditText(0);
		solo.sleep(1000);

		//输入门店
		solo.enterText(0,"新中关购物中心");
		Log.d(TAG, "修改门店");
		solo.sleep(1000);

		//点击完成
		DianBAInfoCommitPage.getClickRight(solo);
		solo.sleep(2000);

		//启动Home页
		ShopPage.get_shopdetail(solo);
		solo.sleep(1000);

		//确保所在门店正确
		assertTrue(CommonMethod.get_text(solo, ShopPage.et_shop_name, 0).equals("新中关购物中心"));
		Log.d(TAG,"所在门店修改正确");
		solo.sleep(1000);


	}
}