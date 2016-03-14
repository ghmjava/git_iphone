package com.meilishuo.meidian.testcase.ShowDetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.CommentListPage;
import com.meilishuo.meidian.page.DiscoverPage;
import com.meilishuo.meidian.page.LoginPage;
import com.meilishuo.meidian.page.ShowDetailPage;

/**
 * Created by MLS on 15/9/28.
 */
public class TestNologinClickComment extends BaseClass {
    @Discover
    public void testClickComment() {
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

        solo.scrollToBottom();
        solo.sleep(1000);

        //点击我要评论icon
        ShowDetailPage.click_action(solo);
        solo.sleep(2000);



        //启动全部评论页
        CommentListPage.get_reviewList(solo);
        Log.d(TAG, "启动全部评论页");
        solo.sleep(1000);

        //输入评论
        CommentListPage.getClickEditReply(solo);
        solo.sleep(1000);

        //启动登录页面
        LoginPage.get_login(solo);
        Log.d(TAG, "启动登录页面");
        solo.sleep(2000);

        login2("13820276123","123456");
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

        //启动动态详情页
        ShowDetailPage.get_showdetail(solo);
        Log.d(TAG, "启动动态详情页");
        solo.sleep(2000);

        //最新评论存在
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.reply_icon)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.reply_nickname)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.text_reply)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.comment_time)));
        assertTrue(solo.waitForView(solo.getView(ShowDetailPage.delete)));
        Log.d(TAG, "最新评论存在");
        solo.sleep(1000);






    }
}
