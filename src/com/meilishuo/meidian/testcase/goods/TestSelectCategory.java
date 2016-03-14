package com.meilishuo.meidian.testcase.goods;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.CommonMethod;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.*;

@SuppressWarnings("unchecked")
public class TestSelectCategory extends BaseClass{

    @Discover
	public void testSelectCategory(){
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
	    solo.sleep(2000);
	    //点击商品分类
	    solo.clickOnView(solo.getView(GoodsPage.add_goods_category));
	    Log.d("Robotium", "click category");
	    solo.sleep(1000);
	    //等待CategoryActivity启动
	    assertTrue("Activity \"CategoryActivity\" is not started.", solo.waitForActivity("CategoryActivity", 30000));
	    Log.d("Robotium", "wait");
	    solo.sleep(2000);
	    //页面标题确定
        assertTrue(CommonMethod.get_title(solo).equals("选择分类"));
	   //返回按钮存在
	    assertTrue(solo.waitForView(solo.getView(SkuCategoryPage.tv_head_left)));
	    //向下滚动页面
	    solo.sleep(1000);
	    //确保护肤妆品、彩妆妆品、护肤服务、彩妆服务存在
	    assertTrue(solo.waitForView(solo.getView(SkuCategoryPage.parent_text)));
//	   assertTrue(solo.waitForView(solo.getViewByPath("com.meilishuo.meidian:id/grid_parent[1][0][0]")));
//	   assertTrue(solo.waitForView(solo.getViewByPath("com.meilishuo.meidian:id/grid_parent[2][0][0]")));
//	   assertTrue(solo.waitForView(solo.getViewByPath("com.meilishuo.meidian:id/grid_parent[3][0][0]")));
//	   assertTrue(solo.searchText("彩妆服务"));
	   assertTrue(solo.searchText("^皮肤护理$"));
	   assertTrue(solo.searchText("^化妆造型$"));
	   assertTrue(solo.searchText("^美发造型$"));
	   assertTrue(solo.searchText("^美甲美睫$"));
	   assertTrue(solo.searchText("^微整面诊$"));
	   assertTrue(solo.searchText("^私人定制$"));
	   //assertTrue(solo.searchText("^护肤妆品$"));
	   //assertTrue(solo.searchText("^彩妆妆品$"));
	    Log.d("Robotium","check goods");

		//点击化妆造型
		solo.clickOnText("化妆造型");
		Log.d(TAG,"点击化妆造型");
		solo.sleep(2000);

		//查看是否存在子目录
		assertTrue(solo.searchText("^精致修眉$"));
		assertTrue(solo.searchText("^清新日常妆$"));
		assertTrue(solo.searchText("^新娘宴会妆$"));
		assertTrue(solo.searchText("^彩妆课程$"));
		Log.d(TAG,"子目录存在");
		solo.sleep(1000);

		//点击清新日常妆
		solo.clickOnText("清新日常妆");
		Log.d(TAG,"点击清新日常妆");
		solo.sleep(2000);

		//启动添加商品页面
		assertTrue("Activity \"GoodsAddNewActivity\" is not started.", solo.waitForActivity(AddShopPage.Activity, 30000));
		Log.d("Robotium", "wait");
		solo.sleep(2000);
     //确认商品分类为清新日常妆
        assertTrue(CommonMethod.get_text(solo,AddShopPage.add_goods_category,0).equals("清新日常妆"));
		Log.d(TAG,"商品分类为清新日常妆");
		solo.sleep(2000);

	    
	}
}
