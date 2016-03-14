package com.meilishuo.meidian.testcase.test;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.CommonMethod;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;

public class TestHome extends BaseClass{
	@Discover
	public void testHome(){
        init();
		//点击我的美店
		MiaoHomePage.getClickMeidian(solo);
		Log.d(TAG, "点击我的美店");
		solo.sleep(2000);

		//启动美店主页
		HomePage.get_home(solo);
		solo.sleep(1000);

	    //点击订单管理
		HomePage.getClickOrder(solo);
	    Log.d(TAG,"order wait");
	    solo.sleep(2000);
		HomePage.getClickReturn(solo);
	    solo.sleep(2000);

		//我的商品及图标
		assertTrue(solo.searchText("我的商品"));
		assertTrue(solo.waitForView(solo.getView(HomePage.view_goods)));
		Log.d(TAG, "goods wait");
		//点击我的商品
	    HomePage.getClickGoods(solo);
	    Log.d(TAG, "order wait");
	    solo.sleep(2000);
	    assertTrue(CommonMethod.get_title(solo).equals("我的商品"));
        HomePage.getClickReturn(solo);
	    solo.sleep(2000);


		//我的收入及图标
		assertTrue(solo.searchText("我的收入"));
	    assertTrue(solo.waitForView(solo.getView(HomePage.view_income)));
	    Log.d("Robotium", "income wait");
	    //点击我的收入
	    HomePage.getClickIncome(solo);
	    Log.d("Robotium","order wait");
	    solo.sleep(2000);
	    assertTrue(CommonMethod.get_title(solo).equals("我的收入"));
		HomePage.getClickReturn(solo);
	    solo.sleep(2000);

	    //店铺资料及图标
	    assertTrue(solo.searchText("店铺资料"));
		assertTrue(solo.waitForView(solo.getView(HomePage.view_shop)));
		Log.d("Robotium", "shop wait");
		//点击店铺资料
	    HomePage.getClickViewShop(solo);
	    Log.d("Robotium","order wait");
	    solo.sleep(2000);
		//assertTrue(CommonMethod.get_title(solo).equals("店铺资料"));
		HomePage.getClickReturn(solo);
	    solo.sleep(2000);



		//设置
	   assertTrue(solo.waitForView(solo.getView(HomePage.iv_head_right)));
	    Log.d("Robotium", "shezhi wait");
	  //点击设置
	    HomePage.getClickSetting(solo);
	    Log.d("Robotium","order wait");
	    solo.sleep(2000);
	    assertTrue(CommonMethod.get_title(solo).equals("设置"));
		HomePage.getClickReturn(solo);
	    solo.sleep(2000);
}
}
