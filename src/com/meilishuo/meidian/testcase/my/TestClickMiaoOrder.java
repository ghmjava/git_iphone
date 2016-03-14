package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoOrderListPage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestClickMiaoOrder extends BaseClass {
    @Discover
    public void testClickMiaoOrder() {
        //初始化
        init();
        //点击全部订单
        solo.clickOnText("^全部订单$");
        Log.d(TAG,"点击全部订单");
        solo.sleep(1000);

        //启动我的订单页面
        MiaoOrderListPage.get_miaoorderlist(solo);
        Log.d(TAG, "启动用户信息页面");
        solo.sleep(2000);
    }
}
