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
public class TestCoverUI extends BaseClass{
    @Discover
    public void testCoverUi() {
        init();
        //点击我的美店
        MiaoHomePage.getClickMeidian(solo);
        Log.d(TAG, "点击我的美店");
        solo.sleep(2000);


        //点击店铺资料
        solo.clickOnView(solo.getView(HomePage.view_profile));
        Log.d(TAG, "点击店铺资料");
        solo.sleep(2000);

        //等待ShopDetailSettingActivity启动
        assertTrue("Activity\"ShopDetailSettingActivity\"is not start", solo.waitForActivity(ShopPage.ShopDetailSettingActivity));
        solo.sleep(1000);

        //点击封面
        solo.clickOnView(solo.getView(ShopPage.ba_cover));
        Log.d(TAG,"点击封面");
        solo.sleep(2000);

        //等待我的封面页面启动
        assertTrue("Activity\"AddBaCoverActivity\"is not start",solo.waitForActivity(AddBaCoverPage.Activity));
        Log.d(TAG, "启动我的封面页面");
        solo.sleep(2000);

        //查看页面标题、返回、提交
        assertTrue(solo.waitForView(solo.getView(AddBaCoverPage.tv_head_title)));
        assertTrue(solo.waitForView(solo.getView(AddBaCoverPage.tv_head_left)));
        assertTrue(solo.waitForView(solo.getView(AddBaCoverPage.tv_head_right)));
        Log.d(TAG, "确认页面标题、返回、提交按钮");

        //确认添加图片、添加视频按钮
        assertTrue(solo.waitForView(solo.getView(AddBaCoverPage.add_picture)));
        assertTrue(solo.searchText("添加图片"));
        assertTrue(solo.waitForView(solo.getView(AddBaCoverPage.add_video)));
        assertTrue(solo.searchText("添加视频"));
        Log.d(TAG, "确认添加图片、添加视频按钮");

        //添加的图像、视频、删除按钮、上移、下移按钮
        assertTrue(solo.waitForView(solo.getView(AddBaCoverPage.image)));
        assertTrue(solo.waitForView(solo.getView(AddBaCoverPage.video_play)));
        assertTrue(solo.waitForView(solo.getView(AddBaCoverPage.delete)));
        assertTrue(solo.waitForView(solo.getView(AddBaCoverPage.down_arrow)));
        assertTrue(solo.waitForView(solo.getView(AddBaCoverPage.up_arrow)));
        Log.d(TAG, "确认添加的图像、视频、删除按钮、上移、下移按钮");
    }
}
