package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.UserInfoPage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestUserInfoPageClickSkin extends BaseClass {
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

        //点击肤质
        UserInfoPage.clickSkin(solo);
        solo.sleep(1000);

        //出现中性、干性、油性、混合、敏感选项
        assertTrue(solo.waitForText("^中性$"));
        assertTrue(solo.waitForText("^干性$"));
        assertTrue(solo.waitForText("^油性$"));
        assertTrue(solo.waitForText("^混合$"));
        assertTrue(solo.waitForText("^敏感$"));
        Log.d(TAG, "出现中性、干性、油性、混合、敏感选项");
        solo.sleep(1000);

        //点击中性
        solo.clickOnText("^中性$");
        Log.d(TAG, "点击中性");
        solo.sleep(1000);


        //肤质更改
        assertTrue(solo.waitForText("^中性$"));
        Log.d(TAG, "肤质为中性");
        solo.sleep(1000);

        //点击肤质
        UserInfoPage.clickSkin(solo);
        solo.sleep(1000);


        //点击干性
        solo.clickOnText("^干性$");
        Log.d(TAG, "点击干性");
        solo.sleep(1000);


        //肤质更改
        assertTrue(solo.waitForText("^干性$"));
        Log.d(TAG, "肤质为干性");
        solo.sleep(1000);

        //点击肤质
        UserInfoPage.clickSkin(solo);
        solo.sleep(1000);


        //点击干性
        solo.clickOnText("^油性$");
        Log.d(TAG, "点击油性");
        solo.sleep(1000);


        //肤质更改
        assertTrue(solo.waitForText("^油性$"));
        Log.d(TAG, "肤质为油性");
        solo.sleep(1000);

        //点击肤质
        UserInfoPage.clickSkin(solo);
        solo.sleep(1000);


        //点击混合性
        solo.clickOnText("^混合$");
        Log.d(TAG, "点击混合");
        solo.sleep(1000);


        //肤质更改
        assertTrue(solo.waitForText("^混合$"));
        Log.d(TAG, "肤质为混合");
        solo.sleep(1000);

        //点击肤质
        UserInfoPage.clickSkin(solo);
        solo.sleep(1000);


        //点击敏感
        solo.clickOnText("^敏感$");
        Log.d(TAG, "点击敏感");
        solo.sleep(1000);


        //肤质更改
        assertTrue(solo.waitForText("^敏感$"));
        Log.d(TAG, "肤质为敏感");
        solo.sleep(1000);

    }
}
