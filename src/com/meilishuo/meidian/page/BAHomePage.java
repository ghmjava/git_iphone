package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/8/27.
 */
public class BAHomePage {
    public static String TAG="Robotium";
    public static String Activity="ui.BAHomepageActivity";
    public static String tv_head_title="tv_head_title";
    public static String tv_head_left="tv_head_left";

    // 判断是BA个人主页
    public static boolean get_BAHome(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

}
