package com.meilishuo.meidian.testcase.message;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MessagePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.OrderDetailPage;

/**
 * Created by MLS on 15/8/27.
 */
public class TestNoticeToOrder extends BaseClass{
    @Discover
    public void testNotice(){
        init2();
        //点击消息
        MiaoHomePage.getClickMessage(solo);
        Log.d(TAG, "点击消息");
        solo.sleep(3000);
        //启动消息页面
        assertTrue("Activity\"feature.home.MessageActivity\"is not start", MessagePage.get_messagepage(solo));
        Log.d(TAG, "启动消息页面");
        solo.sleep(1000);

        //点击通知
        solo.clickOnText("^通知$");
        Log.d(TAG, "点击通知");
        solo.sleep(1000);

        //点击通知
        solo.clickOnView(solo.getView(MessagePage.text_reply,3));
        Log.d(TAG,"点击第四个通知");

        //进入订单详情页
        assertTrue("Activity\"OrderDetailActivity\"is not start", OrderDetailPage.get_orderdetail(solo));
        Log.d(TAG, "启动我的消息页面");
        solo.sleep(1000);

        //订单详情页点击返回
        OrderDetailPage.getBack(solo);
        solo.sleep(1000);

    }
}
