package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.UserInfoPage;
import com.meilishuo.meidian.page.UserNameCommitPage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestUserInfoClickName extends BaseClass {
    @Discover
    public void testUserInfoClickName() {
        //初始化
        init();
        //点击个人信息
        MiaoHomePage.getClickUserInfo(solo);
        solo.sleep(2000);

        //启动个人信息页面
        UserInfoPage.get_userinfo(solo);
        Log.d(TAG, "启动用户信息页面");
        solo.sleep(2000);

        //点击昵称
        UserInfoPage.clickName(solo);
        solo.sleep(1000);

        //启动昵称编辑页面
        UserNameCommitPage.get_userNameCommit(solo);
        Log.d(TAG, "启动昵称编辑页面");
        solo.sleep(2000);

    }
}
