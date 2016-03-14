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
public class TestAutoWithdrawals extends BaseClass{

	@Discover
	public void testUser(){
		init();
		//点击我的美店
		MiaoHomePage.getClickMeidian(solo);
		solo.sleep(2000);
		//点击我的收入
		HomePage.getClickIncome(solo);
		solo.sleep(3000);

	    
	    //点击自动提现
	    solo.clickOnText("^自动提现$");
	    Log.d("Robotium", "点击自动提现");
	    solo.sleep(1000);
	    
	   //等待AutoWithdrawalsActivity启动
	    assertTrue("Activity\"AutoWithdrawalsActivity\"is not start",solo.waitForActivity("AutoWithdrawalsActivity"));
	    solo.sleep(1000);
	    
	    
	    //标题、返回按钮
	    assertTrue(CommonMethod.get_title(solo).equals("自动提现"));
	    assertTrue(solo.searchText("^返回$"));
	    
	    //提现信息
	    assertTrue(solo.searchText("^提现信息$"));
	    assertTrue(solo.searchText("^提现状态：$"));
	    assertTrue(solo.waitForView(solo.getView(IncomePage.tv_withdrawals_state)));
	    assertTrue(solo.searchText("^提现时间：$"));
	    //assertTrue(solo.searchText("提 现 人"));
	    assertTrue(solo.waitForView(solo.getView(IncomePage.tv_withdrawals_people)));
	   //í assertTrue(solo.searchText("提 现 至"));
	    assertTrue(solo.waitForView(solo.getView(IncomePage.tv_withdrawals_num)));
	  
	    //点击返回按钮
	    solo.clickOnText("^返回$");
	    Log.d("Robotium", "点击返回按钮");
	    solo.sleep(1000);
}
}
