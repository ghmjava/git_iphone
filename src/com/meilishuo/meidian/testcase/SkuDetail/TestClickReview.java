package com.meilishuo.meidian.testcase.SkuDetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.GoodsDetailPage;
import com.meilishuo.meidian.page.MiaoOrderListPage;
import com.meilishuo.meidian.page.ReviewDetailPage;

/**
 * Created by MLS on 15/9/21.
 */
public class TestClickReview extends BaseClass {
    @Discover
    public void testClickReview() {
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
        solo.sleep(3000);
        solo.scrollUp();
        solo.sleep(1000);
        solo.scrollUp();
        solo.sleep(1000);

        //点击购买评价
        GoodsDetailPage.click_Review(solo);
        solo.sleep(3000);

        //启动晒单详情页
        ReviewDetailPage.get_reviewdetail(solo);
        Log.d(TAG, "启动晒单详情页");
        solo.sleep(1000);
    }
}
