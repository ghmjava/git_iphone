package com.meilishuo.meidian.testcase.reviewdetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.DiscoverPage;
import com.meilishuo.meidian.page.ReviewDetailPage;

/**
 * Created by MLS on 15/9/28.
 */
public class TestReviewDetailUI extends BaseClass {
    @Discover
    public void testReviewDetailUI() {
        init();
        //点击发现
        solo.clickOnText("^发现$");
        Log.d(TAG, "点击发现");
        solo.sleep(1000);

        //点击晒单精选
        solo.clickOnText("^晒单精选$");
        Log.d(TAG, "点击晒单精选");
        solo.sleep(3000);

        //点击晒单
        DiscoverPage.getClickflow_layout(solo,0);
        solo.sleep(1000);

        //进入晒单详情页
        ReviewDetailPage.get_reviewdetail(solo);
        Log.d(TAG, "启动晒单详情页");
        solo.sleep(6000);

        //标题、返回按钮、喜欢icon、分享icon确认
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.tv_head_title)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.tv_head_left)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.iv_head_right)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.iv_head_right_2)));
        Log.d(TAG, "标题、返回按钮、喜欢icon、分享iconUI确认");
        solo.sleep(1000);

        //用户头像、用户名、图片、描述、日期、喜欢flowUI确认
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.avatar)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.user_name)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.image)));
        solo.scrollDown();
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.desc)));
        solo.scrollToBottom();
        solo.sleep(1000);
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.create_time)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.location)));

        //商品图片、商品标题、商品规格、商品价格、会员盟标、评分、BA、最新评论、暂无评论按钮
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.goods_image)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.goods_name)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.goods_sku)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.discount_price)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.vip_goods)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.origin_price)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.score_seal_image)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.seller)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.follow_bar_grid_view)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.comment_count)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.action_button)));
        Log.d(TAG, "商品图片、商品标题、商品规格、商品价格、会员盟标、评分、BA、最新评论、暂无评论按钮UI确认");
        solo.sleep(1000);






    }
}
