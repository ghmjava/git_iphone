package com.meilishuo.meidian.testcase.message;

import android.util.Log;
import android.view.KeyEvent;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MessagePage;
import com.meilishuo.meidian.page.MiaoHomePage;

//import com.meilisuo.meidian.init.BaseClass;

@SuppressWarnings("unchecked")
public class TestReply extends BaseClass{
	@Discover
	public void testReply(){
		init();
		//点击消息
		MiaoHomePage.getClickMessage(solo);
		Log.d(TAG, "点击消息");
		solo.sleep(3000);
		//启动我的消息页面
		assertTrue("Activity\"MessageActivity\"is not start", MessagePage.get_messagepage(solo));
		Log.d(TAG, "启动消息页面");
		solo.sleep(1000);
		
		//点击评论
		solo.clickOnText("^评论$");
		Log.d(TAG, "点击评论");
		solo.sleep(1000);
		
		
	   //UI页面确定
		assertTrue(solo.waitForView(solo.getView(MessagePage.reply_icon)));
		assertTrue(solo.waitForView(solo.getView(MessagePage.reply_nickname)));
		assertTrue(solo.waitForView(solo.getView(MessagePage.text_reply)));
		assertTrue(solo.waitForView(solo.getView(MessagePage.product_image)));
		assertTrue(solo.waitForView(solo.getView(MessagePage.reply_time)));
		Log.d(TAG, "UI页面确定");
		solo.sleep(1000);


		
		//下滑页面
		solo.scrollToBottom();
		Log.d(TAG, "下滑页面");
		solo.sleep(1000);
		
		//上滑页面
		solo.scrollToTop();
		Log.d(TAG, "上滑页面");
		solo.sleep(1000);
		
		//向右滑屏
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_RIGHT);
		Log.d(TAG, "向右滑屏");
	    solo.sleep(1000);
	   
	    
	    //向左滑动
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_LEFT);
		Log.d(TAG, "向左滑动");
	    solo.sleep(1000);
	    
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_LEFT);
		Log.d(TAG, "向左滑动");
	    solo.sleep(1000);
	    
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_LEFT);
		Log.d(TAG, "向左滑动");
	    solo.sleep(1000);
		
	    
}
}