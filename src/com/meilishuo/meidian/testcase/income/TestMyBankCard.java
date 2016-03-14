package com.meilishuo.meidian.testcase.income;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.BankCardAuthPage;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.IncomePage;
import com.meilishuo.meidian.page.MiaoHomePage;

//import com.meilisuo.meidian.init.BaseClass;

@SuppressWarnings("unchecked")
public class TestMyBankCard extends BaseClass{
	@Discover
	public void testBankCard(){
		init();

		//点击我的美店
		MiaoHomePage.getClickMeidian(solo);
		solo.sleep(2000);
		//点击我的收入
		HomePage.getClickIncome(solo);
		solo.sleep(3000);
        //点击我的银行卡
		solo.clickOnView(solo.getView(IncomePage.tv_my_bank));
		Log.d("Robotium", "点击我的银行卡");
		solo.sleep(1000);
	    
		//启动BankCardAuthActivity
		assertTrue("Activity\"BankCardAuthActivity\"is not start",solo.waitForActivity("BankCardAuthActivity"));
		Log.d("Robotium", "启动我的银行卡");
		
		//标题确认、返回按钮、确定按钮
		assertTrue(solo.waitForView(solo.getView(BankCardAuthPage.tv_head_title)));
		assertTrue(solo.waitForView(solo.getView(BankCardAuthPage.tv_head_left)));
		assertTrue(solo.waitForView(solo.getView(BankCardAuthPage.tv_head_right)));
		
	   //验证码
		assertTrue(solo.waitForView(solo.getView(BankCardAuthPage.iv_code)));
		assertTrue(solo.waitForView(solo.getView(BankCardAuthPage.register_captcha)));
		assertTrue(solo.waitForView(solo.getView(BankCardAuthPage.tv_get_captha)));
		assertTrue(solo.searchText("为保障您的资金安全，请获取并输入短信验证码"));
		
	    //assertTrue(solo.isRadioButtonChecked("获取验证码"));
	    
	    //点击返回
	    solo.clickOnText("^返回$");
	    Log.d("Robotium", "点击返回");
	    solo.sleep(1000);
	    
	    //启动InComeActivity
	   solo.waitForActivity(IncomePage.Activity);
	   Log.d("Robotium", "启动InComeActivity");
	   solo.sleep(1000);
}
}