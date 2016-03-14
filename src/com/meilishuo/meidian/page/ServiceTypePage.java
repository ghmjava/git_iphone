package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/10/8.
 */
public class ServiceTypePage {
    public static String TAG="Robotium";
    public static String Activity="ServiceTypeActivity";
    public static String tv_head_title="tv_head_title";
    public static String tv_head_left="tv_head_left";
    public static String parent_item="parent_item";

    // 判断是选择服务方式页面
    public static boolean get_ServiceModePage(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }
}
