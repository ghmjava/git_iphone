package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.HomePage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestClickMyMeidian extends BaseClass {
    @Discover
    public void testClickMyMeidian() {
        //初始化
        init();
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
