package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/17.
 */
public class UserShowListPage {
    public static String TAG="Robotium";
    public static String Activity="UserShowListActivity";
    public static String tv_head_tilte="tv_head_tilte";
    public static String tv_head_left="tv_head_left";
    public static String feed_date="feed_date";//日
    public static String feed_month="feed_month";//月

    public static String content_message="content_message";//内容
    public static String delete="delete";//删除按钮
    public static String state="state";//帖子状态
    public static String review_content_layout="review_content_layout";//帖子可点击范围

    // 判断是否为我的发布页面
    public static boolean get_UserShowList(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

    //点击单个帖子
    public static void click_Show(Solo solo,int num){
        Log.d(TAG, "点击保存按钮");
        solo.clickOnView(solo.getView(review_content_layout,num));
    }
}
