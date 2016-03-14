package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15-4-28.
 */
public class RegistPage {
    public static String Activity="RegistActivity";
    public static String tv_head_left="tv_head_left";

    public static String at_store="at_store";
    public static String register_phone="register_phone";
    public static String register_captcha="register_captcha";
    public static String tv_get_captha="tv_get_captha";
    public static String register_username="register_username";
    public static String register_pwd="register_pwd";

    // 判断是注册页面
    public static boolean get_RegistPage(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

}
