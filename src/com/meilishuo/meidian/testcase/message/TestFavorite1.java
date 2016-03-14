package com.meilishuo.meidian.testcase.message;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MessagePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.ShowDetailPage;

/**
 * Created by MLS on 15/8/27.
 */
public class TestFavorite1 extends BaseClass {
    @Discover
    public void testFavorite1(){
        init();
        //点击消息
        MiaoHomePage.getClickMessage(solo);
        Log.d(TAG, "点击我的消息");
        solo.sleep(3000);
        //启动我的消息页面
        assertTrue("Activity\"feature.home.MessageActivity\"is not start", MessagePage.get_messagepage(solo));
        Log.d(TAG, "启动我的消息页面");
        solo.sleep(1000);

        //点击喜欢
        solo.clickOnText("^喜欢$");
        Log.d(TAG, "点击喜欢");
        solo.sleep(1000);

        //点击被喜欢的动态
        solo.clickOnView(solo.getView(MessagePage.product_image,1));
        Log.d(TAG, "点击被喜欢的动态");
        solo.sleep(2000);

        //启动动态详情页
        assertTrue("Activity\"ui.ShowDetailActivity\"is not start", ShowDetailPage.get_showdetail(solo));
        Log.d(TAG,"启动动态详情页");
        solo.sleep(2000);

        //点击返回至消息页
        solo.clickOnView(solo.getView(ShowDetailPage.tv_head_left));
        Log.d(TAG,"点击返回");
        solo.sleep(2000);

        //启动消息页
        assertTrue("Activity\"MessageActivity\"is not start", MessagePage.get_messagepage(solo));
        Log.d(TAG,"启动消息页");
        solo.sleep(2000);
    }


}