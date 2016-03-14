package com.meilishuo.meidian.testcase.SkuDetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.CommentListPage;
import com.meilishuo.meidian.page.GoodsDetailPage;
import com.meilishuo.meidian.page.MiaoOrderListPage;

/**
 * Created by MLS on 15/9/21.
 */
public class TestClickDeleteComment extends BaseClass{

    @Discover
    public void testClickComment() {
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
        solo.scrollToBottom();
        //点击我要评论
        GoodsDetailPage.click_comment(solo);
        solo.sleep(3000);

        //启动全部评论页
        CommentListPage.get_reviewList(solo);
        Log.d(TAG, "启动全部评论页");
        solo.sleep(1000);

        //输入评论
        solo.enterText(0,"技术不错幺很喜欢");
        solo.sleep(1000);

        //点击发送按钮
        CommentListPage.getClickSend(solo);
        Log.d(TAG, "发送评论成功");
        solo.sleep(1000);

        // 点击返回按钮
        CommentListPage.getClickReturn(solo);
        Log.d(TAG, "点击返回按钮");
        solo.sleep(1000);

        //启动sku详情页
        GoodsDetailPage.get_goodsdetail(solo);
        Log.d(TAG, "启动sku详情页");
        solo.sleep(1000);
        //点击删除按钮
        GoodsDetailPage.click_delete(solo);
        Log.d(TAG, "点击删除");
        solo.sleep(1000);

    }
}
