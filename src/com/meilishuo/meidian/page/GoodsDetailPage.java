package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/8/27.
 */
public class GoodsDetailPage {
    public static String TAG="Robotium";
    public static String Activity="GoodsDetailActivity";
    public static String tv_head_left="tv_head_left";
    public static String iv_head_right2="iv_head_right_2";//喜欢icon
    public static String iv_head_right="iv_head_right";//分享icon
    public static String pic_img="pic_img";//商品图片
    public static String page_num="page_num";//图片页数
    public static String label="label";
    public static String discount_price="discount_price"; //折扣价
    public static String vip_goods="vip_goods"; //会员商品标识
    public static String vip_discount="vip_discount"; //折扣
    public static String origin_price="origin_price"; //原价
    public static String desc="desc"; //描述
    public static String user_avatar="user_avatar"; //BA用户头像
    public static String user_name="user_name"; //BA 用户名
    public static String union="union"; //盟标
    public static String user_title="user_title"; //BA身份
    public static String start_0="start_0"; //评分－星星
    public static String start_1="start_1"; //评分－星星
    public static String start_2="start_2"; //评分－星星
    public static String start_3="start_3"; //评分－星星
    public static String start_4="start_4"; //评分－星星
    public static String score_ontime="score_ontime"; //按时：评分
    public static String score_attitude="score_attitude"; //态度：评分
    public static String score_effect="score_effect"; //效果：评分
    public static String score_selling="score_selling"; //无推销：评分
    public static String shop_name="shop_name"; //门店名
    public static String shop_address="shop_address"; //门店地址
    public static String phone_button="phone_button"; //打电话icon
    public static String work_time_linear="work_time_linear"; //预约时间参考－工作时间
    public static String work_time="work_time"; //时间
    public static String consume_notice="consume_notice"; //消费流程、消费须知
    public static String busy_flag="busy_flag"; //忙的标志
    public static String follow_bar_grid_view="follow_bar_grid_view"; //喜欢者
    public static String review_count="review_count"; //购买评价
    public static String no_review_tip="no_review_tip"; //暂无购买评价
    public static String user_icon="user_icon"; //评价－用户头像
    public static String content_message="content_message"; //评价-评分及评价
    public static String img1_id="img1_id"; //评价－图片
    public static String img2_id="img2_id"; //评价－图片
    public static String img3_id="img3_id"; //评价－图片
    public static String content_time="content_time"; //评价时间
    public static String show_all="show_all"; //查看全部按钮
    public static String comment_count="comment_count"; //最新评论（x）
    public static String no_comment_tip="no_comment_tip"; //暂无评论
    public static String action_button="action_button"; //我要评论按钮
    public static String reply_icon="action_button"; //评论－用户头像
    public static String reply_nickname="reply_nickname"; //评论－用户名
    public static String text_reply="text_reply"; //评论－评论内容
    public static String comment_time="comment_time"; //评论－评论时间
    public static String delete="delete"; //评论－删除按钮
    public static String btn_to_im="btn_to_im"; //私聊按钮
    public static String buy="buy"; //立即购买按钮
    public static String title="title"; //选择分享方式标题
    public static String weixin_friend="weixin_friend"; //微信好友
    public static String weixin_friend_circle="weixin_friend_circle"; //微信朋友圈
    public static String sina="sina"; //新浪微博
    public static String qzone="qzone"; //QQ空间
    public static String qq="qq"; //qq好友
    public static String cancel="cancel"; //取消按钮

    //立即购买弹窗的id
    public static String goods_pic="goods_pic"; //商品图片
    public static String goods_title="goods_title"; //商品标题
    public static String goods_price="goods_price"; //商品价格
    public static String service_mode="service_mode"; //服务方式
    public static String color_text="color_text"; //规格标题
    public static String item_text="item_text"; //规格
    public static String service_time="service_time"; //服务时长
    public static String btn_ok="btn_ok"; // 确定按钮

    //点击返回按钮
    public static void clickGoBack(Solo solo){
        Log.d(TAG, "点击返回按钮");
        solo.clickOnView(solo.getView(tv_head_left));
    }

    //点击喜欢icon
    public static void clickLike(Solo solo){
        Log.d(TAG, "点击喜欢按钮");
        solo.clickOnView(solo.getView(iv_head_right2));
    }

    //点击分享icon
    public static void clickShare(Solo solo){
        Log.d(TAG, "点击分享按钮");
        solo.clickOnView(solo.getView(iv_head_right));
    }

    //点击BA头像
    public static void clickBA(Solo solo){
        Log.d(TAG, "点击BA");
        solo.clickOnView(solo.getView(user_avatar));
    }

    //点击打电话icon
    public static void clickPhone(Solo solo){
        Log.d(TAG, "点击打电话icon");
        solo.clickOnView(solo.getView(phone_button));
    }

    //点击购买评价
    public static void click_Review(Solo solo){
        Log.d(TAG, "点击购买评价");
        solo.clickOnView(solo.getView(content_message));
    }

    //点击购买评价的用户头像
    public static void click_ReviewUserIcon(Solo solo){
        Log.d(TAG, "点击购买评价的用户头像");
        solo.clickOnView(solo.getView(user_icon));
    }

    //点击查看全部评价
    public static void click_showallreview(Solo solo){
        Log.d(TAG, "点击查看全部评价");
        solo.clickOnView(solo.getView(show_all));
    }
    //点击我要评论
    public static void click_comment(Solo solo){
        Log.d(TAG, "点击我要评论");
        solo.clickOnView(solo.getView(action_button));
    }
    //点击删除
    public static void click_delete(Solo solo){
        Log.d(TAG, "点击删除按钮");
        solo.clickOnView(solo.getView(delete));
    }

    //点击评论－用户头像
    public static void click_reply_icon(Solo solo,int num){
        Log.d(TAG, "点击评论的用户头像");
        solo.clickOnView(solo.getView(action_button,num));
    }

    //点击私聊按钮
    public static void click_btn_to_im(Solo solo){
        Log.d(TAG, "点击私聊按钮");
        solo.clickOnView(solo.getView(btn_to_im));
    }

    //点击立即购买按钮
    public static void click_buy(Solo solo){
        Log.d(TAG, "点击立即购买按钮");
        solo.clickOnView(solo.getView(buy));
    }

    //点击微信好友icon
    public static void click_Weinxinfriend(Solo solo){
        Log.d(TAG, "点击微信好友按钮");
        solo.clickOnView(solo.getView(weixin_friend));
    }
    //点击微信朋友圈icon
    public static void click_WeinxinCircle(Solo solo){
        Log.d(TAG, "点击微信朋友圈按钮");
        solo.clickOnView(solo.getView(weixin_friend_circle));
    }
    //点击新浪微博icon
    public static void click_sina(Solo solo){
        Log.d(TAG, "点击新浪微博按钮");
        solo.clickOnView(solo.getView(sina));
    }
    //点击Qzone icon
    public static void click_Qzone(Solo solo){
        Log.d(TAG, "点击Qzone按钮");
        solo.clickOnView(solo.getView(qzone));
    }
    //点击qq icon
    public static void click_qq(Solo solo){
        Log.d(TAG, "点击qq按钮");
        solo.clickOnView(solo.getView(qq));
    }

    //点击取消按钮
    public static void click_Cancel(Solo solo){
        Log.d(TAG, "点击取消按钮");
        solo.clickOnView(solo.getView(cancel));
    }

    //点击确定按钮
    public static void clickOK(Solo solo){
        Log.d(TAG, "点击确定按钮");
        solo.clickOnView(solo.getView(btn_ok));
    }

    // 判断是商品详情页
    public static boolean get_goodsdetail(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }
}
