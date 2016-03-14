package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.LoginPage;
import com.meilishuo.meidian.page.MessagePage;
import com.meilishuo.meidian.page.MiaoHomePage;

/**
 * Created by MLS on 15/9/16.
 */
public class TestNologinClickMessage extends BaseClass{
    @Discover
    public void testNologinClickMessage() {
    //初始化
    init1();
        solo.sleep(1000);
    //点击消息icon
    MiaoHomePage.getClickMessage(solo);
    solo.sleep(1000);

    //启动登录页面
    LoginPage.get_login(solo);
    Log.d(TAG, "启动登录页面");
    solo.sleep(2000);

    login2("13820276123","123456");
    solo.sleep(1000);

    //点击消息icon
    MiaoHomePage.getClickMessage(solo);
    solo.sleep(1000);

    //启动消息页
    MessagePage.get_messagepage(solo);
    Log.d(TAG,"启动消息页");
    solo.sleep(1000);

}
}
