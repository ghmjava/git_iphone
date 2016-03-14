package com.meilishuo.meidian.testcase.discover;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.DiscoverPage;
import com.meilishuo.meidian.page.UserHomepage;

/**
 * Created by MLS on 15/9/29.
 */
public class TestClickAvatar1 extends BaseClass {
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
        solo.clickOnText("^人气达人$");
        solo.sleep(1000);

        solo.scrollDown();
        solo.sleep(1000);

        //点击头像
        DiscoverPage.getClickUser(solo,1);
        solo.sleep(2000);

        //启动用户个人页
        UserHomepage.get_userhome(solo);
        Log.d(TAG, "启动用户个人页");
        solo.sleep(3000);




    }

}
