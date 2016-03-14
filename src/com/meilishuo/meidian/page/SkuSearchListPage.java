package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/21.
 */
public class SkuSearchListPage {
    public static String TAG="Robotium";
    public static String Activity="SearchListActivity";
    public static String tv_head_left="tv_head_left";//返回按钮
    public static String hint="hint";//搜索框
    public static String effect_filter="effect_filter";//功效筛选
    public static String area_filter="area_filter";//商圈筛选
    public static String sort_filter="sort_filter";//分类筛选
    public static String cover="cover";//商品图片
    public static String title="title";//商品标题
    public static String price="price";//商品价格
    public static String vip_goods="vip_goods";//盟标
    public static String shop_name="shop_name";//店铺名
    public static String distance="distance";//距离

    // 判断是否为商品搜索列表页面
    public static boolean get_SkuSearchList(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

    //点击返回按钮
    public static void getReturn(Solo solo){
        Log.d(TAG, "点击返回");
        solo.clickOnView(solo.getView(tv_head_left));
    }

    //点击单个sku
    public static void getSku(Solo solo,int num){
        Log.d(TAG, "点击单个商品");
        solo.clickOnView(solo.getView(cover,num));
    }
}
