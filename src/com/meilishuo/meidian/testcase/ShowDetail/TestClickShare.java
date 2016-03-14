package com.meilishuo.meidian.testcase.ShowDetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.ShowDetailPage;
import com.meilishuo.meidian.page.UserShowListPage;

/**
 * Created by MLS on 15/9/28.
 */
public class TestClickShare extends BaseClass {
    @Discover
    public void testClickShare() {
        init();
        solo.scrollToBottom();
        solo.sleep(1000);
        //点击我的发布
        solo.clickOnText("^我的发布$");
        Log.d(TAG, "点击我的发布");
        solo.sleep(1000);

        //启动我的发布页面
        UserShowListPage.get_UserShowList(solo);
        Log.d(TAG, "启动我的发布页面");
        solo.sleep(3000);

        //点击发布
        UserShowListPage.click_Show(solo, 0);
        solo.sleep(1000);

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




