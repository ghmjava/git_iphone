package com.meilishuo.meidian.testcase.shop;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.CommonMethod;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.GoodAt_ServicePage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.ShopPage;

/**
 * Created by MLS on 15/8/28.
 */
public class TestAddService extends BaseClass {
    @Discover
    public void testAddGoodsAt() {
        init();
        //点击我的美店
        MiaoHomePage.getClickMeidian(solo);
        Log.d(TAG, "点击我的美店");
        solo.sleep(2000);


        //点击店铺资料
        solo.clickOnView(solo.getView(HomePage.view_profile));
        Log.d(TAG, "点击店铺资料");
        solo.sleep(2000);

        //等待ShopDetailSettingActivity启动
        ShopPage.get_shopdetail(solo);
        Log.d(TAG, "启动店铺资料页面");

        //点击服务商圈
        solo.clickOnView(solo.getView(ShopPage.sevice_area_layout));
        Log.d(TAG, "点击服务商圈");
        solo.sleep(1000);

        //启动服务商圈页
        GoodAt_ServicePage.get_GoodAt_Service(solo);
        Log.d(TAG, "启动服务商圈页");

        //点击东城区
        GoodAt_ServicePage.getClickParent(solo,3);
        solo.sleep(2000);

        //child显示正确
        assertTrue(CommonMethod.get_text(solo, GoodAt_ServicePage.child_text, 0).equals("全部"));
        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,1).equals("王府井/东单"));
        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,2).equals("崇文门"));
        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,3).equals("东直门"));
        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.child_text,11).equals("和平里"));
        Log.d(TAG,"child显示正确");
        solo.sleep(1000);


        //点击前门
        GoodAt_ServicePage.getClickChild(solo,7);
        solo.sleep(1000);

        //前门被选择
        assertTrue(CommonMethod.get_text(solo,GoodAt_ServicePage.text,2).equals("前门"));
        Log.d(TAG,"前门被选");
        solo.sleep(1000);
        //点击保存
        GoodAt_ServicePage.getClickRight(solo);
        solo.sleep(1000);
        //启动Home页
        ShopPage.get_shopdetail(solo);
        solo.sleep(1000);


    }
}
