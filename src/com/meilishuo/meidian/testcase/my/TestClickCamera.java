package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.TwiterPublicNewPage;

/**
 * Created by MLS on 15/9/16.
 */
public class TestClickCamera extends BaseClass {

    public void testUI() {
        //初始化
        init();
        //点击发帖icon
        MiaoHomePage.getClickCamera(solo);


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

        //启动发帖页面
        TwiterPublicNewPage.get_ShowPublic(solo);
        Log.d(TAG,"启动发帖页面");
        solo.sleep(1000);

    }
}
