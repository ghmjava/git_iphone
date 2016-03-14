package com.meilishuo.meidian.page;

import com.meilishuo.meidian.init.BaseClass;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/17.
 */
public class MyAttentionListPage extends BaseClass{
    public static String TAG="Robotium";
    public static String Activity="MyAttentionListActivity";
    public static String tv_head_tilte="tv_head_tilte";
    public static String tv_head_left="tv_head_left";
    public static String iv_user_image="iv_user_image";//用户头像
    public static String tv_user_name="tv_user_name";//用户名
    public static String show_image="show_image";//图像
    public static String good_price="good_price";//商品价格

    // 判断是否为我的关注页面
    public static boolean get_MyAttentionList(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }
}
