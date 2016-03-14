package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/17.
 */
public class MyFavoriteListPage {
    public static String TAG="Robotium";
    public static String Activity="MyFavoriteListActivity";
    public static String tv_head_tilte="tv_head_tilte";
    public static String tv_head_left="tv_head_left";
    public static String cover="cover";//图片
    public static String title="title";//标题

    public static String price="good_price";//价格

    // 判断是否为我的喜欢页面
    public static boolean get_MyFavoriteList(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }
}
