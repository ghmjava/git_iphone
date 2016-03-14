package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.SearchPersonPage;

/**
 * Created by MLS on 15/9/16.
 */
public class TestFollowPageClickSearchBox extends BaseClass{
    @Discover
    public void testFollowPageClickSearchBox() {
        //初始化
        init();
        //点击关注
        MiaoHomePage.getClickFollow(solo);
        solo.sleep(2000);

        //启动关注页面
        SearchPersonPage.get_SearchPerson(solo);
        Log.d(TAG, "启动关注页面");
        solo.sleep(1000);

        //点击搜索框按钮
        SearchPersonPage.clickSearch(solo);
        solo.sleep(1000);

        //搜索框中输入gaogao
        solo.enterText(0,"gaogao");
        Log.d(TAG,"输入gaogao");
        solo.sleep(2000);

        //搜索结果出现
        assertTrue(solo.waitForView(solo.getView(SearchPersonPage.head_photo)));
        Log.d(TAG, "搜索结果出现");
        solo.sleep(1000);

    }

}
