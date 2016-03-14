package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.LoginPage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestNologinClickMeidian extends BaseClass {
    @Discover
    public void testNologinClickMeidian() {
        //初始化
        init1();

        solo.scrollToTop();
        solo.sleep(1000);

        //点击我的美店
        solo.clickOnText("^我的美店$");
        Log.d(TAG, "点击我的美店");
        solo.sleep(1000);

        //启动登录页面
        LoginPage.get_login(solo);
        Log.d(TAG, "启动登录页面");
        solo.sleep(2000);

        login2("13820276123", "123456");
        solo.sleep(1000);

        //点击我的美店
        solo.clickOnText("^我的美店$");
        Log.d(TAG, "点击我的美店");
        solo.sleep(1000);

        //启动我的美店页面
        HomePage.get_home(solo);
        Log.d(TAG, "启动我的美店页面");
        solo.sleep(2000);


    }
}
