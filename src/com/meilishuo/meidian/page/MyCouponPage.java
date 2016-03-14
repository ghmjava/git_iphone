package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/17.
 */
public class MyCouponPage {
    public static String TAG="Robotium";
    public static String Activity="CouponListActivity";
    public static String tv_head_tilte="tv_head_tilte";//标题
    public static String tv_head_left="tv_head_left";
    public static String tv_head_right="tv_head_right";
    public static String coupon_code="coupon_code";//兑换码输入框
    public static String qrcode_img="qrcode_img";//兑换码扫描按钮
    public static String exchange_btn="exchange_btn";//兑换按钮
    public static String left_bg="left_bg";//优惠券左边
    public static String coupon_time="coupon_time";//优惠券有效期

    // 判断是否为我的优惠券页面
    public static boolean get_MyCoupon(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }
}
