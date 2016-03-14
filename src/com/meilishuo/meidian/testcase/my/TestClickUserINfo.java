package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.UserInfoPage;

/**
 * Created by MLS on 15/9/16.
 */
public class TestClickUserINfo extends BaseClass {
    @Discover
    public void testClickUserInfo() {
        //初始化
        init();
        //点击用户信息
        MiaoHomePage.getClickUserInfo(solo);
        solo.sleep(1000);

        //启动用户信息页面
        UserInfoPage.get_userinfo(solo);
        Log.d(TAG,"启动用户信息页面");
        solo.sleep(2000);
    }
}
