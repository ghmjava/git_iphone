package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/8/27.
 */
public class UserHomepage {
    public static String TAG="Robotium";
    public static String Activity="UserHomepageActivity";
    public static String tv_head_left="tv_head_left";
    public static String user_name="user_name";//用户名
    public static String user_portrait="user_portrait";//头像

    // 判断是C用户
    public static boolean get_userhome(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }
}
