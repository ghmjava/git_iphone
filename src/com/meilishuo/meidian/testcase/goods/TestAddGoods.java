package com.meilishuo.meidian.testcase.goods;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.CommonMethod;
import com.meilishuo.meidian.page.AddShopPage;
import com.meilishuo.meidian.page.GoodsPage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;

@SuppressWarnings("unchecked")
public class TestAddGoods extends BaseClass{
	//@Discover
	public void testAddGoods(){
		init();

		//点击我的美店
		MiaoHomePage.getClickMeidian(solo);
		solo.sleep(3000);

		//点击我的商品
		HomePage.getClickGoods(solo);
		//点击添加按钮
		solo.clickOnView(solo.getView(GoodsPage.txt_right));
		Log.d("Robotium", "click add");
		solo.sleep(2000);
		//等待GoodsAddNewActivity启动
	    assertTrue("Activity \"GoodsAddNewActivity\" is not started.", solo.waitForActivity("GoodsAddNewActivity", 30000));
	    Log.d("Robotium", "wait");
	    solo.sleep(2000);
	    //标题确认
		assertTrue(CommonMethod.get_title(solo).equals("添加商品"));
		Log.d("Robotium", "check title");
	    //返回按钮、提交按钮
		assertTrue(solo.waitForView(solo.getView(AddShopPage.tv_head_left)));
		assertTrue(solo.waitForView(solo.getView(AddShopPage.tv_head_right)));
		Log.d("Robotium", "check left_right");
		//验证搜索框存在
		assertTrue(solo.waitForView(solo.getView(AddShopPage.search_box)));
		Log.d("Robotium", "check search_box");
		//验证商品名称存在
		assertTrue(solo.searchText("商品名称："));
		assertTrue(solo.waitForView(solo.getView(AddShopPage.edit_goods_title)));
		Log.d("Robotium", "check goods_title");

		//商品分类
		assertTrue(solo.searchText("商品分类"));
		assertTrue(solo.waitForView(solo.getView(AddShopPage.add_goods_category)));
		Log.d("Robotium", "check goods_category");

		//服务方式
		assertTrue(solo.searchText("服务方式"));
		assertTrue(solo.waitForView(solo.getView(AddShopPage.add_goods_category)));
		Log.d("Robotium", "check goods_category");

		//商品规格、服务时长、商品价格、商品库存存在
		assertTrue(solo.searchText("商品规格："));
		assertTrue(solo.waitForView(solo.getView(AddShopPage.edit_sku_name)));
		assertTrue(solo.searchText("服务时长："));
		assertTrue(solo.waitForView(solo.getView(AddShopPage.edit_sku_duration)));
		assertTrue(solo.waitForView(solo.getView(AddShopPage.label_minute)));
		assertTrue(solo.searchText("商品价格："));
		assertTrue(solo.waitForView(solo.getView(AddShopPage.edit_sku_price)));
		assertTrue(solo.waitForView(solo.getView(AddShopPage.label_yuan)));
		assertTrue(solo.searchText("商品数量："));
		assertTrue(solo.waitForView(solo.getView(AddShopPage.edit_sku_repertory)));
		assertTrue(solo.waitForView(solo.getView(AddShopPage.label_jian)));
		Log.d("Robotium", "name_price_repertory check");
		//检验添加规格按钮存在
		assertTrue(solo.waitForView(solo.getView(AddShopPage.add_sku)));
		Log.d("Robotium", "check add");
		
		//图片及图片描述
		assertTrue(solo.waitForView(solo.getView(AddShopPage.img_empty)));
		assertTrue(solo.waitForView(solo.getView(AddShopPage.edit_comment)));
		Log.d("Robotium", "pic check");
		//添加商品图片按钮
		assertTrue(solo.waitForView(solo.getView(AddShopPage.add_img)));
		Log.d("Robotium", "check add_content");

	}
}

