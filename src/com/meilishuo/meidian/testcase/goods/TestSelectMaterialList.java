package com.meilishuo.meidian.testcase.goods;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.GoodsPage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;

@SuppressWarnings("unchecked")
public class TestSelectMaterialList extends BaseClass{

	@Discover
	public void testSelectMaterialList (){
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
	    
	    solo.clickOnView(solo.getView(GoodsPage.search_box));
	    Log.d("Robotium", "点击搜索素材库");
	    solo.sleep(1000);
    //确保启动SelectMaterialListActivity
	assertTrue("Activity \"SelectMaterialListActivity\" is not started.", solo.waitForActivity("SelectMaterialListActivity", 30000));
    Log.d("Robotium", "wait");
    solo.sleep(2000);
    
    //搜索框UI、取消UI存在
    assertTrue(solo.waitForView(solo.getView(GoodsPage.search_box)));
    assertTrue(solo.waitForView(solo.getView(GoodsPage.tv_cancel)));
    //素材库中图片、标题、分类、规格、介绍存在
    assertTrue(solo.waitForView(solo.getView(GoodsPage.image)));
    assertTrue(solo.waitForView(solo.getView(GoodsPage.tv_title)));
    assertTrue(solo.waitForView(solo.getView(GoodsPage.tv_category)));
    assertTrue(solo.waitForView(solo.getView(GoodsPage.tv_sku)));
    assertTrue(solo.waitForView(solo.getView(GoodsPage.tv_description)));
    Log.d("Robotium", "check sku wait");
    //向下滑屏
    solo.scrollDown();
    solo.sleep(1000);
    //向上滑屏
    solo.scrollToTop();
    solo.sleep(1000);
   
    //点击素材库商品
    solo.clickOnImage(1);
    solo.sleep(1000);
    
    //等待GoodsAddNewActivity启动
    assertTrue("Activity\"GoodsAddNewActivity\"is not start",solo.waitForActivity("GoodsAddNewActivity"));
    Log.d("Robotium", "启动GoodsAddNewActivity");
    solo.sleep(1000);
	}
}
