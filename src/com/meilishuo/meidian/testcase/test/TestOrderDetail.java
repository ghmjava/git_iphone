package com.meilishuo.meidian.testcase.test;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.OrderDetailPage;
import com.meilishuo.meidian.page.OrderPage;

/**
 * Created by MLS on 15/9/2.
 */
public class TestOrderDetail extends BaseClass {
    @Discover
    public void testOrderDetail(){
        //初始化
        init2();
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

        //点击订单
        OrderPage.click_Order(solo,0);
        solo.sleep(2000);

        //启动订单详情页
        OrderDetailPage.get_orderdetail(solo);
        Log.d(TAG, "启动订单详情页面");

        //点击返回
        OrderDetailPage.getBack(solo);
        solo.sleep(2000);

        //等待订单管理页面启动
        OrderPage.get_OrderList(solo);
        Log.d(TAG, "启动订单管理页面");



    }

}
