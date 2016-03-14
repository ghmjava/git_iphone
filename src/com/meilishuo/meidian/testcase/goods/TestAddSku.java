package com.meilishuo.meidian.testcase.goods;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.AddShopPage;
import com.meilishuo.meidian.page.GoodsPage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;
//import com.jayway.android.robotium.solo.Solo;

@SuppressWarnings("unchecked")
public class TestAddSku extends BaseClass{
	@Discover
	public void testAddSku(){
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
	    //点击添加规格
	    solo.clickOnView(solo.getView(AddShopPage.add_sku));
	    Log.d("Robotium", "click sku");
	    solo.sleep(1000);
	   // assertTrue(solo.waitForView(solo.getViewByPath("com.meilishuo.meidian:id/sku_container[1][1][0][0]")));
	  //  assertTrue(solo.waitForView(solo.getViewByPath("com.meilishuo.meidian:id/sku_container[1][1][0][1]")));
	   // assertTrue(solo.waitForView(solo.getViewByPath("com.meilishuo.meidian:id/sku_container[1][1][2][0]")));
	   // assertTrue(solo.waitForView(solo.getViewByPath("com.meilishuo.meidian:id/sku_container[1][1][2][2]")));
	   // assertTrue(solo.waitForView(solo.getViewByPath("com.meilishuo.meidian:id/sku_container[1][1][4][0]")));
	  //  assertTrue(solo.waitForView(solo.getViewByPath("com.meilishuo.meidian:id/sku_container[1][1][4][2]")));
	   // Log.d("Robotium","check goods");
	    //LinearLayout layout1 = (LinearLayout)solo.getCurrentActivity().
	    //layout1.getChildAt(5);
	  solo.searchText("^商品规格：$", 2);
	  solo.searchText("^商品价格：$",2);
	  solo.searchText("^商品库存：$",2);
	  Log.d("Robotium", "click true");
	    
	}
}
