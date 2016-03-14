package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoHomePage;

/**
 * Created by MLS on 15/9/7.
 */
public class TestUI  extends BaseClass{
    @Discover
    public void testUI() {
        //初始化
        init1();
        //标题、消息按钮、找人按钮、发帖iconUI确认
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.tv_head_title)));
       // assertTrue(CommonMethod.get_text(solo,MiaoHomePage.tv_head_title,0).equals("我"));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.message_image)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.iv_head_right)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.iv_head_right_2)));
        Log.d(TAG,"标题、消息按钮、找人按钮、发帖iconUI确认");
        solo.sleep(1000);

        //用户信息确认
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.user_portrait)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.user_profile_indicator)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.user_name)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.user_follow)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.user_fans)));
        Log.d(TAG,"用户信息UI确认");
        solo.sleep(1000);

        //我的二维码、我的美喵会员UI确认
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_title,0)));
        //assertTrue(solo.waitForView(solo.getView(MiaoHomePage.my_qr_code)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_indicator,0)));
        solo.searchText("^我的二维码$");
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_title, 1)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_indicator,1)));
        solo.searchText("^扫一扫$");
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_title, 2)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_indicator,2)));
        solo.searchText("^我的美喵会员$");
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_text_news,0)));
        Log.d(TAG,"我的二维码、我的美喵会员UI确认");
        solo.sleep(1000);

        //我的优惠券、全部订单UI确认
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_title,3)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_text_news,1)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_indicator,3)));
        solo.searchText("^全部订单$");
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_title, 4)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_indicator,4)));
        solo.searchText("^我的优惠券$");
        Log.d(TAG,"我的优惠券、全部订单UI确认");
        solo.sleep(1000);

        solo.scrollToBottom();
        solo.sleep(1000);

        //我的美店UI确认
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_title, 5)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_indicator,5)));
        solo.searchText("^我的美店$");
        Log.d(TAG,"我的美店UI确认");
        solo.sleep(1000);

        //我的关注、我的喜欢、我的发布、我的咨询、设置UI确认
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_title,6)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_indicator,6)));
        solo.searchText("^我的关注$");

        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_title, 7)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_indicator,7)));
        //assertTrue(CommonMethod.get_text(solo,MiaoHomePage.usercenter_listitem_title,6).equals("我的喜欢"));
        solo.searchText("^我的喜欢$");

        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_title,8)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_indicator,8)));
        //assertTrue(CommonMethod.get_text(solo,MiaoHomePage.usercenter_listitem_title,7).equals("我的发布"));
        solo.searchText("^我的发布$");

        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_title,9)));
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_indicator,9)));
        //assertTrue(CommonMethod.get_text(solo,MiaoHomePage.usercenter_listitem_title,8).equals("我的咨询"));
        solo.searchText("^我的咨询$");
        solo.searchText("^设置$");
        //assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_title,9)));
        //assertTrue(solo.waitForView(solo.getView(MiaoHomePage.usercenter_listitem_indicator,9)));
        //assertTrue(CommonMethod.get_text(solo,MiaoHomePage.usercenter_listitem_title,9).equals("设置"));
        Log.d(TAG,"我的关注、我的喜欢、我的发布、我的咨询、设置UI确认");
        solo.sleep(1000);

    }


}
