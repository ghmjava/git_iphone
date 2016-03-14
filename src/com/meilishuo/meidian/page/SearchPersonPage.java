package com.meilishuo.meidian.page;

import android.util.Log;
import android.widget.TextView;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/16.
 */
public class SearchPersonPage {
    public static String Activity="ContactListActivity";
    public static String TAG="Robotium";
    public static String tv_head_left="tv_head_left";//返回按钮
    public static String tv_head_title="tv_head_title";
    public static String iv_head_right="iv_head_right"; //找人icon
    public static String et_search="et_search"; //搜索框
    public static String head_photo="head_photo";//用户头像
    public static String user_name="user_name";//用户名
    public static String button="button";//按钮
    public static String tv_cancel="tv_cancel";//取消按钮

    // 判断是找人页面
    public static boolean get_SearchPerson(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

    //点击返回按钮
    public static void clickGoBack(Solo solo){
        Log.d(TAG, "点击返回按钮");
        solo.clickOnView(solo.getView(tv_head_left));
    }

    //点击搜索框按钮
    public static void clickSearch(Solo solo){
        Log.d(TAG, "点击搜索框");
        solo.clickOnView(solo.getView(et_search));
    }
    //点击找人按钮
    public static void clickSearchPerson(Solo solo){
        Log.d(TAG, "点击找人icon");
        solo.clickOnView(solo.getView(iv_head_right));
    }
    //点击关注／已关注按钮
    public static void clickButton(Solo solo,int num){
        Log.d(TAG, "点击关注／已关注按钮");
        solo.clickOnView(solo.getView(button,num));
    }

    //点击用户头像
    public static void clickHeadPhoto(Solo solo, int num){
        Log.d(TAG, "点击用户头像");
        solo.clickOnView(solo.getView(head_photo,num));
    }

    //点击取消按钮
    public static void clickCancel(Solo solo){
        Log.d(TAG, "点击取消按钮");
        solo.clickOnView(solo.getView(tv_cancel));
    }

    // 获取title
    public static String get_title(Solo solo) {
        TextView textview = (TextView) solo.getView(SearchPersonPage.tv_head_title);
        return textview.getText().toString();
    }

    // 根据id获取文本
    public static String get_text(Solo solo, String id, int index) {
        TextView textview = (TextView) solo.getView(id, index);
        Log.d("Robotium", "get textview:"+textview.getText().toString());
        return textview.getText().toString();
    }

}
