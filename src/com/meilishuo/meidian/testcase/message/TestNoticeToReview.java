package com.meilishuo.meidian.testcase.message;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MessagePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.RatingPage;

/**
 * Created by MLS on 15/8/27.
 */
public class TestNoticeToReview extends BaseClass{
    @Discover
    public void testNotice(){
        init();
        //点击消息
        MiaoHomePage.getClickMessage(solo);
        Log.d(TAG, "点击消息");
        solo.sleep(3000);
        //启动消息页面
        assertTrue("Activity\"feature.home.MessageActivity\"is not start", MessagePage.get_messagepage(solo));
        Log.d(TAG, "启动消息页面");
        solo.sleep(1000);

        //点击通知
        solo.clickOnText("^通知$");
        Log.d(TAG, "点击通知");
        solo.sleep(1000);

        //点击通知
        solo.clickOnView(solo.getView(MessagePage.text_reply,0));
        Log.d(TAG,"点击第二个通知");

        //进入待评价页面
        assertTrue("Activity\"RatingActivity\"is not start", RatingPage.get_rating(solo));
        Log.d(TAG, "启动待评价页面");
        solo.sleep(1000);

        //晒单评价页点击返回
        solo.clickOnView(solo.getView(RatingPage.tv_head_left));
        solo.sleep(1000);

    }
}
