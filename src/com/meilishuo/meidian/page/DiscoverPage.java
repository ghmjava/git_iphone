package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/22.
 */
public class DiscoverPage {
    public static String TAG="Robotium";
    public static String Activity="MainActivity";
    public static String tv_head_title="tv_head_title";
    public static String iv_head_right="iv_head_right";//扫一扫
    public static String consult="consult";//在线咨询
    public static String recommend="recommend"; //牛人推荐
    public static String flow_layout="flow_layout"; //图片流
    public static String layout_tab="layout_tab"; //tab
    public static String user_avatar="user_avatar"; //用户头像
    public static String user_name="user_name"; //用户名
    public static String user_desc="user_desc"; //用户tilte
    public static String question="question"; //描述
    public static String create_time="create_time"; //创建时间
    public static String liked_count="liked_count"; //喜欢的人数
    public static String comment_count="comment_count"; //评论的人数

    public static String directing="directing"; //@后的BA

    // 判断是发现页
    public static boolean get_discover(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

    //点击晒单
    public static void getClickflow_layout(Solo solo,int id){
        Log.d(TAG, "点击晒图");
        solo.clickOnView(solo.getView(flow_layout,id));
    }

    //点击头像
    public static void getClickUser(Solo solo,int id){
        Log.d(TAG, "点击头像");
        solo.clickOnView(solo.getView(user_avatar,id));
    }

    //点击BA
    public static void getClickBA(Solo solo,int id){
        Log.d(TAG, "点击BA");
        solo.clickOnView(solo.getView(directing,id));
    }

    //点击二维码扫一扫
    public static void getClickScan(Solo solo){
        Log.d(TAG, "点击BA");
        solo.clickOnView(solo.getView(iv_head_right));
    }

    //点击在线咨询
    public static void getClickConsult(Solo solo){
        Log.d(TAG, "点击BA");
        solo.clickOnView(solo.getView(consult));
    }

    //点击牛人推荐
    public static void getClickRecomment(Solo solo){
        Log.d(TAG, "点击BA");
        solo.clickOnView(solo.getView(recommend));
    }
}
