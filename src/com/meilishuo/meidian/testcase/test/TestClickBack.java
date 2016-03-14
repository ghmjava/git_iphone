package com.meilishuo.meidian.testcase.test;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.OrderPage;

/**
 * Created by MLS on 15/9/5.
 */
public class TestClickBack extends BaseClass {
    @Discover
    public void testClickActionBtn() {
        //初始化
        init();
        //点击我的美店
        MiaoHomePage.getClickMeidian(solo);
        Log.d(TAG, "点击我的美店");
        solo.sleep(2000);


        //点击订单管理
        HomePage.getClickOrder(solo);
        Log.d(TAG, "点击订单管理");
        solo.sleep(2000);

        //等待订单管理页面启动
        OrderPage.get_OrderList(solo);
        Log.d(TAG, "启动订单管理页面");

        //点击返回
        OrderPage.click_HeadLeft(solo);
        Log.d(TAG,"点击返回");

        //启动美店主页
        HomePage.get_home(solo);
        Log.d(TAG,"启动美店主页");
        solo.sleep(2000);


    }
}