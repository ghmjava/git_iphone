package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/29.
 */
public class CapturePage {
    public static String Activity="viewfinder_view";
    public static String TAG="Robotium";
    public static String tv_head_title="tv_head_title";
    public static String tv_head_left="tv_head_left";
    public static String viewfinder_view="viewfinder_view";

    // 判断是扫一扫页面
    public static boolean get_CaturePage(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

    //点击返回按钮
    public static void click_Return(Solo solo){
        Log.d(TAG, "点击返回按钮");
        solo.clickOnView(solo.getView(tv_head_left));
    }

}
