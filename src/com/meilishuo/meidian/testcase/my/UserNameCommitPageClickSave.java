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
public class UserNameCommitPageClickSave extends BaseClass {
    @Discover
    public void testUsernameCommitClickSave() {
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

        //清空输入框
        solo.clearEditText(0);
        solo.sleep(1000);

        //输入孙小喵test
        solo.enterText(0,"孙小喵test");
        solo.sleep(1000);

        //点击保存
        UserNameCommitPage.clickSave(solo);
        solo.sleep(1000);

        //启动个人信息页面
        UserInfoPage.get_userinfo(solo);
        Log.d(TAG, "启动个人信息页面");
        solo.sleep(2000);

        //昵称更改
       // String name=CommonMethod.get_text(solo, UserInfoPage.userinfo_content, 0);
        //assertEquals("孙小喵test",name);
        assertTrue(solo.waitForText("孙小喵test"));
        Log.d(TAG, "昵称更改");
        solo.sleep(1000);

    }
}
