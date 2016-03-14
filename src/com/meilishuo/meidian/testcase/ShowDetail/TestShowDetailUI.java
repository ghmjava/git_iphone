package com.meilishuo.meidian.testcase.ShowDetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.ShowDetailPage;
import com.meilishuo.meidian.page.UserShowListPage;

/**
 * Created by MLS on 15/9/28.
 */
public class TestShowDetailUI extends BaseClass {
    @Discover
    public void testShowDetailUI() {
        init();
        solo.scrollToBottom();
        solo.sleep(1000);
        //点击全部订单
        solo.clickOnText("^我的发布$");
        Log.d(TAG, "点击我的发布");
        solo.sleep(1000);

        //启动我的发布页面
        UserShowListPage.get_UserShowList(solo);
        Log.d(TAG, "启动我的发布页面");
        solo.sleep(3000);

        //点击发布
        UserShowListPage.click_Show(solo,0);
        solo.sleep(1000);

        //进入动态详情页
        ShowDetailPage.get_showdetail(solo);
        Log.d(TAG, "启动动态详情页");
        solo.sleep(3000);

        //标题、返回按钮、喜欢icon、分享icon确认
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.tv_head_title)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.tv_head_left)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.iv_head_right)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.iv_head_right_2)));
        Log.d(TAG, "标题、返回按钮、喜欢icon、分享iconUI确认");
        solo.sleep(1000);

        //用户头像、用户名、用户身份、图片、描述、日期、喜欢flow、最新评论、暂无评论按钮UI确认
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.avatar)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.user_name)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.user_title)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.image)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.desc)));
        solo.scrollToBottom();
        solo.sleep(1000);
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.creat_time)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.follow_bar_grid_view)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.comment_count)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.action_button)));
        Log.d(TAG, "用户头像、用户名、用户身份、图片、描述、日期、喜欢flow、最新评论、暂无评论按钮UI确认");
        solo.sleep(1000);






    }
}
