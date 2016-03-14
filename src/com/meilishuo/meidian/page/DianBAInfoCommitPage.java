package com.meilishuo.meidian.page;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/8/28.
 */
public class DianBAInfoCommitPage {
    public static String TAG="Robotium";
    public static String Activity="UserInfoCommitActivity";
    public static String tv_head_title="tv_head_title";
    public static String tv_head_left="tv_head_left"; //返回按钮
    public static String tv_head_right="tv_head_right";//保存按钮
    public static String content="content";//内容

    // 判断是个人简介页
    public static boolean get_bainfo(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

    //点击返回
    public static void getClickLeft(Solo solo){
        Log.d(TAG, "点击返回按钮");
        solo.clickOnView(solo.getView(tv_head_left));
    }

    //点击保存按钮
    public static void getClickRight(Solo solo){
        Log.d(TAG, "点击保存按钮");
        solo.clickOnView(solo.getView(tv_head_right));
    }



}
