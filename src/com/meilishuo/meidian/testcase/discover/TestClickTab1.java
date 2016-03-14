package com.meilishuo.meidian.testcase.discover;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.DiscoverPage;
import com.meilishuo.meidian.page.ShowDetailPage;

/**
 * Created by MLS on 15/9/29.
 */
public class TestClickTab1 extends BaseClass {
    @Discover
    public void testClickRenqidaren() {
        init();
        //点击发现
        solo.clickOnText("^发现$");
        Log.d(TAG, "点击发现");
        solo.sleep(1000);

        //启动发现页面
        DiscoverPage.get_discover(solo);
        Log.d(TAG, "启动发现页面");
        solo.sleep(3000);

        //点击人气达人
        solo.clickOnText("^人气达人$");
        solo.sleep(1000);

        //用头头像、用户名、描述、图像流、创建时间、喜欢的人数、评论的人数
        assertTrue(solo.waitForView(solo.getView(DiscoverPage.user_avatar)));
        assertTrue(solo.waitForView(solo.getView(DiscoverPage.user_name)));
        assertTrue(solo.waitForView(solo.getView(DiscoverPage.user_desc)));
        assertTrue(solo.waitForView(solo.getView(DiscoverPage.question)));
        assertTrue(solo.waitForView(solo.getView(DiscoverPage.flow_layout)));
        assertTrue(solo.waitForView(solo.getView(DiscoverPage.create_time)));
        assertTrue(solo.waitForView(solo.getView(DiscoverPage.liked_count)));
        assertTrue(solo.waitForView(solo.getView(DiscoverPage.comment_count)));
        Log.d(TAG, "用头头像、用户名、描述、图像流、创建时间、喜欢的人数、评论的人数UI确认");
        solo.sleep(2000);

        //点击动态
        DiscoverPage.getClickflow_layout(solo,1);
        solo.sleep(3000);

        //进入动态详情页
        ShowDetailPage.get_showdetail(solo);
        Log.d(TAG, "启动动态详情页");
        solo.sleep(2000);

        //点击返回
        ShowDetailPage.click_left(solo);
        solo.sleep(1000);

       //向下滑动页面
        solo.scrollDown();
        solo.sleep(1000);
        solo.scrollDown();
        solo.sleep(1000);



    }
}
