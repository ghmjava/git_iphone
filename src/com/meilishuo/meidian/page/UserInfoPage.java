package com.meilishuo.meidian.page;

import android.util.Log;
import android.widget.TextView;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/16.
 */
public class UserInfoPage  {
    public static String TAG="Robotium";
    public static String Activity="UpdateUserInfoActivity";
    public static String tv_head_left="tv_head_left";
    public static String tv_head_title="tv_head_title";
    public static String user_avatar="user_avatar"; //头像
    public static String user_name="user_name"; //昵称
    public static String user_sex="user_sex"; //性别
    public static String user_age="user_age"; //年龄
    public static String user_skin="user_skin"; //肤质
    public static String userinfo_title="userinfo_title";
    public static String user_round_avatar="user_round_avatar"; //头像
    public static String right_arrow="right_arrow"; //剪头
    public static String userinfo_content="userinfo_content"; //填写信息

    // 判断是否为个人信息页
    public static boolean get_userinfo(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

    //点击返回按钮
    public static void clickGoBack(Solo solo){
        Log.d(TAG, "点击返回按钮");
        solo.clickOnView(solo.getView(tv_head_left));
    }

    //点击头像按钮
    public static void clickPhoto(Solo solo){
        Log.d(TAG, "点击头像按钮");
        solo.clickOnView(solo.getView(user_avatar));
    }
    //点击昵称
    public static void clickName(Solo solo){
        Log.d(TAG, "点击昵称");
        solo.clickOnView(solo.getView(user_name));
    }

    //点击性别
    public static void clickSex(Solo solo){
        Log.d(TAG, "点击性别");
        solo.clickOnView(solo.getView(user_sex));
    }

    //点击年龄
    public static void clickAge(Solo solo){
        Log.d(TAG, "点击年龄");
        solo.clickOnView(solo.getView(user_age));
    }
    //点击肤质
    public static void clickSkin(Solo solo){
        Log.d(TAG, "点击肤质");
        solo.clickOnView(solo.getView(user_skin));
    }


    // 获取title
    public static String get_title(Solo solo) {
        TextView textview = (TextView) solo.getView(UserInfoPage.tv_head_title);
        return textview.getText().toString();
    }

}
