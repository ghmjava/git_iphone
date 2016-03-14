package com.meilishuo.meidian.page;

import android.app.Activity;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/29.
 */
public class RecommendUserListPage {
    public static String Activity="RecommendUserListActivity";
    public static String TAG="Robotium";
    public static String close="close";
    private static String user_num="user_num"; //用户数量
    private static String user_avatar="user_avatar";//用户头像
    private static String user_name="user_name";//用户名
    private static String union="union";//盟标
    private static String recommend="recommend";//荐标
    private static String user_title="user_title";//用户身份
    private static String start_0="start_0";//评星
    private static String start_1="start_1";//评星
    private static String start_2="start_2";//评星
    private static String start_3="start_3";//评星
    private static String start_4="start_4";//评星
    private static String skill_label="skill_label";//擅长标题
    private static String skill_in="skill_in";//擅长内容
    private static String range_label="range_label";//服务商圈标题
    private static String service_ranges="service_ranges";//服务商圈内容
    private static String img_1="img_1";//商品图片1
    private static String img_2="img_3";//商品图片2
    private static String img_3="img_3";//商品图片3
    private static String img_1_category_desc="img_1_category_desc";//商品图片1二级分类
    private static String img_1_price_desc="img_1_price_desc";//商品图片1价格
    private static String img_2_category_desc="img_2_category_desc";//商品图片2二级分类
    private static String img_2_price_desc="img_2_price_desc";//商品图片2价格
    private static String img_3_category_desc="img_3_category_desc";//商品图片3二级分类
    private static String img_3_price_desc="img_3_price_desc";//商品图片3价格
    private static String notice="notice";//商品图片3价格

    // 判断是推荐页面
    public static boolean get_RecommentListPage(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }


}
