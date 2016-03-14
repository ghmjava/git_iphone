package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.UserInfoPage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestUserInfoPageClickSex extends BaseClass {
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

        //点击性别
        UserInfoPage.clickSex(solo);
        solo.sleep(1000);

        //出现男生、女生选项
        assertTrue(solo.waitForText("^男生$"));
        assertTrue(solo.waitForText("^女生$"));
        Log.d(TAG, "出现男生、女生选项");
        solo.sleep(1000);

        //点击女生
        solo.clickOnText("^女生$");
        Log.d(TAG, "点击女生");
        solo.sleep(1000);


        //性别更改
        assertTrue(solo.waitForText("^女生$"));
        Log.d(TAG, "性别为女生");
        solo.sleep(1000);

        //点击性别
        UserInfoPage.clickSex(solo);
        solo.sleep(1000);


        //点击女生
        solo.clickOnText("^男生$");
        Log.d(TAG, "点击男生");
        solo.sleep(1000);


        //性别更改
        assertTrue(solo.waitForText("^男生$"));
        Log.d(TAG, "性别为男生");
        solo.sleep(1000);

    }
}
