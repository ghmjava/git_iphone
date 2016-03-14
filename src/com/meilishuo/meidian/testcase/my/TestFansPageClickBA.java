package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.BAHomePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.SearchPersonPage;

/**
 * Created by MLS on 15/9/16.
 */
public class TestFansPageClickBA extends BaseClass {
    @Discover
    public void testFansPageClickBA() {
        //初始化
        init();
        //点击关注
        MiaoHomePage.getClickFans(solo);
        solo.sleep(2000);

        //启动粉丝页面
        SearchPersonPage.get_SearchPerson(solo);
        Log.d(TAG, "启动粉丝页面");
        solo.sleep(1000);

        //点击头像按钮
        SearchPersonPage.clickHeadPhoto(solo,1);
        Log.d(TAG, "点击头像按钮");
        solo.sleep(2000);

        //启动BA页
        BAHomePage.get_BAHome(solo);
        Log.d(TAG, "启动BA页");
        solo.sleep(2000);




    }
}
