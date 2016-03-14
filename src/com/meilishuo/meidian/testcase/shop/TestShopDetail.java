package com.meilishuo.meidian.testcase.shop;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.ShopPage;

//import com.meilisuo.meidian.init.BaseClass;

@SuppressWarnings("unchecked")
public class TestShopDetail extends BaseClass{

	//@TestCase
	public void testShopDetail(){
		init();
		//点击我的美店
		MiaoHomePage.getClickMeidian(solo);
		Log.d(TAG,"点击我的美店");
		solo.sleep(2000);


		//点击店铺资料
		solo.clickOnView(solo.getView(HomePage.view_profile));
		Log.d(TAG, "点击资料管理");
		solo.sleep(3000);

		//等待ShopDetailSettingActivity启动
		assertTrue("Activity\"ShopDetailSettingActivity\"is not start", solo.waitForActivity(ShopPage.ShopDetailSettingActivity));
		solo.sleep(1000);

		//标题确认、返回按钮确认
		assertTrue(solo.waitForView(solo.getView(ShopPage.tv_head_title)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.tv_head_left)));
		Log.d(TAG, "标题、返回按钮确认");
		solo.sleep(1000);

		//封面、个人简介、擅长、服务商圈确认

		assertTrue(solo.waitForView(solo.getView(ShopPage.ba_cover)));
		assertTrue(solo.searchText("封面"));
		assertTrue(solo.waitForView(solo.getView(ShopPage.cover_desc)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.cover_right_arrow)));

		assertTrue(solo.waitForView(solo.getView(ShopPage.layout_instro)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.tv_instro)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.et_instro)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.instro_right_arrow)));

		//assertTrue(solo.waitForView(solo.getView(ShopPage.good_at_layout)));
		//assertTrue(solo.waitForView(solo.getView(ShopPage.et_good_at)));
		//assertTrue(solo.waitForView(solo.getView(ShopPage.tv_good_at)));
		//assertTrue(solo.waitForView(solo.getView(ShopPage.good_at_right_arrow)));

		assertTrue(solo.waitForView(solo.getView(ShopPage.sevice_area_layout)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.tv_sevice_area)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.et_sevice_area)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.sevice_area_right_arrow)));
		Log.d(TAG,"封面、个人简介、擅长、服务商圈确认");
		solo.sleep(1000);

		//身份、所在门店、详细地址、联系电话确认
		assertTrue(solo.waitForView(solo.getView(ShopPage.role_layout)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.tv_role)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.et_role)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.role_right_arrow)));

		assertTrue(solo.waitForView(solo.getView(ShopPage.layout_shop)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.tv_shop_label)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.et_shop_name)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.shop_name_right_arrow)));

		assertTrue(solo.waitForView(solo.getView(ShopPage.layout_shop_addr)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.tv_shop_addr_label)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.et_shop_addr)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.shop_addr_right_arrow)));

		assertTrue(solo.waitForView(solo.getView(ShopPage.my_phone_layout)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.tv_phone_label)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.et_phone)));
		assertTrue(solo.waitForView(solo.getView(ShopPage.et_phone_right_arrow)));
		Log.d(TAG,"身份、所在门店、详细地址、联系电话确认");
		solo.sleep(1000);
	   
}
}
