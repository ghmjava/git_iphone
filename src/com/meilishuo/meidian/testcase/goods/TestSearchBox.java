package com.meilishuo.meidian.testcase.goods;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.GoodsPage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;

@SuppressWarnings("unchecked")
public class TestSearchBox extends BaseClass{

	@Discover
	public void testSearchBox(){
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
	   
	    //点击搜索框
	    solo.clickOnView(solo.getView(GoodsPage.search_box));
	    Log.d("Robotium", "click Search_box");
	    solo.sleep(2000);
	    //等待SelectMaterialListActivity启动
	    assertTrue("Activity \"SelectMaterialListActivity\" is not started.", solo.waitForActivity("SelectMaterialListActivity", 30000));
	    Log.d("Robotium", "wait");
	    solo.sleep(2000);


	    
	
		
	}
}