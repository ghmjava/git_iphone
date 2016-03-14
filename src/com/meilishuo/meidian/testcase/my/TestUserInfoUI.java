package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.UserInfoPage;

/**
 * Created by MLS on 15/9/16.
 */
public class TestUserInfoUI extends BaseClass {
    @Discover
    public void testUserInfoUI() {
        //初始化
        init();
        //点击个人信息
        MiaoHomePage.getClickUserInfo(solo);
        solo.sleep(2000);

        //启动个人信息页面
        UserInfoPage.get_userinfo(solo);
        Log.d(TAG, "启动用户信息页面");
        solo.sleep(2000);

        //页面标题、返回按钮UI确认
        assertTrue(solo.waitForView(solo.getView(UserInfoPage.tv_head_title)));
        assertTrue(solo.waitForView(solo.getView(UserInfoPage.tv_head_left)));
        assertTrue(UserInfoPage.get_title(solo).equals("个人信息"));
        Log.d(TAG, "页面标题、返回按钮UI确认");
        solo.sleep(2000);

        //头像、昵称、性别、年龄、肤质UI确认
        assertTrue(solo.waitForView(solo.getView(UserInfoPage.user_avatar)));
        assertTrue(solo.waitForView(solo.getView(UserInfoPage.user_round_avatar)));
        assertTrue(solo.waitForView(solo.getView(UserInfoPage.userinfo_title)));
        assertTrue(solo.waitForView(solo.getView(UserInfoPage.user_name)));
        assertTrue(solo.waitForView(solo.getView(UserInfoPage.user_sex)));
        assertTrue(solo.waitForView(solo.getView(UserInfoPage.user_age)));
        assertTrue(solo.waitForView(solo.getView(UserInfoPage.user_skin)));
        assertTrue(solo.waitForView(solo.getView(UserInfoPage.userinfo_content)));
        assertTrue(solo.waitForView(solo.getView(UserInfoPage.right_arrow)));
        Log.d(TAG, "头像、昵称、性别、年龄、肤质UI确认");
        solo.sleep(2000);

    }
}
