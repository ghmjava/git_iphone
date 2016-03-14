package com.meilishuo.meidian.testcase.discover;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.DiscoverPage;

/**
 * Created by MLS on 15/9/29.
 */
public class TestDiscoverUI extends BaseClass {
    @Discover
    public void testDisCoverUI() {
        init();
        //点击发现
        solo.clickOnText("^发现$");
        Log.d(TAG, "点击发现");
        solo.sleep(1000);

        //启动发现页面
        DiscoverPage.get_discover(solo);
        Log.d(TAG, "启动发现页面");
        solo.sleep(3000);

        //标题、扫一扫、在线咨询、牛人推荐模块、tabUI
        assertTrue(solo.waitForView(solo.getView(DiscoverPage.tv_head_title)));
        assertTrue(solo.waitForView(solo.getView(DiscoverPage.iv_head_right)));
        assertTrue(solo.waitForView(solo.getView(DiscoverPage.consult)));
        assertTrue(solo.waitForView(solo.getView(DiscoverPage.recommend)));
        assertTrue(solo.waitForText("^全部$"));
        assertTrue(solo.waitForText("^人气达人$"));
        assertTrue(solo.waitForText("^晒单精选$"));
        Log.d(TAG, "标题、扫一扫、在线咨询、牛人推荐模块、tabUI确认");
        solo.sleep(2000);

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

        //向下滑动页面
        solo.scrollDown();
        solo.sleep(1000);


    }
}
