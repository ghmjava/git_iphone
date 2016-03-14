package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.SearchPersonPage;

/**
 * Created by MLS on 15/9/16.
 */
public class TestFollowUI extends BaseClass {
    @Discover
    public void testFollowUI() {
        //初始化
        init();
        //点击关注
        MiaoHomePage.getClickFollow(solo);
        solo.sleep(2000);

        //启动关注页面
        SearchPersonPage.get_SearchPerson(solo);
        Log.d(TAG, "启动关注页面");
        solo.sleep(1000);

        //页面标题、返回按钮、找人icon存在
        assertTrue(solo.waitForView(solo.getView(SearchPersonPage.tv_head_title)));
        assertTrue(solo.waitForView(solo.getView(SearchPersonPage.tv_head_left)));
        assertTrue(solo.waitForView(solo.getView(SearchPersonPage.iv_head_right)));
        assertTrue(SearchPersonPage.get_title(solo).equals("关注"));
        Log.d(TAG,"页面标题、返回按钮、找人icon存在");
        solo.sleep(1000);

        //搜索框、用户头像、昵称、关注／相互关注按钮
        assertTrue(solo.waitForView(solo.getView(SearchPersonPage.head_photo)));
        assertTrue(solo.waitForView(solo.getView(SearchPersonPage.et_search)));
        assertTrue(solo.waitForView(solo.getView(SearchPersonPage.user_name)));
        assertTrue(solo.waitForView(solo.getView(SearchPersonPage.button)));
        Log.d(TAG,"搜索框、用户头像、昵称、关注／相互关注按钮存在");
        solo.sleep(1000);




    }
}
