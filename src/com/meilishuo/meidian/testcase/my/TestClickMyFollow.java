package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MyAttentionListPage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestClickMyFollow extends BaseClass {
    @Discover
    public void testClickMyFollow() {
        //初始化
        init();
        //点击我的关注
        solo.clickOnText("^我的关注$");
        Log.d(TAG, "点击我的关注");
        solo.sleep(1000);

        //启动我的关注页面
        MyAttentionListPage.get_MyAttentionList(solo);
        Log.d(TAG, "启动我的关注页面");
        solo.sleep(2000);

    }
}
