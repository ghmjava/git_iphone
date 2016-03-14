package com.meilishuo.meidian.testcase.reviewdetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.DiscoverPage;
import com.meilishuo.meidian.page.ReviewDetailPage;

/**
 * Created by MLS on 15/9/29.
 */
public class TestClickShare extends BaseClass {
    @Discover
    public void testClickShare() {
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
        DiscoverPage.getClickflow_layout(solo, 0);
        solo.sleep(1000);

        //进入晒单详情页
        ReviewDetailPage.get_reviewdetail(solo);
        Log.d(TAG, "启动晒单详情页");
        solo.sleep(6000);

        //点击分享
        ReviewDetailPage.clickShare(solo);
        solo.sleep(2000);

        //出现选择分享方式的弹窗
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.title)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.weixin_friend)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.weixin_friend_circle)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.sina)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.qzone)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.qq)));
        assertTrue(solo.waitForView(solo.getView(ReviewDetailPage.cancel)));
        Log.d(TAG, "弹窗UI确定");
        solo.sleep(1000);

        //点击取消按钮
        ReviewDetailPage.click_Cancel(solo);
        solo.sleep(1000);








    }
}
