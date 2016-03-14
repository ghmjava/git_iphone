package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.TwiterPublicNewPage;

/**
 * Created by MLS on 15/9/16.
 */
public class TestShowPageUI extends BaseClass {

    public void testUI() {
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

        //标题、返回按钮、提交按钮存在
        assertTrue(solo.waitForView(solo.getView(TwiterPublicNewPage.tv_head_title)));
       // assertTrue(CommonMethod.get_title(solo).equals("^新建$"));
        assertTrue(solo.waitForView(solo.getView(TwiterPublicNewPage.tv_head_left)));
        assertTrue(solo.waitForView(solo.getView(TwiterPublicNewPage.tv_head_right)));
//        assertTrue(CommonMethod.get_text(solo,TwiterPublicNewPage.tv_head_left,0).equals("^返回$"));
     //   assertTrue(CommonMethod.get_text(solo,TwiterPublicNewPage.tv_head_right,0).equals("^提交$"));
        Log.d(TAG,"标题、返回按钮、提交按钮存在");
        solo.sleep(1000);

        //图片、添加图片描述、删除按钮、添加图片UI查看
        assertTrue(solo.waitForView(solo.getView(TwiterPublicNewPage.pic)));
        assertTrue(solo.waitForView(solo.getView(TwiterPublicNewPage.edit_desc)));
        assertTrue(solo.waitForView(solo.getView(TwiterPublicNewPage.del_pic)));
        assertTrue(solo.waitForView(solo.getView(TwiterPublicNewPage.add_picture)));
        Log.d(TAG,"图片、添加图片描述、删除按钮、添加图片UI存在");
        solo.sleep(1000);



    }
}
