package com.meilishuo.meidian.testcase.discover;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.DiscoverPage;
import com.meilishuo.meidian.page.QuestionListPage;

/**
 * Created by MLS on 15/9/29.
 */
public class TestClickConsult extends BaseClass{
    @Discover
    public void testClickConsult() {
        init();
        //点击发现
        solo.clickOnText("^发现$");
        Log.d(TAG, "点击发现");
        solo.sleep(1000);

        //启动发现页面
        DiscoverPage.get_discover(solo);
        Log.d(TAG, "启动发现页面");
        solo.sleep(3000);

        //点击在线咨询
        DiscoverPage.getClickConsult(solo);
        solo.sleep(1000);

        //启动在线咨询页面
        QuestionListPage.get_QuestionListPage(solo);
        Log.d(TAG, "启动在线咨询页面");
        solo.sleep(3000);



    }
}
