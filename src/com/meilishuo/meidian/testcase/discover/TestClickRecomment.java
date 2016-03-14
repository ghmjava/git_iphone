package com.meilishuo.meidian.testcase.discover;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.DiscoverPage;
import com.meilishuo.meidian.page.RecommendUserListPage;

/**
 * Created by MLS on 15/9/29.
 */
public class TestClickRecomment extends BaseClass {
    @Discover
    public void testClickRecoment() {
        init();
        //点击发现
        solo.clickOnText("^发现$");
        Log.d(TAG, "点击发现");
        solo.sleep(1000);

        //启动发现页面
        DiscoverPage.get_discover(solo);
        Log.d(TAG, "启动发现页面");
        solo.sleep(3000);

        //点击牛人推荐
        DiscoverPage.getClickRecomment(solo);
        solo.sleep(1000);

        //启动推荐页面
        RecommendUserListPage.get_RecommentListPage(solo);
        Log.d(TAG, "启动推荐页面");
        solo.sleep(3000);



    }
}
