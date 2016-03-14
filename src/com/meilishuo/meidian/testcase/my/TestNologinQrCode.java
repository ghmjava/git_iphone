package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.LoginPage;
import com.meilishuo.meidian.page.MiaoHomePage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestNologinQrCode extends BaseClass {
    @Discover
    public void testNologinQrCode() {
        //初始化
        init1();

        solo.scrollToTop();
        solo.sleep(1000);

        //点击我的二维码
        MiaoHomePage.getClickQrCode(solo);
        solo.sleep(1000);

        //启动登录页面
        LoginPage.get_login(solo);
        Log.d(TAG, "启动登录页面");
        solo.sleep(2000);

        login2("13820276123", "123456");
        solo.sleep(1000);

        //点击我的二维码
        MiaoHomePage.getClickQrCode(solo);
        solo.sleep(1000);

        //出现二维码
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.qrcode)));
        assertTrue(solo.waitForText("^扫二维码，加我关注$"));
        Log.d(TAG,"出现二维码");

    }
}
