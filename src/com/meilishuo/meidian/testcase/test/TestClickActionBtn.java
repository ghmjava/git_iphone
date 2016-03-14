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
public class TestClickActionBtn extends BaseClass{
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

        //点击确认消费码
        OrderPage.click_HeadRight(solo);
        solo.sleep(2000);

        //出现输入数字、扫一扫、取消弹窗
        assertTrue(solo.waitForView(solo.getView(OrderPage.tv_input)));
        assertTrue(solo.waitForView(solo.getView(OrderPage.tv_scan)));
        assertTrue(solo.waitForView(solo.getView(OrderPage.tv_cancel)));
        Log.d(TAG, "输入数字、扫一扫、取消弹窗UI确定");
        solo.sleep(1000);
        //点击输入数字
        OrderPage.click_HeadInput(solo);
        Log.d(TAG," 点击输入数字");
        solo.sleep(1000);

        //出现输入订单消费码的弹窗
        assertTrue(solo.waitForView(solo.getView(OrderPage.tv_input)));
        assertTrue(solo.waitForView(solo.getView(OrderPage.button_cancel)));
        assertTrue(solo.waitForView(solo.getView(OrderPage.button_ok)));
        assertTrue(solo.searchText("请您的顾客出示订单消费码"));
        Log.d(TAG,"输入订单消费码的弹窗UI确定");
        solo.sleep(1000);

        //点击取消
        OrderPage.clickCancel1(solo);
        solo.sleep(1000);


        //点击确认消费码按钮
        OrderPage.click_HeadRight(solo);
        solo.sleep(1000);

        //点击取消
        OrderPage.click_Cancel(solo);
        solo.sleep(1000);
    }
}
