package com.meilishuo.meidian.testcase.reviewdetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.DiscoverPage;
import com.meilishuo.meidian.page.ReviewDetailPage;

/**
 * Created by MLS on 15/9/29.
 */
public class TestClickDeleteComment extends BaseClass {
    @Discover
    public void testClickLike() {
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

        solo.scrollToBottom();
        solo.sleep(1000);

        //点击删除评论按钮
        ReviewDetailPage.click_delete(solo);
        solo.sleep(2000);
    }
}
