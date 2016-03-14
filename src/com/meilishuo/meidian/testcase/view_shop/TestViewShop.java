package com.meilishuo.meidian.testcase.view_shop;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.page.BAHomePage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;

/**
 * Created by MLS on 15/9/5.
 */
public class TestViewShop extends BaseClass {
   // @TestCase
    public void testClickCover() {
        init();
        //点击我的美店
        MiaoHomePage.getClickMeidian(solo);
        Log.d(TAG, "点击我的美店");
        solo.sleep(2000);

        //启动美店主页
        HomePage.get_home(solo);
        Log.d(TAG,"启动美店主页");
        solo.sleep(1000);

        //点击店铺预览
        HomePage.getClickViewShop(solo);
        solo.sleep(1000);


        //启动BA个人主页
        BAHomePage.get_BAHome(solo);
        Log.d(TAG,"启动BA个人主页");
        solo.sleep(1000);



    }
    }
