package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/8/28.
 */
public class GoodAt_ServicePage {
    public static String TAG="Robotium";
    public static String Activity="Activity";
    public static String tv_head_title="tv_head_title";
    public static String tv_head_left="tv_head_left";
    public static String tv_head_right="tv_head_right";
    public static String parent_text="parent_text";
    public static String child_text="child_text";
    public static String selected="selected";
    public static String text="text";

    // 判断是擅长／选择服务商圈页面
    public static boolean get_GoodAt_Service(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

    // 点击父节点
    public static void getClickParent(Solo solo,int id){
        Log.d(TAG, "点击父节点");
        solo.clickOnView(solo.getView(parent_text,id));
    }

    // 点击子节点
    public static void getClickChild(Solo solo,int id){
        Log.d(TAG, "点击子节点");
        solo.clickOnView(solo.getView(child_text,id));
    }

    // 点击返回
    public static void getClickLeft(Solo solo){
        Log.d(TAG, "点击返回");
        solo.clickOnView(solo.getView(tv_head_left));
    }

    // 点击保存
    public static void getClickRight(Solo solo){
        Log.d(TAG, "点击保存");
        solo.clickOnView(solo.getView(tv_head_right));
    }

    // 点击所选择的擅长／商圈
    public static void getClickText(Solo solo,int id){
        Log.d(TAG, "点击所选择的擅长／商圈");
        solo.clickOnView(solo.getView(text,id));
    }
}
