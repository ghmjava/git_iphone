package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/17.
 */
public class MiaoVIPPage {
    public static String TAG="Robotium";
    public static String Activity="MainActivity";
    public static String vip_left_tab="vip_left_tab";//门店tab
    public static String vip_right_tab="vip_right_tab";//顾问tab
    public static String message_view="message_view";//消息icon
    public static String avatar="avatar";//用户头像
    public static String user_name="user_name";//用户名
    public static String vip_date="vip_date";//会员有效期
    public static String filter_area="filter_area";//商圈筛选
    public static String filter_sort="filter_sort";//排序
    public static String filter_name="filter_name";
    public static String brand_image="brand_image";//门店图片
    public static String avatar_login="avatar_login";//未登录时头像
    public static String vip_login_btn="vip_login_btn";//登录按钮

    // 判断是否为我的美喵会员页
    public static boolean get_MiaoVip(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }
}
