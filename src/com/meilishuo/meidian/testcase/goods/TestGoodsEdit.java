package com.meilishuo.meidian.testcase.goods;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.CommonMethod;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.AddShopPage;
import com.meilishuo.meidian.page.GoodsPage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;

@SuppressWarnings("unchecked")
public class TestGoodsEdit extends BaseClass{

	@Discover
	public void testGoodsList(){
		init();

		//点击我的美店
		MiaoHomePage.getClickMeidian(solo);
		solo.sleep(2000);

		//点击我的商品
		HomePage.getClickGoods(solo);
		solo.sleep(3000);

		//启动我的商品页面
		GoodsPage.get_GoodsList(solo);
		Log.d(TAG, "启动我的商品页面");
		solo.sleep(2000);

	    //点击编辑
		solo.clickOnView(solo.getView(GoodsPage.edit));
		solo.sleep(2000);
		//进入编辑商品页面 
		assertTrue("Activity \"GoosAddNewActivity\" is not started.", solo.waitForActivity(AddShopPage.Activity, 30000));
		solo.sleep(2000);
		
		//检验标题、返回、提交按钮
		assertTrue(CommonMethod.get_title(solo).equals("编辑商品"));
		assertTrue(solo.waitForView(solo.getView(AddShopPage.tv_head_left)));
		assertTrue(solo.waitForView(solo.getView(AddShopPage.tv_head_right)));
		
		//搜索框
		assertTrue(solo.waitForView(solo.getView(AddShopPage.search_box)));
		
		//商品名称
		assertTrue(solo.searchText("商品名称："));
		assertTrue(solo.waitForView(solo.getView(AddShopPage.edit_goods_title)));

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
		//图片及描述
		assertTrue(solo.waitForView(solo.getView(AddShopPage.pic)));

		//向下滑动
		solo.scrollToBottom();

		assertTrue(solo.waitForView(solo.getView(AddShopPage.edit_desc)));
		
		//添加图片按钮
		assertTrue(solo.waitForView(solo.getView(AddShopPage.add_img)));

		
		//删除图片按钮
		assertTrue(solo.waitForView(solo.getView(AddShopPage.del_pic)));

		
			}
}
