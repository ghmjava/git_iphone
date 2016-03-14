package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.UserInfoPage;

/**
 * Created by MLS on 15/9/16.
 */
public class TestUserInfoClickPhoto extends BaseClass {
    @Discover
    public void testUserInfoClickPhoto() {
        //初始化
        init();
        //点击个人信息
        MiaoHomePage.getClickUserInfo(solo);
        solo.sleep(2000);

        //启动个人信息页面
        UserInfoPage.get_userinfo(solo);
        Log.d(TAG, "启动用户信息页面");
        solo.sleep(2000);

        //点击头像
        UserInfoPage.clickPhoto(solo);
        solo.sleep(1000);


        //等待相机启动、拍照
        assertTrue("Activity \"camera.CameraActivity\" is not started.", solo.waitForActivity("camera.CameraActivity", 30000));
        Log.d("Robotium", "wait");
        solo.sleep(1000);
        //点击拍照
        solo.clickOnView(solo.getView("button_capture"));
        Log.d("Robotium", "capture " +
                "" +
                "wait");
        solo.sleep(1000);

    }
}
