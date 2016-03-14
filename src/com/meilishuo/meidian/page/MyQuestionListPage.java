package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/17.
 */
public class MyQuestionListPage {
    public static String TAG="Robotium";
    public static String Activity="MyQuestionActivity";
    public static String tv_head_tilte="tv_head_tilte";
    public static String tv_head_left="tv_head_left";
    public static String tv_tab="tv_tab";
    public static String avatar="avatar";//用户头像
    public static String user_name="user_name";//用户名
    public static String desc="desc";//问题描述
    public static String image="image";//图片
    public static String time="time";//时间
    public static String people_num="people_num";//参与人数



    // 判断是否为我的咨询页面
    public static boolean get_MyQuestionList(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }
}
