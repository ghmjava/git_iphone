package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoVIPPage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestVIP extends BaseClass {
    @Discover
    public void testUserInfoUI() {
        //初始化
        init();
        //点击我的美喵会员
        solo.clickOnText("^我的美喵会员$");
        Log.d(TAG,"点击我的美喵会员");
        solo.sleep(1000);

        //启动我的美喵会员页面
        MiaoVIPPage.get_MiaoVip(solo);
        Log.d(TAG,"启动我的美喵会员页面");
        solo.sleep(1000);

        //确认用户信息
        assertTrue(solo.waitForView(solo.getView(MiaoVIPPage.avatar)));
        assertTrue(solo.waitForView(solo.getView(MiaoVIPPage.user_name)));
        assertTrue(solo.waitForView(solo.getView(MiaoVIPPage.vip_date)));
        Log.d(TAG,"确认用户信息");
        solo.sleep(1000);


    }
}
