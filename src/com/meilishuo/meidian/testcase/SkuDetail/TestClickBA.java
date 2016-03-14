package com.meilishuo.meidian.testcase.SkuDetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.BAHomePage;
import com.meilishuo.meidian.page.GoodsDetailPage;
import com.meilishuo.meidian.page.MiaoOrderListPage;

/**
 * Created by MLS on 15/9/21.
 */
public class TestClickBA extends BaseClass {
    @Discover
    public void testClickBA() {
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

        //点击BA头像
        GoodsDetailPage.clickBA(solo);

        solo.sleep(3000);

       //启动BA个人页
        BAHomePage.get_BAHome(solo);
        Log.d(TAG,"启动BA个人页");
        solo.sleep(2000);








    }
}
