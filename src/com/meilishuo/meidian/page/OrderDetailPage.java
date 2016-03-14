package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/4/29.
 */
public class OrderDetailPage {
    public static String OrderDetailActivity="OrderDetailActivity";
    public static String TAG="Robotium";
    public static String tv_head_left="tv_head_left";
    public static String tv_head_title="tv_head_title";
    public static String tv_user_show="tv_user_show"; //收件人
    public static String tv_user="tv_user";
    public static String tv_phone_show="tv_phone_show";
    public static String tv_phone="tv_phone";
    public static String tv_address="tv_address";
    public static String tv_order_type="tv_order_type"; //订单状态
    public static String order_goods_pic="order_goods_pic";//订单图片
    public static String tv_goods_title="tv_goods_title"; //商品名称
    public static String item_order_model="item_order_model"; //规格
    public static String item_order_num="item_order_num"; //数量
    public static String item_order_price="item_order_price"; //价格
    public static String item_order_way="item_order_way"; //方式
    public static String order_name="order_name";
    public static String order_value="order_value";
    public static String item_detai_order_id="item_detail_order_id"; //订单编号
    public static String item_detai_order_pay_time="item_detail_order_pay_time";//付款时间
    public static String item_detai_order_other="item_detail_order_other"; //订单备注
    public static String item_detai_order_coupon_desc="item_detail_order_coupon_desc"; //使用优惠券
    public static String item_detai_order_vip_price="item_detail_order_vip_price"; //已使用会员特权
    public static String item_detai_order_send_time="item_detail_order_send_time"; //发货时间
    public static String item_detai_order_received_time="item_detail_order_received_time"; //收货时间
    public static String score_ontime="score_ontime"; //按时
    public static String score_attitude="score_attitude"; //态度
    public static String score_effect="score_effect"; //效果
    public static String score_selling="score_selling"; //无推销
    public static String order_total="order_total"; //合计
    public static String action_btn="action_btn"; //确认消费码
    public static String review_button="review_button"; //查看评价
    public static String refund="refund"; //退款成功
    public static String tv_input="tv_input"; //输入数字
    public static String tv_scan="tv_scan"; //扫一扫
    public static String tv_cancel="tv_cancel"; //取消
    public static String button_ok="button_ok"; //取消
    public static String button_cancel="button_cancel"; //确定

    public static String btn_to_im="btn_to_im"; //私聊按钮
    public static String call_phone="call_phone"; //拨打电话icon

    //点击返回
    public static void getBack(Solo solo){
        Log.d(TAG, "点击我的商品");
        solo.clickOnView(solo.getView(tv_head_left));
    }

    // 判断是订单详情页
    public static boolean get_orderdetail(Solo solo) {
        return solo.waitForActivity(OrderDetailActivity, 30000);
    }

    //点击确认消费码
    public static void clickAction_btn(Solo solo){
        Log.d(TAG, "点击确认消费码");
        solo.clickOnView(solo.getView(action_btn));
    }

    //点击输入数字
    public static void clickInput(Solo solo){
        Log.d(TAG, "点击输入数字");
        solo.clickOnView(solo.getView(tv_input));
    }

    //点击取消按钮
    public static void clickCancel(Solo solo){
        Log.d(TAG, "点击取消");
        solo.clickOnView(solo.getView(tv_cancel));
    }

    //点击取消1按钮
    public static void clickCancel1(Solo solo){
        Log.d(TAG, "点击取消");
        solo.clickOnView(solo.getView(button_ok));
    }

    //点击确定按钮
    public static void clickOk(Solo solo){
        Log.d(TAG, "点击确定");
        solo.clickOnView(solo.getView(button_cancel));
    }

    //点击查看评价按钮
    public static void clickReview(Solo solo){
        Log.d(TAG, "点击查看评价按钮");
        solo.clickOnView(solo.getView(review_button));
    }

}
