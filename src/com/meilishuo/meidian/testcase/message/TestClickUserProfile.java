package com.meilishuo.meidian.testcase.message;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.CommonMethod;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MessagePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.UserHomepage;

/**
 * Created by MLS on 15/8/27.
 */
public class TestClickUserProfile extends BaseClass {
    @Discover
    public void testClickUserProfile(){
        init();
        //点击消息
        MiaoHomePage.getClickMessage(solo);
        Log.d(TAG, "点击消息");
        solo.sleep(3000);
        //启动消息页面
        assertTrue("Activity\"UserHomepageActivity\"is not start", MessagePage.get_messagepage(solo));
        Log.d(TAG, "启动消息页面");
        solo.sleep(1000);

        //点击喜欢
        solo.clickOnText("^喜欢$");
        Log.d(TAG, "点击喜欢");
        solo.sleep(1000);
        String name= CommonMethod.get_text(solo,MessagePage.reply_nickname,0);

        //点击用户头像
        solo.clickOnView(solo.getView(MessagePage.reply_icon,1));
        Log.d(TAG,"点击用户头像");

        //进入普通用户
        assertTrue("Activity\"UserHomepageActivity\"is not start", UserHomepage.get_userhome(solo));
        Log.d(TAG, "启动用户主页");
        solo.sleep(1000);

        //确保个人主页正确
       // assertTrue(CommonMethod.get_text(solo,UserHomepage.user_name,1).equals(name));
        //Log.d(TAG,"确保个人主页正确");
        //solo.sleep(1000);

        //个人主页点击返回
        solo.clickOnView(solo.getView(UserHomepage.tv_head_left));
        solo.sleep(1000);

        //等待消息页面启动
        assertTrue("Activity\"MessageActivity\"is not start", MessagePage.get_messagepage(solo));
        Log.d(TAG, "启动消息页面");
        solo.sleep(1000);

    }
}
