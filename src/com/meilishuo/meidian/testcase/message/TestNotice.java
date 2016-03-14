package com.meilishuo.meidian.testcase.message;

import android.util.Log;
import android.view.KeyEvent;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MessagePage;
import com.meilishuo.meidian.page.MiaoHomePage;

//import com.meilisuo.meidian.init.BaseClass;

@SuppressWarnings("unchecked")
public class TestNotice extends BaseClass{
	@Discover
	public void testNotice(){
		init();
		//点击消息
		MiaoHomePage.getClickMessage(solo);
		Log.d(TAG, "点击消息");
		solo.sleep(3000);
		//启动消息页面
		assertTrue("Activity\"feature.home.MessageActivity\"is not start", MessagePage.get_messagepage(solo));
		Log.d(TAG, "启动消息页面");
		solo.sleep(1000);
		
		//点击通知
		solo.clickOnText("^通知$");
		Log.d(TAG, "点击通知");
		solo.sleep(1000);
		
		
	   //UI页面确定
		assertTrue(solo.waitForView(solo.getView(MessagePage.reply_icon)));
		assertTrue(solo.waitForView(solo.getView(MessagePage.reply_nickname)));
		assertTrue(solo.waitForView(solo.getView(MessagePage.comment_time)));
		assertTrue(solo.waitForView(solo.getView(MessagePage.text_reply)));
		Log.d(TAG, "UI正确");
		solo.sleep(1000);

		//点击通知
		MessagePage.click_first_notice(solo);
		Log.d(TAG,"点击第一个通知");
		solo.sleep(1000);

		//点击返回
		solo.clickOnText("^返回$");
		solo.sleep(1000);
		//下滑页面
		solo.scrollToBottom();
		Log.d(TAG, "下滑页面");
		solo.sleep(1000);
		
		//上滑页面
		solo.scrollToTop();
		Log.d(TAG, "上滑页面");
		solo.sleep(1000);
		
		
	    //向左滑动
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_LEFT);
	    solo.sleep(1000);
	    
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_LEFT);
	    solo.sleep(1000);
	    
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_LEFT);
		Log.d(TAG, "向左滑动页面");
	    solo.sleep(1000);

		//点击返回
		MessagePage.click_left(solo);
		Log.d(TAG, "点击返回");
		solo.sleep(1000);


}
}