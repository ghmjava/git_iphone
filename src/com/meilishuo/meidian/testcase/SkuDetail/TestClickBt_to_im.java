package com.meilishuo.meidian.testcase.SkuDetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.GoodsDetailPage;
import com.meilishuo.meidian.page.IMo2oPage;
import com.meilishuo.meidian.page.MiaoOrderListPage;

/**
 * Created by MLS on 15/9/21.
 */
public class TestClickBt_to_im extends BaseClass {
    @Discover
    public void testClickBt_to_im() {
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

        //点击私聊按钮
        GoodsDetailPage.click_btn_to_im(solo);
        Log.d(TAG, "点击私聊按钮");
        solo.sleep(2000);

        //进入私聊页面
        IMo2oPage.get_IMo2opage(solo);
        Log.d(TAG, "进入私聊页面");
        solo.sleep(2000);



    }
}
