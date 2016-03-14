package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/4/28.
 */
public class SelectGoodsListPage {
    public static final String TAG = "Robotium";
    public static String SelectGoodsListActivity="SelectGoodListActivity";
    public static String tv_head_title="tv_head_title";
    public static String tv_head_left="tv_head_left";
    public static String tv_head_right="tv_head_right";
    public static String radio="radio";
    public static String cover="cover"; //图片
    public static String title="title";//商品名称
    public static String price="price";//商品价格


    //点击选择商品
    public static void clickRadio(Solo solo){
        Log.d(TAG, "点击选择商品按钮");
        solo.clickOnView(solo.getView(radio));
    }

    //点击完成按钮
    public static void clickRight(Solo solo){
        Log.d(TAG, "点击完成按钮");
        solo.clickOnView(solo.getView(tv_head_right));
    }

    //点击完成按钮
    public static void clickLeft(Solo solo){
        Log.d(TAG, "点击返回按钮");
        solo.clickOnView(solo.getView(tv_head_left));
    }

    // 判断是否为选择商品页
    public static boolean get_SelectGoodsListPage(Solo solo) {
        return solo.waitForActivity(SelectGoodsListActivity, 30000);
    }
}


