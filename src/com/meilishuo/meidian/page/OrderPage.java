package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15-4-24.
 */
public class OrderPage {
    public static String TAG="Robotium";
    public static String tv_head_left="tv_head_left";//返回
    public static String tv_head_right="tv_head_right";//确认二维码
    public static String tv_head_tilte="tv_head_tilte";//标题
    public static String text="text";//标题
    public static String image="image";//图片
    public static String iv_array="iv_array";//订单详情符号
    public static String is_vip="is_vip"; //vip标识
    public static String tv_name="tv_name"; //订单姓名
    public static String tv_phone="tv_phone";//订单联系电话
    public static String state="state";//订单状态
    public static String creat_time="create_time";//订单创建时间
    public static String service_name="service_name";//sku名称
    public static String model_name="model_name";//规格
    public static String refund="refund";//退款状态
    public static String income="income";//本单收入
    //public static String tv_address="tv_address";//订单收货地址
    public static String Activity="DianOrderListActivity";

    public static String tv_scan="tv_scan"; //扫一扫
    public static String tv_cancel="tv_cancel"; //取消
    public static String button_ok="button_ok"; //取消
    public static String button_cancel="button_cancel"; //确定
    public static String tv_input="tv_input";



    //启动订单管理页面
    public static boolean get_OrderList(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

    // 点击订单
    public static void click_Order(Solo solo,int num) {
        solo.clickOnView(solo.getView(image,num));
        solo.sleep(2000);
    }

    // 点击确认消费码
    public static void click_HeadRight(Solo solo) {
        solo.clickOnView(solo.getView(tv_head_right));
        solo.sleep(2000);
    }

    // 点击返回
    public static void click_HeadLeft(Solo solo) {
        solo.clickOnView(solo.getView(tv_head_left));
        solo.sleep(2000);


    }

    // 点击输入数字
    public static void click_HeadInput(Solo solo) {
        solo.clickOnView(solo.getView(tv_input));
        solo.sleep(2000);}

    // 点击扫一扫
    public static void click_Scan(Solo solo) {
        solo.clickOnView(solo.getView(tv_scan));
        solo.sleep(2000);}


      // 点击取消
    public static void click_Cancel(Solo solo) {
        solo.clickOnView(solo.getView(tv_cancel));
        solo.sleep(2000);
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

}
