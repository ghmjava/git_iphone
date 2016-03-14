package com.meilishuo.meidian.testcase.ShowDetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.DiscoverPage;
import com.meilishuo.meidian.page.LoginPage;
import com.meilishuo.meidian.page.ShowDetailPage;

/**
 * Created by MLS on 15/9/28.
 */
public class TestNoLoginClickLike extends BaseClass{
    @Discover
    public void testClickLike() {
        init1();

        //点击发现
        solo.clickOnText("^发现$");
        Log.d(TAG, "点击发现");
        solo.sleep(2000);

        //点击人气达人
        solo.clickOnText("^人气达人$");
        Log.d(TAG, "点击人气达人");
        solo.sleep(2000);

        //点击show
        DiscoverPage.getClickflow_layout(solo,0);
        Log.d(TAG, "点击单个show");
        solo.sleep(2000);

        //进入动态详情页
        ShowDetailPage.get_showdetail(solo);
        Log.d(TAG, "启动动态详情页");
        solo.sleep(3000);

        //点击喜欢icon
        ShowDetailPage.click_like(solo);
        solo.sleep(2000);

        //启动登录页面
        LoginPage.get_login(solo);
        Log.d(TAG, "启动登录页面");
        solo.sleep(2000);

        login2("13820276123","123456");
        solo.sleep(1000);

        //点击喜欢icon
        ShowDetailPage.click_like(solo);
        solo.sleep(2000);






    }
}
