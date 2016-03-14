package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MyCouponPage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestClickMyCoupon extends BaseClass {
    @Discover
    public void testClickMyCoupon() {
        //初始化
        init();
        //点击全部订单
        solo.clickOnText("^我的优惠券$");
        Log.d(TAG, "点击我的优惠券");
        solo.sleep(1000);

        //启动我的优惠券页面
        MyCouponPage.get_MyCoupon(solo);
        Log.d(TAG, "启动我的优惠券页面");
        solo.sleep(2000);

    }
}
