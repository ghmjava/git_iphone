package com.meilishuo.meidian.testcase.test;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.OrderDetailPage;
import com.meilishuo.meidian.page.OrderPage;

/**
 * Created by MLS on 15/9/2.
 */
public class TestOrderDetail3 extends BaseClass {

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

        //点击未付款
        solo.clickOnText("未付款");
        Log.d(TAG,"点击未付款");
        solo.sleep(1000);

        //点击订单
        solo.clickOnText("dgv");
        solo.sleep(2000);

        //启动订单详情页
        OrderDetailPage.get_orderdetail(solo);
        Log.d(TAG, "启动订单详情页面");

        //标题、返回按钮确认
        assertTrue(solo.waitForView(solo.getView(OrderDetailPage.tv_head_left)));
        assertTrue(solo.waitForView(solo.getView(OrderDetailPage.tv_head_title)));
        Log.d(TAG,"标题、返回按钮UI确认");
        solo.sleep(1000);


        //商品图片、名称、规格、数量、价格、方式
        assertTrue(solo.waitForView(solo.getView(OrderDetailPage.order_goods_pic)));
        assertTrue(solo.waitForView(solo.getView(OrderDetailPage.tv_goods_title)));
        assertTrue(solo.waitForView(solo.getView(OrderDetailPage.item_order_model)));
        assertTrue(solo.waitForView(solo.getView(OrderDetailPage.item_order_num)));
        assertTrue(solo.waitForView(solo.getView(OrderDetailPage.item_order_price)));
        assertTrue(solo.waitForView(solo.getView(OrderDetailPage.item_order_way)));
        Log.d(TAG,"商品图片、名称、规格、数量、价格、方式UI确认");
        solo.sleep(1000);

        //订单编号、付款时间、订单备注、会员特权使用、优惠券使用、合计
        assertTrue(solo.waitForView(solo.getView(OrderDetailPage.item_detai_order_id)));
        assertTrue(solo.waitForView(solo.getView(OrderDetailPage.item_detai_order_other)));
        assertTrue(solo.waitForView(solo.getView(OrderDetailPage.item_detai_order_vip_price)));
        assertTrue(solo.waitForView(solo.getView(OrderDetailPage.item_detai_order_coupon_desc)));
        assertTrue(solo.waitForView(solo.getView(OrderDetailPage.order_total)));
        Log.d(TAG,"订单编号、订单备注、会员特权使用、优惠券使用、合计UI确认");
        solo.sleep(1000);

        //点击返回
        OrderDetailPage.getBack(solo);
        solo.sleep(1000);

    }
}
