package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/8/28.
 */
public class AddBaCoverPage {
    public static String TAG="Robotium";
    public static String Activity="AddBaCoverActivity";
    public static String tv_head_title="tv_head_title";
    public static String tv_head_left="tv_head_left"; //返回
    public static String tv_head_right="tv_head_right"; //提交
    public static String add_picture="add_picture"; //添加图片
    public static String add_video="add_video"; //添加视频
    public static String image="image"; //图像
    public static String video_play="video_play"; //视频播放
    public static String down_arrow="down_arrow"; //下移按钮
    public static String delete="delete"; //删除按钮
    public static String up_arrow="up_arrow"; //上移按钮

    // 判断是否为Home页
    public static boolean get_addbacover(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

}
