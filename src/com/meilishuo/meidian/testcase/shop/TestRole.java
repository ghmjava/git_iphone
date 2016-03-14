package com.meilishuo.meidian.testcase.shop;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.CommonMethod;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.DianBAInfoCommitPage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.ShopPage;

/**
 * Created by MLS on 15/8/28.
 */
public class TestRole extends BaseClass {
    @Discover
    public void testRole() {
        init();
        //点击我的美店
        MiaoHomePage.getClickMeidian(solo);
        Log.d(TAG, "点击我的美店");
        solo.sleep(2000);


        //点击店铺资料
        solo.clickOnView(solo.getView(HomePage.view_profile));
        Log.d(TAG, "点击店铺资料");
        solo.sleep(2000);

        //等待ShopDetailSettingActivity启动
        ShopPage.get_shopdetail(solo);
        Log.d(TAG, "启动店铺资料页面");

        //点击身份
        solo.clickOnView(solo.getView(ShopPage.role_layout));
        Log.d(TAG, "点击身份");
        solo.sleep(1000);

        //启动身份页
        DianBAInfoCommitPage.get_bainfo(solo);
        Log.d(TAG, "启动身份页");

        //清空内容
        solo.clearEditText(0);
        solo.sleep(1000);

        //输入身份
        solo.enterText(0,"高级造型师");
        Log.d(TAG,"修改身份");
        solo.sleep(1000);

        //点击完成
        DianBAInfoCommitPage.getClickRight(solo);
        solo.sleep(2000);

        //启动Home页
        ShopPage.get_shopdetail(solo);
        solo.sleep(1000);

        //确保身份修改正确
        assertTrue(CommonMethod.get_text(solo, ShopPage.et_role, 0).equals("高级造型师"));
        Log.d(TAG,"身份修改正确");
        solo.sleep(1000);


    }
}
