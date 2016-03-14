package com.meilishuo.meidian.testcase.SkuDetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.page.*;

/**
 * Created by MLS on 15/9/28.
 */
public class TestNoLoginClickBuy extends BaseClass{
    //@Discover
    public void testNoLoginClickBuy() {
        init1();
        //点击发现
        solo.clickOnText("^发现$");
        Log.d(TAG, "点击发现");
        solo.sleep(1000);

        // 点击晒单精选
        solo.clickOnText("^晒单精选$");
        Log.d(TAG, "点击晒单精选");
        solo.sleep(2000);

        //点击晒单
        DiscoverPage.getClickflow_layout(solo, 0);
        Log.d(TAG, "点击晒单");
        solo.sleep(2000);

        //进入晒单详情页
        ReviewDetailPage.get_reviewdetail(solo);
        Log.d(TAG, "进入晒单详情页");
        solo.sleep(2000);

        solo.scrollToBottom();
        solo.sleep(1000);

        //点击商品
        ReviewDetailPage.clickGoods(solo);
        Log.d(TAG, "点击商品");
        solo.sleep(2000);

        //进入商品详情页
        GoodsDetailPage.get_goodsdetail(solo);
        Log.d(TAG, "进入商品详情页");
        solo.scrollToBottom();
        solo.sleep(2000);

        //点击立即购买按钮
        GoodsDetailPage.click_buy(solo);
        Log.d(TAG, "点击立即购买按钮");
        solo.sleep(2000);


        //启动登录页面
        LoginPage.get_login(solo);
        Log.d(TAG, "启动登录页面");
        solo.sleep(2000);

        login2("13820276123","123456");
        solo.sleep(1000);

        //点击立即购买按钮
        GoodsDetailPage.click_buy(solo);
        Log.d(TAG, "点击立即购买按钮");
        solo.sleep(2000);

        //点击规格
        solo.clickOnView(solo.getView(GoodsDetailPage.item_text, 0));

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
