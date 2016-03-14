package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoHomePage;

/**
 * Created by MLS on 15/9/17.
 */
public class TestQrCode extends BaseClass {
    @Discover
    public void testQrCode() {
        //初始化
        init();
        //点击我的二维码
        MiaoHomePage.getClickQrCode(solo);
        solo.sleep(1000);

        //出现二维码
        assertTrue(solo.waitForView(solo.getView(MiaoHomePage.qrcode)));
        assertTrue(solo.waitForText("^扫二维码，加我关注$"));
        Log.d(TAG,"出现二维码");





    }
}
