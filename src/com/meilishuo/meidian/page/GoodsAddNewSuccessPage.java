package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/8/26.
 */
public class GoodsAddNewSuccessPage {
    public static String Activity="GoodsAddSuccessActivity";
    public static String TAG="Robotium";
    public static String tv_head_title="tv_head_title"; //标题
    public static String tv_head_right="tv_head_right"; //完成按钮
    public static String iv_show="iv_show"; //预览商品
    public static String tv_show="tv_show"; //预览商品
    public static String iv_weixin="iv_weixin"; //分享至微信
    public static String tv_weixin="tv_weixin"; //分享至微信
    public static String iv_friend="iv_friend"; //分享至朋友圈
    public static String tv_friend="tv_friend"; //分享至朋友圈

    // 判断是否为sku添加成功页面
    public static boolean get_GoodsAddNewSuccessPage(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }
}
