package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/8/27.
 */
public class RatingPage {
    public static String TAG="Robotium";
    public static String Activity="RatingActivity";
    public static String tv_head_title="tv_head_title";
    public static String tv_head_left="tv_head_left";
    public static String tv_head_right="tv_head_right";//完成按钮
    public static String best_answer_notice="best_answer_notice";//通知栏


    // 判断是晒单评价页
    public static boolean get_rating(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

}
