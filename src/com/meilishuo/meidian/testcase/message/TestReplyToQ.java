package com.meilishuo.meidian.testcase.message;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MessagePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.QuestionDetailPage;

/**
 * Created by MLS on 15/8/27.
 */
public class TestReplyToQ extends BaseClass {
    @Discover
    public void testReplyToQ(){
        init();
        //点击消息
        MiaoHomePage.getClickMessage(solo);
        Log.d(TAG, "点击消息");
        solo.sleep(3000);
        //启动我的消息页面
        assertTrue("Activity\"MessageActivity\"is not start", MessagePage.get_messagepage(solo));
        Log.d(TAG, "启动消息页面");
        solo.sleep(1000);

        //点击评论
        solo.clickOnText("^评论$");
        Log.d(TAG, "点击评论");
        solo.sleep(1000);

        //点击被评论的问题
        solo.clickOnView(solo.getView(MessagePage.reply_to,2));
        Log.d(TAG, "点击被喜欢的问题");
        solo.sleep(2000);

        //启动问题详情页
        assertTrue("Activity\"QuestionDetailActivity\"is not start", QuestionDetailPage.get_questionDetail(solo));
        Log.d(TAG,"启动问题详情页");
        solo.sleep(2000);

        //点击返回至消息页
        solo.clickOnView(solo.getView(QuestionDetailPage.tv_head_left));
        Log.d(TAG,"点击返回");
        solo.sleep(2000);

        //启动消息页
        assertTrue("Activity\"MessageActivity\"is not start", MessagePage.get_messagepage(solo));
        Log.d(TAG,"启动消息页");
        solo.sleep(2000);

    }
}
