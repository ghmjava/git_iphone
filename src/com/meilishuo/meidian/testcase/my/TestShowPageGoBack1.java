package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.TwiterPublicNewPage;

/**
 * Created by MLS on 15/9/16.
 */
public class TestShowPageGoBack1 extends BaseClass {


    public void testClickCancel() {
        //初始化
        init();
        //点击发帖icon
        MiaoHomePage.getClickCamera(solo);

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

        //点击返回按钮
        TwiterPublicNewPage.getClickReturn(solo);
        solo.sleep(2000);

        //点击确定
        TwiterPublicNewPage.getClickOK(solo);
        Log.d(TAG,"点击确定");
        solo.sleep(1000);

        //启动我的页面
        MiaoHomePage.get_home(solo);
        Log.d(TAG,"启动我的页面");
        solo.sleep(1000);






    }
}
