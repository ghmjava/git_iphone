package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/29.
 */
public class QuestionListPage {
    public static String TAG="Robotium";
    public static String Activity="QuestionTabActivity";
    public static String tv_head_title="tv_head_title";

    // 判断是在线咨询页面
    public static boolean get_QuestionListPage(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }
}
