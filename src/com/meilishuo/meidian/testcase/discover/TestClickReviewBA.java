package com.meilishuo.meidian.testcase.discover;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.BAHomePage;
import com.meilishuo.meidian.page.DiscoverPage;

/**
 * Created by MLS on 15/9/29.
 */
public class TestClickReviewBA extends BaseClass{
    @Discover
    public void testClickReviewBA() {
        init();
        //点击发现
        solo.clickOnText("^发现$");
        Log.d(TAG, "点击发现");
        solo.sleep(1000);

        //启动发现页面
        DiscoverPage.get_discover(solo);
        Log.d(TAG, "启动发现页面");
        solo.sleep(3000);

        //点击晒单精选
        solo.clickOnText("^晒单精选$");
        solo.sleep(1000);

        solo.scrollDown();
        solo.sleep(1000);

        //点击晒单@的BA
        DiscoverPage.getClickBA(solo,1);
        solo.sleep(3000);

        //进入BA个人主页
        BAHomePage.get_BAHome(solo);
        Log.d(TAG, "启动BA个人主页");
        solo.sleep(2000);




    }
}
