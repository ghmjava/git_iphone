package com.meilishuo.meidian.testcase.goods;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.CommonMethod;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.GoodsPage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;

@SuppressWarnings("unchecked")
public class TestGoodsList extends BaseClass{

	@Discover
	public void testGoodsList(){

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
		
		//检验标题、返回按钮、添加按钮
		assertTrue(CommonMethod.get_title(solo).equals("我的商品"));
		assertTrue(solo.waitForView(solo.getView(GoodsPage.txt_left)));
		assertTrue(solo.waitForView(solo.getView(GoodsPage.txt_right)));
		Log.d("Robotium", "check title_left_right wait");
		
		//检验添加时间、销量、库存、已售完
		assertTrue(solo.searchText("^添加时间$"));
		assertTrue(solo.searchText("^销量$"));
		assertTrue(solo.searchText("^库存$"));
		assertTrue(solo.searchText("^未通过审核$"));
		Log.d(TAG, "check text wait");

		
		//检验 商品图片、名称、上架时间、价格、销量、库存、审核不通过时的原因
		assertTrue(solo.waitForView(solo.getView(GoodsPage.image)));
		assertTrue(solo.waitForView(solo.getView(GoodsPage.tv_title)));
		assertTrue(solo.waitForView(solo.getView(GoodsPage.tv_date)));
		assertTrue(solo.waitForView(solo.getView(GoodsPage.tv_price)));
		assertTrue(solo.waitForView(solo.getView(GoodsPage.tv_sales)));
		assertTrue(solo.waitForView(solo.getView(GoodsPage.tv_stock)));
		assertTrue(solo.waitForView(solo.getView(GoodsPage.ic_arrow)));
		assertTrue(solo.waitForView(solo.getView(GoodsPage.tv_check_state_reason)));

		//编辑商品按钮、预览商品、商品二维码、分享按钮
		assertTrue(solo.waitForView(solo.getView(GoodsPage.edit)));
		assertTrue(solo.waitForView(solo.getView(GoodsPage.preview)));
		assertTrue(solo.waitForView(solo.getView(GoodsPage.qrcode)));
		assertTrue(solo.waitForView(solo.getView(GoodsPage.share)));


		//点击“时间”
		solo.clickOnText("^添加时间$");
		Log.d("Robotium", "click time");
		solo.sleep(3000);
		//向下滑动屏幕
		CommonMethod.down_screen(solo);
		solo.sleep(1000);
		//向上滑动屏幕
		CommonMethod.up_screen(solo);
		solo.sleep(3000);
		
		//点击销量
		solo.clickOnText("^销量$");
		Log.d("Robotium", "click sales");
	    solo.sleep(3000);
		
		//点击库存
		solo.clickOnText("^库存$");
		Log.d("Robotium", "click wait");
		solo.sleep(3000);
		
		//点击已售完
		solo.clickOnText("^未通过审核$");
		Log.d("Robotium", "click wait");
		solo.sleep(3000);
		//
		solo.clickOnText("^添加时间$");
		Log.d("Robotium", "click wait");
		solo.sleep(3000);


		
		
	}
}

