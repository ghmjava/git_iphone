package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoVIPPage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestNologinVip extends BaseClass {
    @Discover
    public void testNoLoginUi() {
        //初始化
        init1();
        //点击我的美喵会员
        solo.clickOnText("我的美喵会员");
        Log.d(TAG,"Robotium");
        solo.sleep(1000);

        //启动vip会员页
        MiaoVIPPage.get_MiaoVip(solo);
        Log.d(TAG,"启动vip会员页");
        solo.sleep(1000);
        solo.scrollToTop();
        solo.sleep(1000);

        //UI确认
        assertTrue(solo.waitForView(solo.getView(MiaoVIPPage.avatar_login)));
        assertTrue(solo.waitForView(solo.getView(MiaoVIPPage.vip_login_btn)));
        assertTrue(solo.waitForText("你还未登录哦"));
        Log.d(TAG,"UI 确认");
        solo.sleep(1000);

    }
}
