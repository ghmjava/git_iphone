package com.meilishuo.meidian.testcase.discover;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.CapturePage;
import com.meilishuo.meidian.page.DiscoverPage;

/**
 * Created by MLS on 15/9/29.
 */
public class TestClickScan extends BaseClass {
    @Discover
    public void testDisCoverUI() {
        init();
        //点击发现
        solo.clickOnText("^发现$");
        Log.d(TAG, "点击发现");
        solo.sleep(1000);

        //启动发现页面
        DiscoverPage.get_discover(solo);
        Log.d(TAG, "启动发现页面");
        solo.sleep(3000);

        //点击二维码
        DiscoverPage.getClickScan(solo);
        solo.sleep(1000);

        //启动二维码扫描页面
        CapturePage.get_CaturePage(solo);
        Log.d(TAG, "启动二维码扫描页面");
        solo.sleep(2000);

        //点击返回
        CapturePage.click_Return(solo);
        solo.sleep(2000);
    }
}
