package com.meilishuo.meidian.testcase.goods;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.page.*;

@SuppressWarnings("unchecked")
public class TestAddGoods2 extends BaseClass{

    //@Discover
	public void testAddGoods(){
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
	    //输入商品名称
	    solo.enterText(0,"逸丝风尚 创意挑染");
	    solo.enterText(1, "短发");
	    solo.enterText(2, "20");
	    solo.enterText(3,"150");
	    solo.enterText(4,"30");
	    Log.d("Robotium", "enter over");

		//选择分类
		AddShopPage.getClickSkuCategory(solo);
		solo.sleep(1000);

		//启动选择分类页面
		SkuCategoryPage.get_SkuCategory(solo);
		Log.d(TAG,"启动选择分类页面");
		solo.sleep(3000);

		//点击分类
		solo.clickOnView(solo.getView(SkuCategoryPage.parent_text,1));
		solo.sleep(1000);

		solo.clickOnText("^艺术彩绘$");
		Log.d(TAG,"选择分类");
		solo.sleep(1000);

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

	    //添加图片
	    solo.clickOnView(solo.getView(AddShopPage.img_empty));
	    Log.d("Robotium", "click content_pic");
		if(solo.searchText("安全警告")){
			solo.clickOnText("允许");
		}
	    solo.sleep(1000);
	    //等待相机启动
	    assertTrue("Activity \"camera.CameraActivity\" is not started.", solo.waitForActivity("camera.CameraActivity", 30000));
	    Log.d("Robotium", "wait");
	    solo.sleep(1000);
	    //点击拍照
	    solo.clickOnView(solo.getView("button_capture"));
	    Log.d("Robotium", "capture " +
				"" +
				"wait");
	    solo.sleep(1000);
	    //返回添加商品页面
	    assertTrue("Activity \"GoodsAddNewActivity\" is not started.", solo.waitForActivity("GoodsAddNewActivity", 30000));
	    Log.d("Robotium", "wait");
	    solo.sleep(1000);


	   
	    //点击提交
	    solo.clickOnText("^提交$");
	    solo.sleep(1000);
	    
	  //启动GoodsAddSuccessActivity
	    assertTrue("Activity \"GoodsAddSuccessActivity\" is not started.", solo.waitForActivity(GoodsAddNewSuccessPage.Activity, 30000));
	    Log.d("Robotium", "wait");
	    solo.sleep(1000);
	    
	}
}
