package com.meilishuo.meidian.testcase.ShowDetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.DiscoverPage;
import com.meilishuo.meidian.page.ShowDetailPage;

/**
 * Created by MLS on 15/9/28.
 */
public class TestNologinClickShare extends BaseClass {
    @Discover
    public void testClickNologinClickShare() {
        init1();

        //点击发现
        solo.clickOnText("^发现$");
        Log.d(TAG, "点击发现");
        solo.sleep(2000);

        //点击人气达人
        solo.clickOnText("^人气达人$");
        Log.d(TAG, "点击人气达人");
        solo.sleep(2000);

        //点击show
        DiscoverPage.getClickflow_layout(solo, 0);
        Log.d(TAG, "点击单个show");
        solo.sleep(2000);

        //进入动态详情页
        ShowDetailPage.get_showdetail(solo);
        Log.d(TAG, "启动动态详情页");
        solo.sleep(3000);

        //点击分享icon
        ShowDetailPage.click_share(solo);
        solo.sleep(2000);


        //出现选择分享方式的弹窗
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.title)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.weixin_friend)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.weixin_friend_circle)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.sina)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.qzone)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.qq)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.cancel)));
        Log.d(TAG, "弹窗UI确定");
        solo.sleep(1000);

        //点击取消按钮
        ShowDetailPage.click_Cancel(solo);
        solo.sleep(1000);






    }
}
