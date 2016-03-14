package com.meilishuo.meidian.testcase.message;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.BAHomePage;
import com.meilishuo.meidian.page.MessagePage;
import com.meilishuo.meidian.page.MiaoHomePage;

/**
 * Created by MLS on 15/8/27.
 */
public class TestClickUserBAProfile extends BaseClass {
    @Discover
    public void testClickUserBAProfile(){
        init2();
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
        //String name= CommonMethod.get_text(solo, MessagePage.reply_nickname, 0);

        //点击用户头像
        solo.clickOnView(solo.getView(MessagePage.reply_icon,0));
        Log.d(TAG,"点击用户头像");

        //进入BA主页
        assertTrue("Activity\"ui.BAHomepageActivity\"is not start", BAHomePage.get_BAHome(solo));
        Log.d(TAG, "启动用户主页");
        solo.sleep(1000);


        //个人主页点击返回
        solo.clickOnView(solo.getView(BAHomePage.tv_head_left));
        solo.sleep(1000);

        //等待消息页面启动
        assertTrue("Activity\"MessageActivity\"is not start", MessagePage.get_messagepage(solo));
        Log.d(TAG, "启动消息页面");
        solo.sleep(1000);

    }
}
