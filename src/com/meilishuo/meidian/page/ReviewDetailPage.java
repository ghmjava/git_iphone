package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/8/27.
 */
public class ReviewDetailPage {
    public static String Activity="ui.ReviewDetailActivity";
    public static String TAG="Robotium";
    public static String tv_head_title="tv_head_title";
    public static String tv_head_left="tv_head_left";
    public static String iv_head_right="iv_head_right";//分享icon
    public static String iv_head_right_2="iv_head_right_2";//喜欢icon
    public static String goods_image="goods_image"; //商品图片
    public static String avatar="avatar"; //用户头像
    public static String user_name="user_name"; //用户名
    public static String image="image"; //晒图
    public static String desc="desc"; //评论
    public static String create_time="create_time"; //创建时间
    public static String location="location"; // 创建地点
    public static String goods_name="goods_name"; // 商品名
    public static String goods_sku="goods_sku"; // 商品规格
    public static String discount_price="discount_price"; // 会员价
    public static String vip_goods="vip_goods"; // 会员盟标
    public static String origin_price="origin_price"; // 原价
    public static String score_seal_image="score_seal_image"; // 评分图片
    public static String score_seal="score_seal"; // 评分
    public static String seller="seller"; // BA
    public static String follow_bar_grid_view="follow_bar_grid_view"; //  喜欢view
    public static String layout_comment_like="layout_comment_like";//喜欢评价icon
    public static String comment_count="comment_count"; //  最心评论（x）
    public static String no_comment_tip="no_comment_tip"; //  暂无评论
    public static String action_button="action_button"; //  我要评论按钮

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



    // 判断是晒单详情页
    public static boolean get_reviewdetail(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

    //点击商品
    public static void clickGoods(Solo solo){
        Log.d(TAG, "点击用户头像");
        solo.clickOnView(solo.getView(goods_image));
    }

    //点击返回按钮
    public static void clickReturn(Solo solo){
        Log.d(TAG, "点击返回按钮");
        solo.clickOnView(solo.getView(tv_head_left));
    }

    //点击喜欢
    public static void clickLike(Solo solo){
        Log.d(TAG, "点击喜欢");
        solo.clickOnView(solo.getView(iv_head_right_2));
    }

    //点击分享
    public static void clickShare(Solo solo){
        Log.d(TAG, "点击分享");
        solo.clickOnView(solo.getView(iv_head_right));
    }

    //点击用户头像
    public static void clickAvatar(Solo solo){
        Log.d(TAG, "点击用户头像");
        solo.clickOnView(solo.getView(avatar));
    }
    //点击BA
    public static void clickBA(Solo solo){
        Log.d(TAG, "点击BA");
        solo.clickOnView(solo.getView(seller));
    }

    //点击我要评论
    public static void clickComment(Solo solo){
        Log.d(TAG, "点击我要评论");
        solo.clickOnView(solo.getView(action_button));
    }

    //点击取消按钮
    public static void click_Cancel(Solo solo){
        Log.d(TAG, "点击取消按钮");
        solo.clickOnView(solo.getView(cancel));
    }

    //点击喜欢按钮
    public static void click_like1(Solo solo){
        Log.d(TAG, "点击喜欢按钮");
        solo.clickOnView(solo.getView(layout_comment_like));
    }

    //点击删除评论按钮
    public static void click_delete(Solo solo){
        Log.d(TAG, "点击删除评论按钮");
        solo.clickOnView(solo.getView(delete));
    }
}
