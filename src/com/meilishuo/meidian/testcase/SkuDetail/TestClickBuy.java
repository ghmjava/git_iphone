package com.meilishuo.meidian.testcase.SkuDetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.GoodsDetailPage;
import com.meilishuo.meidian.page.MiaoOrderListPage;
import com.meilishuo.meidian.page.OrderConfirmPage;

/**
 * Created by MLS on 15/9/21.
 */
public class TestClickBuy extends BaseClass {
    @Discover
    public void testClickBuy() {
        init();
        //点击全部订单
        solo.clickOnText("^全部订单$");
        Log.d(TAG, "点击全部订单");
        solo.sleep(1000);

        // 点击商品
        MiaoOrderListPage.getClickSku(solo, 0);
        Log.d(TAG, "点击商品");
        solo.sleep(3000);

        //进入商品详情页
        GoodsDetailPage.get_goodsdetail(solo);
        Log.d(TAG, "进入商品详情页");
        solo.scrollToBottom();
        solo.sleep(2000);

        //点击立即购买按钮
        GoodsDetailPage.click_buy(solo);
        Log.d(TAG, "点击立即购买按钮");
        solo.sleep(2000);

        //出现立即购买弹窗
        assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.goods_pic)));
        assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.goods_title)));
        assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.goods_price)));
        assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.service_mode)));
        assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.color_text)));
        assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.item_text)));
        assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.service_time)));
        assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.btn_ok)));
        Log.d(TAG, "弹窗展示内容正确");
        solo.sleep(2000);

        //点击规格
        solo.clickOnView(solo.getView(GoodsDetailPage.item_text,0));
        Log.d(TAG, "点击规格");
        solo.sleep(2000);

        //点击确定按钮
        GoodsDetailPage.clickOK(solo);
        solo.sleep(3000);

        //启动订单确认页
        OrderConfirmPage.get_OredrConfirm(solo);
        Log.d(TAG, "启动订单确认页");
        solo.sleep(2000);




 }
}
