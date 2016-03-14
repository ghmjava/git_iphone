package com.meilishuo.meidian.testcase.goods;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.AddShopPage;
import com.meilishuo.meidian.page.GoodsPage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;

@SuppressWarnings("unchecked")
public class TestSearch extends BaseClass{

	@Discover
	public void testSearch (){
	init();

     //点击我的美店
     MiaoHomePage.getClickMeidian(solo);
     solo.sleep(2000);
     //点击添加商品
     HomePage.getClickGoods(solo);
     solo.sleep(3000);

     //启动我的商品页面
     GoodsPage.get_GoodsList(solo);
     Log.d(TAG, "启动我的商品页面");
     solo.sleep(2000);
        

	solo.sleep(3000);
	solo.clickOnText("^添加商品$");
	solo.sleep(2000);

   //启动添加商品页面
    AddShopPage.get_addSku(solo);
    Log.d(TAG, "启动添加商品页面");
    solo.sleep(2000);
	solo.clickOnView(solo.getView(GoodsPage.search_box));
	solo.sleep(1000);
    //确保启动SelectMaterialListActivity
	assertTrue("Activity \"SelectMaterialListActivity\" is not started.", solo.waitForActivity("SelectMaterialListActivity", 30000));
    Log.d("Robotium", "wait");
    solo.sleep(2000);
    //在搜素框中输入搜索关键词
     solo.clickOnView(solo.getView(GoodsPage.search_box));
     solo.enterText(0, "DHC 护肤服务");
    // solo.clickOnText("搜索");
     solo.sleep(1000);
     
     //点击取消
     solo.clickOnView(solo.getView(GoodsPage.tv_cancel));
     Log.d("Robotium", "click wait");
     solo.sleep(1000);
     
     //等待启动GoodsAddNewActivity
     assertTrue("Activity \"GoodsAddNewActivity\" is not started.", solo.waitForActivity("GoodsAddNewActivity", 30000));
     solo.sleep(1000);
	}
}
