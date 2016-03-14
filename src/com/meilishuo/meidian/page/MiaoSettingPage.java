package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/17.
 */
public class MiaoSettingPage {
    public static final String TAG = "Robotium";
    public static String Activity="SettingActivity";
    public static String tv_head_title="tv_head_title";
    public static String tv_head_left="tv_head_left";

    // 判断是否为设置页面
    public static boolean get_SettingPage(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

}
