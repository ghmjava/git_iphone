package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;import java.lang.String;

/**
 * Created by MLS on 15/4/28.
 */
public class IMGroupPage {
    private static String IMGroupActivity = "IMGroupActivity";
    public static String txt_left="tv_head_left";  //返回
    public static String avatar="avatar";   //群头像
    public static String group_owner_name="group_owner_name"; //群姓名
    public static String group_owner_brand="group_owner_brand"; //群商标
    public static String user_name="user_name";  //用户名
    public static String time="time";   //时间
    public static String txt_content="txt_content"; //群聊文本内容
    public static String img_content="img_content"; //群聊图像内容
    public static String add="add"; //add按钮
    public static String comment="comment"; //评论
    public static String send="send"; //发送评论按钮
    public static String img="img";
    public static String iv_head_right="iv_head_right"; //更多按钮
    public static String label="label";


    // 点击添加按钮
    public static void click_add(Solo solo) {
        solo.clickOnView(solo.getView(add));
        solo.sleep(2000);
    }

    // 点击评论按钮
    public static void click_comment(Solo solo) {
        solo.clickOnView(solo.getView(comment));
        solo.sleep(2000);
    }

    // 点击发送按钮
    public static void click_send(Solo solo) {
        solo.clickOnView(solo.getView(send));
        solo.sleep(2000);
    }

    // 判断是否为群聊页
    public static boolean get_IMGrouppage(Solo solo) {
        return solo.waitForActivity(IMGroupActivity, 30000);
    }










}
