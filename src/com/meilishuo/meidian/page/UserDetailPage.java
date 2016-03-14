package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/4/28.
 */
public class UserDetailPage {
    public static String TAG="Robotium";
    public static String Activity="UserDetailActivity";
    public static String tv_user="tv_user";
    public static String tv_user_show="tv_user_show";
    public static String tv_phone="tv_phone";
    public static String tv_phone_show="tv_phone_show";
    public static String tv_address="tv_address";
    public static String tv_gong="tv_gong";
    public static String tv_amount="tv_amount";
    public static String tv_total="tv_total";
    public static String image="image";
    public static String tv_title="tv_title";
    public static String tv_price="tv_price";
    public static String tv_state="tv_state";
    //public static String tv_order_num="tv_order_num";
    public static String tv_order_num="tv_order_num";
    public static String tv_time="tv_time";
    public static String txt_left="txt_left";
    public static String iv_array="iv_array";

    public static void clickPhone(Solo solo){
        Log.d(TAG, "点击我的商品");
        solo.clickOnView(solo.getView(tv_phone));
    }

}
