package com.meilishuo.meidian.testcase.goods;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.*;

public class TestAddMaterial extends BaseClass {
	@Discover
	public void testAddMaterial(){
		init();
		//点击我的美店
		MiaoHomePage.getClickMeidian(solo);
		solo.sleep(2000);
		//点击我的商品
		HomePage.getClickGoods(solo);
		solo.sleep(3000);
		
		//点击添加按钮
		solo.clickOnView(solo.getView(GoodsPage.txt_right));
		Log.d("Robotium", "click add");
		solo.sleep(2000);
		
		//等待GoodsAddNewActivity启动
	    assertTrue("Activity \"GoodsAddNewActivity\" is not started.", solo.waitForActivity("GoodsAddNewActivity", 30000));
	    Log.d("Robotium", "wait");
	    
	    //点击搜索素材框
	    solo.clickOnView(solo.getView(AddShopPage.search_box));
	    solo.sleep(1000);

		//点击素材
	   solo.clickOnView(solo.getView(SelectMaterialListPage.image));
	   Log.d("Robotium", "click over");
	   solo.sleep(1000);
	  
	   //等待添加商品页面启动
	    assertTrue("Activity \"GoodsAddNewActivity\" is not started.", solo.waitForActivity("GoodsAddNewActivity", 30000));
	    Log.d("Robotium", "wait");
	    solo.sleep(1000);
	    
	    //点击提交
	    solo.clickOnView(solo.getView(AddShopPage.tv_head_right));
	    solo.sleep(1000);
	    solo.searchText("请选择服务方式");

		//选择服务方式
		//点击服务方式
		AddShopPage.getClickService_Mode(solo);
		solo.sleep(2000);

		//启动选择服务方式页面
		ServiceTypePage.get_ServiceModePage(solo);
		Log.d(TAG,"启动选择服务方式页面");
		solo.sleep(2000);

		//选择上门服务
		solo.clickOnText("^上门服务$");
		Log.d(TAG,"选择服务方式");
		solo.sleep(2000);
	    
	    //服务时长、商品价格、商品数量输入
		solo.enterText(2, "20");
		solo.enterText(3,"150");
		solo.enterText(4,"30");
	    Log.d("Robotium", "enter over");


	    
	    //点击提交
	    solo.clickOnView(solo.getView(AddShopPage.tv_head_right));
	    solo.sleep(1000);
	    
	    //启动sku添加成功页面
	    solo.waitForActivity(GoodsAddNewSuccessPage.Activity);
	    solo.sleep(3000);
	    
	}
}
