package com.meilishuo.meidian.testcase.message;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.page.CameraPage;
import com.meilishuo.meidian.page.IMGroupPage;
import com.meilishuo.meidian.page.MessagePage;
import com.meilishuo.meidian.page.MiaoHomePage;


@SuppressWarnings("unchecked")
public class TestSendPhoto extends BaseClass{

	public void testSendPhoto(){
		init();

		//点击我的消息
		MiaoHomePage.getClickMessage(solo);
		Log.d(TAG, "点击消息");
		solo.sleep(3000);
		//启动我的消息页面
		assertTrue("Activity\"MessageActivity\"is not start", MessagePage.get_messagepage(solo));
		Log.d(TAG, "启动我的消息页面");
		solo.sleep(1000);
		
		//点击第一个消息
		MessagePage.click_firstmessage(solo);
		Log.d(TAG, "点击第一个消息");
		solo.sleep(1000);
		
		//启动群聊页面
		assertTrue("Activity\"IMGroupActivity\"is not start", IMGroupPage.get_IMGrouppage(solo));
		Log.d(TAG, "启动群聊页面");
		solo.sleep(1000);
		
		
	   //点击添加按钮
		solo.clickOnView(solo.getView(IMGroupPage.add));
		Log.d(TAG, "点击添加按钮");
		solo.sleep(1000);

	   //点击照片
	   solo.clickOnView(solo.getView(IMGroupPage.img,0));
	   Log.d(TAG, "点击照片按钮");
	   solo.sleep(1000);
	   
	 //启动照相页面
	 	assertTrue("Activity\"camera.CameraActivity\"is not start",solo.waitForActivity(CameraPage.CameraActivity));
	 	Log.d(TAG, "启动拍照页面");
	    solo.sleep(1000);
	    
	    //点击拍照
	    solo.clickOnView(solo.getView(CameraPage.button_capture));
		Log.d(TAG, "点击拍照");
	    solo.sleep(2000);

		//启动群聊页面
		assertTrue(IMGroupPage.get_IMGrouppage(solo));
		Log.d(TAG, "启动群聊页面");
		solo.sleep(2000);

	    
	}
}