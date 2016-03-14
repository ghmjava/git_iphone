package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;
import android.util.Log;

/**
 * Created by MLS on 15/8/26.
 */
public class ShowDetailPage {
    public static String ShowDetailActivity="ui.ShowDetailActivity";
    public static String TAG="Robotium";
    public static String tv_head_title="tv_head_title";
    public static String tv_head_left="tv_head_left";
    public static String iv_head_right_2="iv_head_right_2";//喜欢icon
    public static String iv_head_right="iv_head_right";
    public static String avatar="avatar";//用户头像
    public static String user_name="user_name";//用户名
    public static String user_title="user_title";//用户身份
    public static String image="image";//图像
    public static String desc="desc";//描述
    public static String creat_time="create_time";//创建时间
    public static String follow_bar_grid_view="follow_bar_grid_view";//喜欢view
    public static String layout_comment_like="layout_comment_like";//喜欢评价icon
    public static String comment_count="comment_count";//最新评论
    public static String no_comment_tip="no_comment_tip";//暂无评论
    public static String action_button="action_button";//我要评论按钮
    public static String reply_icon="action_button"; //评论－用户头像
    public static String reply_nickname="reply_nickname"; //评论－用户名
    public static String text_reply="text_reply"; //评论－评论内容
    public static String comment_time="comment_time"; //评论－评论时间
    public static String delete="delete"; //评论－删除按钮

    public static String title="title"; //选择分享方式标题
    public static String weixin_friend="weixin_friend"; //微信好友
    public static String weixin_friend_circle="weixin_friend_circle"; //微信朋友圈
    public static String sina="sina"; //新浪微博
    public static String qzone="qzone"; //QQ空间
    public static String qq="qq"; //qq好友
    public static String cancel="cancel"; //取消按钮



    // 判断是动态详情页
    public static boolean get_showdetail(Solo solo) {
        return solo.waitForActivity(ShowDetailActivity, 30000);
    }

    // 点击返回
    public static void click_left(Solo solo) {
        solo.clickOnView(solo.getView(tv_head_left));
        Log.d(TAG,"点击返回按钮");
        solo.sleep(2000);
    }

    //点击喜欢icon
    public static void click_like(Solo solo) {
        solo.clickOnView(solo.getView(iv_head_right_2));
        solo.sleep(2000);
    }

    //点击分享icon
    public static void click_share(Solo solo) {
        solo.clickOnView(solo.getView(iv_head_right));
        solo.sleep(2000);
    }

    //点击头像icon
    public static void click_avatar(Solo solo) {
        solo.clickOnView(solo.getView(avatar));
        solo.sleep(2000);
    }

    //点击我要评论
    public static void click_action(Solo solo) {
        solo.clickOnView(solo.getView(action_button));
        solo.sleep(2000);
    }

    //点击flow中的喜欢icon
    public static void click_like1(Solo solo) {
        solo.clickOnView(solo.getView(layout_comment_like));
        solo.sleep(2000);
    }
    //删除评论
    public static void click_delete(Solo solo) {
        solo.clickOnView(solo.getView(delete));
        solo.sleep(2000);
        Log.d(TAG,"删除评论");
    }

    //点击取消按钮
    public static void click_Cancel(Solo solo){
        Log.d(TAG, "点击取消按钮");
        solo.clickOnView(solo.getView(cancel));
    }
}
