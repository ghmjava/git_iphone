package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/17.
 */
public class UserNameCommitPage {
    public static String TAG="Robotium";
    public static String Activity="UserInfoCommitActivity";
    public static String tv_head_left="tv_head_left";
    public static String tv_head_title="tv_head_title";
    public static String tv_head_right="tv_head_right";
    public static String content="content";

    // 判断是否为用户姓名编辑页
    public static boolean get_userNameCommit(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

    //点击返回按钮
    public static void clickGoBack(Solo solo){
        Log.d(TAG, "点击返回按钮");
        solo.clickOnView(solo.getView(tv_head_left));
    }

    //点击保存按钮
    public static void clickSave(Solo solo){
        Log.d(TAG, "点击保存按钮");
        solo.clickOnView(solo.getView(tv_head_right));
    }
}
