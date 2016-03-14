package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MyFavoriteListPage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestClickMyFavorite extends BaseClass {
    @Discover
    public void testClickMMyFavorite() {
        //初始化
        init();
        solo.scrollToBottom();
        solo.sleep(1000);
        //点击我的喜欢
        solo.clickOnText("^我的喜欢$");
        Log.d(TAG, "点击我的喜欢");
        solo.sleep(1000);

        //启动我的喜欢页面
        MyFavoriteListPage.get_MyFavoriteList(solo);
        Log.d(TAG, "启动我的喜欢页面");
        solo.sleep(2000);

    }
}
