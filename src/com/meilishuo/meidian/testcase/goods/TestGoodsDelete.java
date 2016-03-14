package com.meilishuo.meidian.testcase.goods;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.AddShopPage;
import com.meilishuo.meidian.page.GoodsPage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.MiaoHomePage;

/**
 * Created by MLS on 15/8/26.
 */
public class TestGoodsDelete extends BaseClass{
    @Discover
    public void testGoodsDelete() {
        init();

        //点击我的美店
        MiaoHomePage.getClickMeidian(solo);
        solo.sleep(2000);

        //点击我的商品
        HomePage.getClickGoods(solo);
        solo.sleep(3000);

        //启动我的商品页面
        GoodsPage.get_GoodsList(solo);
        Log.d(TAG, "启动我的商品页面");
        solo.sleep(2000);

        //点击商品
        GoodsPage.getClickSku(solo);
        solo.sleep(1000);

        //进入编辑商品页面
        assertTrue("Activity \"GoosAddNewActivity\" is not started.", solo.waitForActivity("GoodsAddNewActivity", 30000));
        solo.sleep(2000);

        //向下滑动页面至底部
        solo.scrollToBottom();
        solo.sleep(1000);

        //点击删除商品按钮
        solo.clickOnView(solo.getView(AddShopPage.del_pic));
        Log.d(TAG, "点击删除商品按钮");
        solo.sleep(1000);

        //出现弹窗提示、提示内容、删除按钮、取消按钮
        assertTrue(solo.waitForView(solo.getView(AddShopPage.alertTitle)));
        assertTrue(solo.waitForView(solo.getView(AddShopPage.message)));
        assertTrue(solo.waitForView(solo.getView(AddShopPage.button_cancel)));
        assertTrue(solo.waitForView(solo.getView(AddShopPage.button_ok)));
        Log.d(TAG,"出现弹窗");
        solo.sleep(1000);

        //点击取消按钮
        solo.clickOnView(solo.getView(AddShopPage.button_ok));
        Log.d(TAG,"点击取消按钮");
        solo.sleep(2000);


    }
}
