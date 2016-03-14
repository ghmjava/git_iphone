package com.meilishuo.meidian.testcase.income;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.CommonMethod;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.HomePage;
import com.meilishuo.meidian.page.IncomePage;
import com.meilishuo.meidian.page.MiaoHomePage;

//import com.meilisuo.meidian.init.BaseClass;

@SuppressWarnings("unchecked")
public class TestIncome extends BaseClass{
	@Discover
	public void testUser(){
		init();
		//点击我的美店
		MiaoHomePage.getClickMeidian(solo);
		solo.sleep(2000);
		//点击我的收入
		HomePage.getClickIncome(solo);
		solo.sleep(3000);

	    //等待InComeActivity启动
	    assertTrue("Activity\"InComeActivity\"is not start",solo.waitForActivity("InComeActivity"));
	    solo.sleep(1000);
	    
	    //标题、返回按钮
	    assertTrue(CommonMethod.get_title(solo).equals("我的收入"));
	    assertTrue(solo.searchText("^返回$"));
	    
	    //验证当前未提取收入、累计收入
	    assertTrue(solo.waitForView(solo.getView(IncomePage.tv_income)));
	    assertTrue(solo.searchText("^累计收入：$"));
	    assertTrue(solo.waitForView(solo.getView(IncomePage.tv_income_all)));
	    assertTrue(solo.waitForView(solo.getView(IncomePage.tv_income_tips)));
	    assertTrue(solo.searchText("^我的银行卡$"));
	    
	    //银行卡纪录
	    assertTrue(solo.waitForView(solo.getView(IncomePage.image)));
	    assertTrue(solo.waitForView(solo.getView(IncomePage.tv_name)));
	    assertTrue(solo.waitForView(solo.getView(IncomePage.tv_time)));
	    assertTrue(solo.waitForView(solo.getView(IncomePage.tv_income)));
	    assertTrue(solo.waitForView(solo.getView(IncomePage.tv_total)));
	    assertTrue(solo.waitForView(solo.getView(IncomePage.iv_array)));
	    
	    //点击我的银行卡
	    solo.clickOnText("^我的银行卡$");
	    Log.d("Robotium", "点击我的银行卡");
	    solo.sleep(1000);
	    
	    //启动BankCardAuthActivity
	    assertTrue("Activity\"BankCardAuthActivity\"is not start",solo.waitForActivity("BankCardAuthActivity"));
    	Log.d("Robotium", "进入我的银行卡页面");
    	solo.sleep(1000);
    	
    	//点击返回
    	solo.clickOnText("^返回$");
    	solo.sleep(1000);
	    
	    String tv_name,tv_name1;
	    tv_name=CommonMethod.get_text(solo, IncomePage.tv_name, 0);
	    tv_name1=CommonMethod.get_text(solo, IncomePage.tv_name, 3);
	    solo.clickOnView(solo.getView(IncomePage.tv_name));
	    solo.sleep(1000);
	    if (tv_name.equals("自动提现"))
	    {
	    	//启动AutoWithdrawalsActivity
	    	assertTrue("Activity\"AutoWithdrawalsActivity\"is not start",solo.waitForActivity("AutoWithdrawalsActivity"));
	    	Log.d("Robotium", "启动AutoWithdrawalsActivity");
	    }
	    else
	    {
	    	assertTrue("Activity\"OrderDetailActivity\"is not start",solo.waitForActivity("OrderDetailActivity"));
	    	Log.d("Robotium", "启动OrderDetailActivity");
	    }
	    solo.sleep(1000);
	    //点击返回
	    solo.clickOnText("^返回$");
	    solo.sleep(1000);
	    
	    //点击订单
	    solo.clickOnText(tv_name1);
	    solo.sleep(1000);
	    if (tv_name1.equals("自动提现"))
	    {
	    	//启动AutoWithdrawalsActivity
	    	assertTrue("Activity\"AutoWithdrawalsActivity\"is not start",solo.waitForActivity("AutoWithdrawalsActivity"));
	    	Log.d("Robotium", "启动AutoWithdrawalsActivity");
	    }
	    else
	    {
	    	assertTrue("Activity\"OrderDetailActivity\"is not start",solo.waitForActivity("OrderDetailActivity"));
	    	Log.d("Robotium", "启动OrderDetailActivity");
	    }
}
}
