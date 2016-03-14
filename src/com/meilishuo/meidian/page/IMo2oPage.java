package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/21.
 */
public class IMo2oPage  {
    private static String Activity = "IMo2oActivity";
    public static String tv_head_left="tv_head_left";  //返回
    public static String tv_head_title="tv_head_title";   //标题
    public static String iv_head_right="iv_head_right";   //打电话icon
    public static String avatar="avatar";   //用户头像
    public static String txt_content="txt_content";   //内容
    public static String time="time";   //时间
    public static String add="add";   //添加

    // 判断是否为私聊页
    public static boolean get_IMo2opage(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

}
