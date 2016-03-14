package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/22.
 */
public class OrderConfirmPage {
    public static String TAG="Robotium";
    public static String Activity="OrderConfirmActivity";
    public static String tv_head_tilte="tv_head_tilte";
    public static String tv_head_left="tv_head_left";

    // 判断是订单确认页
    public static boolean get_OredrConfirm(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

}
