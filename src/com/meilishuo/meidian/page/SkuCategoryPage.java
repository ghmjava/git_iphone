package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/8/27.
 */
public class SkuCategoryPage  {
    public static String TAG="Robotium";
    public static String Activity="CategoryActivity";
    public static String tv_head_title="tv_head_title";//标题
    public static String tv_head_left="tv_head_left"; //返回
    public static String parent_text="parent_text";

    // 判断是选择分类页
    public static boolean get_SkuCategory(Solo solo) {

        return solo.waitForActivity(Activity, 30000);
    }

}
