package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/21.
 */
public class CommentListPage {
    public static String TAG="Robotium";
    public static String Activity="CommentListActivity";
    public static String tv_head_title="tv_head_title";
    public static String tv_head_left="tv_head_left";
    public static String edit_reply="edit_reply";//评论框
    public static String btn_send="btn_send";//发送按钮

    // 判断是全部评论页
    public static boolean get_reviewList(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

    //点击返回
    public static void getClickReturn(Solo solo){
        Log.d(TAG, "点击返回按钮");
        solo.clickOnView(solo.getView(tv_head_left));
    }

    //点击发送按钮
    public static void getClickSend(Solo solo){
        Log.d(TAG, "点击发送按钮");
        solo.clickOnView(solo.getView(btn_send));
    }


    //点击评论框
    public static void getClickEditReply(Solo solo){
        Log.d(TAG, "点击评论框");
        solo.clickOnView(solo.getView(edit_reply));
    }
}
