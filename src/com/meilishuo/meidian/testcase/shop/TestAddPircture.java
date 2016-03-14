package com.meilishuo.meidian.testcase.shop;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.AddBaCoverPage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.ShopPage;

/**
 * Created by MLS on 15/8/28.
 */
public class TestAddPircture extends BaseClass {
    @Discover
    public void testClickCover() {
        init();
        //点击我的美店
        MiaoHomePage.getClickMeidian(solo);
        Log.d(TAG, "点击我的美店");
        solo.sleep(2000);


        //点击店铺资料
        solo.clickOnView(solo.getView(HomePage.view_profile));
        Log.d(TAG, "点击店铺资料");
        solo.sleep(2000);

        //点击封面
        solo.clickOnView(solo.getView(ShopPage.ba_cover));
        Log.d(TAG,"点击封面");
        solo.sleep(2000);

        //点击添加图片
        solo.clickOnView(solo.getView(AddBaCoverPage.add_picture));
        Log.d(TAG,"点击添加图片");
        solo.sleep(2000);

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
