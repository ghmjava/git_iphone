package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.LoginPage;
import com.meilishuo.meidian.page.MyCouponPage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestNologinClickCoupon extends BaseClass {
    @Discover
    public void testNologinClickMessage() {
        //初始化
        init1();

        solo.scrollToTop();
        solo.sleep(1000);

        //点击我的优惠券
        solo.clickOnText("^我的优惠券$");
        Log.d(TAG, "点击我的优惠券");
        solo.sleep(1000);

        //启动登录页面
        LoginPage.get_login(solo);
        Log.d(TAG, "启动登录页面");
        solo.sleep(2000);

        login2("13820276123", "123456");
        solo.sleep(1000);

        //点击我的优惠券
        solo.clickOnText("^我的优惠券$");
        Log.d(TAG, "点击我的优惠券");
        solo.sleep(1000);

        //启动我的优惠券页面
        MyCouponPage.get_MyCoupon(solo);
        Log.d(TAG, "启动我的优惠券页面");
        solo.sleep(2000);


    }
}
