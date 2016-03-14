package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MessagePage;
import com.meilishuo.meidian.page.MiaoHomePage;

/**
 * Created by MLS on 15/9/16.
 */
public class TestClickMessage extends BaseClass {
    @Discover
    public void testClickMessage() {
        //初始化
        init();
        //点击消息icon
        MiaoHomePage.getClickMessage(solo);
        solo.sleep(1000);

        //启动消息页面
        MessagePage.get_messagepage(solo);
        Log.d(TAG,"启动消息页面");
        solo.sleep(1000);

    }
}
