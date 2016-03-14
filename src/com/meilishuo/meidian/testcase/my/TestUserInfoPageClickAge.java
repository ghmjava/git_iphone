package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.UserInfoPage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestUserInfoPageClickAge extends BaseClass {
    @Discover
    public void testUserInfoPageClickSex() {
        //初始化
        init();
        //点击个人信息
        MiaoHomePage.getClickUserInfo(solo);
        solo.sleep(2000);

        //启动个人信息页面
        UserInfoPage.get_userinfo(solo);
        Log.d(TAG, "启动用户信息页面");
        solo.sleep(2000);

        //点击年龄
        UserInfoPage.clickAge(solo);
        solo.sleep(1000);

        //出现20岁以下、21-25岁、26-30岁、31岁以上选项
        assertTrue(solo.waitForText("^20岁以下$"));
        assertTrue(solo.waitForText("^21-25岁$"));
        assertTrue(solo.waitForText("^26-30岁$"));
        assertTrue(solo.waitForText("^31岁以上$"));
        Log.d(TAG, "出现20岁以下、21-25岁、26-30岁、31岁以上选项");
        solo.sleep(1000);

        //点击20岁以下选项
        solo.clickOnText("^20岁以下$");
        Log.d(TAG, "点击20岁以下");
        solo.sleep(1000);


        //年龄更改
        assertTrue(solo.waitForText("^20岁以下$"));
        Log.d(TAG, "年龄为20岁以下");
        solo.sleep(1000);

        //点击年龄
        UserInfoPage.clickAge(solo);
        solo.sleep(1000);


        //点击21-25岁
        solo.clickOnText("^21-25岁$");
        Log.d(TAG, "点击21-25岁");
        solo.sleep(1000);


        //年龄更改
        assertTrue(solo.waitForText("^21-25岁$"));
        Log.d(TAG, "年龄改为21-25岁");
        solo.sleep(1000);

        //点击年龄
        UserInfoPage.clickAge(solo);
        solo.sleep(1000);


        //点击26-30岁
        solo.clickOnText("^26-30岁$");
        Log.d(TAG, "点击26-30岁");
        solo.sleep(1000);


        //年龄更改
        assertTrue(solo.waitForText("^26-30岁$"));
        Log.d(TAG, "年龄改为26-30岁");
        solo.sleep(1000);

        //点击年龄
        UserInfoPage.clickAge(solo);
        solo.sleep(1000);


        //点击31岁以上
        solo.clickOnText("^31岁以上$");
        Log.d(TAG, "点击31岁以上");
        solo.sleep(1000);


        //年龄更改
        assertTrue(solo.waitForText("^31岁以上$"));
        Log.d(TAG, "年龄改为31岁以上");
        solo.sleep(1000);

    }
}
