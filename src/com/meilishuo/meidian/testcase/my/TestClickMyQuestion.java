package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MyQuestionListPage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestClickMyQuestion extends BaseClass {
    @Discover
    public void testClickMyQuestion() {
        //初始化
        init();
        solo.scrollToBottom();
        solo.sleep(1000);
        //点击我的咨询
        solo.clickOnText("^我的咨询$");
        Log.d(TAG, "点击我的咨询");
        solo.sleep(1000);

        //启动我的咨询页面
        MyQuestionListPage.get_MyQuestionList(solo);
        Log.d(TAG, "启动我的咨询页面");
        solo.sleep(2000);

    }
}
