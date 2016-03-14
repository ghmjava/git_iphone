package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.page.LoginPage;
import com.meilishuo.meidian.page.MiaoHomePage;

/**
 * Created by MLS on 15/9/16.
 */
public class TestNologinClickCamera extends BaseClass {

    public void testUI() {
        //初始化
        init1();
        //点击发帖icon
        MiaoHomePage.getClickCamera(solo);
        solo.sleep(1000);

        //启动登录页面
        LoginPage.get_login(solo);
        Log.d(TAG, "启动登录页面");
        solo.sleep(2000);

        login2("13820276123","123456");
        solo.sleep(1000);

        //点击发帖icon
        MiaoHomePage.getClickCamera(solo);
        solo.sleep(1000);

        //启动相机页面

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
