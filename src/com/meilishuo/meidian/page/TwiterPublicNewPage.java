package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/16.
 */
public class TwiterPublicNewPage {
    public static String Activity="TwiterPublicNewActivity"; //发帖页面
    public static String TAG="Robotium";
    public static String tv_head_title="tv_head_title";
    public static String tv_head_left="tv_head_left"; //返回按钮
    public static String tv_head_right="tv_head_right"; //提交按钮
    public static String pic="pic"; //添加的图片
    public static String edit_desc="edit_desc"; //添加描述框
    public static String del_pic="del_pic"; //删除按钮
    public static String add_picture="add_picture"; //添加图片按钮
    public static String alertTitle="alertTitle"; //弹窗标题
    public static String button_ok="button_ok"; //取消按钮
    public static String button_cancel="button_cancel"; //确定按钮
    public static String dialog_root="dialog_root"; //弹窗

    //点击返回按钮
    public static void getClickReturn(Solo solo){
        Log.d(TAG, "点击返回");
        solo.clickOnView(solo.getView(tv_head_left));
    }

    //点击提交按钮
    public static void getClickSubmit(Solo solo){
        Log.d(TAG, "点击提交按钮");
        solo.clickOnView(solo.getView(tv_head_right));
    }

    //点击添加图片描述按钮
    public static void getClickAddPicDetail(Solo solo,int num){
        Log.d(TAG, "点击添加图片描述按钮");
        solo.clickOnView(solo.getView(edit_desc,num));
    }

    //点击图片
    public static void getClickPic(Solo solo,int num){
        Log.d(TAG, "点击图片");
        solo.clickOnView(solo.getView(pic,num));
    }

    //点击删除按钮
    public static void getClickDel(Solo solo,int num){
        Log.d(TAG, "点击删除按钮");
        solo.clickOnView(solo.getView(del_pic,num));
    }

    //点击添加图片按钮
    public static void getClickAddPic(Solo solo){
        Log.d(TAG, "点击添加图片按钮");
        solo.clickOnView(solo.getView(add_picture));
    }
    //点击取消按钮
    public static void getClickCancel(Solo solo){
        Log.d(TAG, "点击返回");
        solo.clickOnView(solo.getView(button_ok));
    }

    //点击返回按钮
    public static void getClickOK(Solo solo){
        Log.d(TAG, "点击返回");
        solo.clickOnView(solo.getView(button_cancel));
    }

    // 判断是否为发帖页面
    public static boolean get_ShowPublic(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }


}
