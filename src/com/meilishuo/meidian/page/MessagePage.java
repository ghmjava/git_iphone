package com.meilishuo.meidian.page;


import com.robotium.solo.Solo;

/**
 * Created by MLS on 15-4-24.
 */
public class MessagePage {
    private static String MessageActivity = "feature.home.MessageActivity";
    public static String tv_head_left = "tv_head_left";
    public static String tv_head_title = "tv_head_title";
    public static String tv_tab = "tv_tab";
    public static String avator_cover = "avator_cover";//群聊头像
    public static String avatar_icon = "avatar_icon";//私聊消息
    public static String tv_nickname = "tv_nickname";//用户名
    public static String tv_content = "tv_content";//消息内容
    public static String tv_time = "tv_time";//时间
    public static String reply_icon = "reply_icon";//喜欢、评论、通知－>头像
    public static String reply_nickname = "reply_nickname";//喜欢、评论、通知－>昵称
    public static String like_reply = "like_reply";//喜欢－>心
    public static String reply_time = "reply_time";//喜欢、评论－>时间
    public static String reply_to = "reply_to";//评论－回复内容
    public static String tv_remind = "tv_remind";
    public static String comment_time = "comment_time";//通知－时间
    // public static String reply_tag="reply_tag";
    //public static String reply_user="reply_user";
    //public static String reply_stop="reply_stop";
    public static String text_reply = "text_reply";//通知－内容
    public static String product_image = "product_image";//喜欢、评论－头像
    public static String details = "details";//喜欢、评论－详细信息

    // 点击返回
    public static void click_left(Solo solo) {
        solo.clickOnView(solo.getView(tv_head_left));
        solo.sleep(2000);
    }


    // 点击第一个消息
    public static void click_firstmessage(Solo solo) {
        solo.clickOnView(solo.getView(avatar_icon));
        solo.sleep(2000);
    }


    // 判断是MyMessage页
    public static boolean get_messagepage(Solo solo) {
        return solo.waitForActivity(MessageActivity, 30000);
    }

    // 点击第一条喜欢
    public static void click_first_like(Solo solo) {
        solo.clickOnView(solo.getView(product_image,0));
        solo.sleep(2000);
    }

    // 点击第一条评论
    public static void click_first_reply(Solo solo) {
        solo.clickOnView(solo.getView(product_image,0));
        solo.sleep(2000);
    }

    // 点击第一条通知
    public static void click_first_notice(Solo solo) {
        solo.clickOnView(solo.getView(text_reply,0));
        solo.sleep(2000);
    }

    // 点击头像进入个人主页
    public static void click_first_img(Solo solo) {
        solo.clickOnView(solo.getView(product_image,0));
        solo.sleep(2000);
    }
}
