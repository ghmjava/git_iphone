package com.meilishuo.meidian.testcase.test;
import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.RegistPage;

@SuppressWarnings("unchecked")
public class TestRegist extends BaseClass {
	//@Discover
	public void testRegist(){
		//初始化－退出登录

		init1();
		MiaoHomePage.getClickUser(solo);
		solo.sleep(1000);

		solo.scrollToTop();

		//点击注册
		solo.clickOnText("^注册$");
		Log.d(TAG, "click regist over");
		solo.sleep(1000);
		
		RegistPage.get_RegistPage(solo);
		Log.d(TAG,"启动注册页面");
		solo.sleep(1000);


		

	
	}
}
