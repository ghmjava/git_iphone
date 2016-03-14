package com.meilishuo.meidian.testcase.SkuDetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.page.GoodsDetailPage;
import com.meilishuo.meidian.page.MiaoOrderListPage;

/**
 * Created by MLS on 15/9/21.
 */
public class TestClickShare extends BaseClass {
    //@Discover
    public void testClickLike() {
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

        //点击分享icon
        GoodsDetailPage.clickShare(solo);
        solo.sleep(2000);

        //出现选择分享方式的弹窗
        assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.title)));
        assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.weixin_friend)));
        assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.weixin_friend_circle)));
        assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.sina)));
        assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.qzone)));
        assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.qq)));
        assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.cancel)));
        Log.d(TAG, "弹窗UI确定");
        solo.sleep(1000);

        //点击取消按钮
        GoodsDetailPage.click_Cancel(solo);
        solo.sleep(1000);









    }
}
