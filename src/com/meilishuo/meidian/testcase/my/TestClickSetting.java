package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoSettingPage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestClickSetting extends BaseClass {
    @Discover
    public void testClickMyFollow() {
        //初始化
        init();
        //点击设置
        solo.clickOnText("^设置$");
        Log.d(TAG, "设置");
        solo.sleep(1000);

        //启动设置页面
        MiaoSettingPage.get_SettingPage(solo);
        Log.d(TAG, "启动设置页面");
        solo.sleep(2000);

    }

}
