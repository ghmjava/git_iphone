package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/4/28.
 */
public class CameraPage {
    public static final String TAG = "Robotium";
    public static String CameraActivity="camera.CameraActivity";
    public static String button_capture="button_capture"; //拍照

    // 判断是否为拍照页
    public static boolean get_camera(Solo solo) {
        return solo.waitForActivity(CameraActivity, 30000);
    }

}
