package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoSettingPage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestNologinClickSetting extends BaseClass {
    @Discover
    public void testNologinClickSetting() {
        //初始化
        init1();

        solo.scrollToBottom();
        solo.sleep(1000);

        //点击设置
        solo.clickOnText("^设置$");
        Log.d(TAG, "点击设置");
        solo.sleep(1000);

        //启动设置页面
        MiaoSettingPage.get_SettingPage(solo);
        Log.d(TAG, "启动设置页面");
        solo.sleep(1000);

    }
}
