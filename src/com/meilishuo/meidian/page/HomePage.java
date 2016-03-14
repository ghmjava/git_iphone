package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15-4-24.
 */
public class HomePage {
    public static final String TAG = "Robotium";

    public static String view_order="tv_view_order";//订单管理
    public static String view_goods="view_goods";//我的商品
    public static String view_users="view_users";//客户管理
    public static String view_income="view_income";//我的收入
    public static String view_profile="view_profile";//店铺资料
    public static String public_show="public_show";//发帖
    public static String view_shop="view_shop";//店铺预览
    public static String iv_head_right="iv_head_right";//设置
    public static String tv_head_left="tv_head_left";//返回
    public static String tv_head_title="txt_title";//首页title
    public static String Activity="MeiDianMainActivity";

    public static void getClickOrder(Solo solo){
        Log.d(TAG,"点击订单管理");
        solo.clickOnView(solo.getView(view_order));
    }

    public static void getClickGoods(Solo solo){
        Log.d(TAG,"点击我的商品");
        solo.clickOnView(solo.getView(view_goods));
    }

    public static void getClickUsers(Solo solo){
        Log.d(TAG,"点击客户管理");
        solo.clickOnView(solo.getView(view_users));
    }

    public static void getClickIncome(Solo solo){
        Log.d(TAG,"点击我的收入");
        solo.clickOnView(solo.getView(view_income));
    }



    public static void getClickViewShop(Solo solo){
        Log.d(TAG,"点击资料管理");
        solo.clickOnView(solo.getView(view_shop));
    }



    public static void getClickSetting(Solo solo){
        Log.d(TAG,"点击设置");
        solo.clickOnView(solo.getView(iv_head_right));
    }

    public static void getClickReturn(Solo solo){
        Log.d(TAG,"点击返回");
        solo.clickOnView(solo.getView(tv_head_left));
    }

    // 判断是否为Home页
    public static boolean get_home(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }
}
