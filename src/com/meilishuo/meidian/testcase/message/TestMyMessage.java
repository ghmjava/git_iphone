package com.meilishuo.meidian.testcase.message;

import android.util.Log;
import android.view.KeyEvent;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.CommonMethod;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MessagePage;
import com.meilishuo.meidian.page.MiaoHomePage;


@SuppressWarnings("unchecked")
public class TestMyMessage extends BaseClass{
	@Discover
	public void testMyMessage(){
		init();

		//点击消息
		MiaoHomePage.getClickMessage(solo);
		Log.d(TAG, "点击消息");
		solo.sleep(3000);
		//启动我的消息页面
		assertTrue("Activity\"ui.MessageActivity\"is not start", MessagePage.get_messagepage(solo));
		Log.d(TAG, "启动消息页面");
		solo.sleep(1000);
		
		//标题确认、返回按钮
		assertTrue(CommonMethod.get_title(solo).equals("我的消息"));
		Log.d(TAG, "标题确认");
		assertTrue(solo.waitForView(solo.getView(MessagePage.tv_head_left)));
		Log.d(TAG, "返回按钮确认");
		solo.sleep(1000);
		
	   //消息、喜欢、评论、通知模块确认
		assertTrue(CommonMethod.get_text(solo, MessagePage.tv_tab, 0).equals("消息"));
		assertTrue(CommonMethod.get_text(solo, MessagePage.tv_tab, 1).equals("喜欢"));
		assertTrue(CommonMethod.get_text(solo, MessagePage.tv_tab, 2).equals("评论"));
		assertTrue(CommonMethod.get_text(solo, MessagePage.tv_tab, 3).equals("通知"));
		Log.d(TAG, "消息、喜欢、评论、通知模块存在");
		assertTrue(solo.waitForView(solo.getView(MessagePage.tv_remind)));
		Log.d(TAG, "消息提醒");
		//验证消息的头像、用户名、时间、消息内容
		assertTrue(solo.waitForView(solo.getView(MessagePage.avatar_icon)));
		assertTrue(solo.waitForView(solo.getView(MessagePage.tv_remind,1)));
		assertTrue(solo.waitForView(solo.getView(MessagePage.tv_nickname)));
		assertTrue(solo.waitForView(solo.getView(MessagePage.tv_content)));
		assertTrue(solo.waitForView(solo.getView(MessagePage.tv_time)));
		Log.d(TAG, "验证消息的头像、用户名、时间、消息内容");
		//下滑页面
		solo.scrollDown();
		Log.d(TAG, "下滑页面");
		//上滑页面
		solo.scrollUp();
		Log.d(TAG, "上滑页面");
		//向右滑屏
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_RIGHT);
	    solo.sleep(1000);
	    
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_RIGHT);
	    solo.sleep(1000);
	    
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_RIGHT);
	    solo.sleep(1000);
		Log.d(TAG, "向右滑动页面");
	    //向左滑动
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_LEFT);
	    solo.sleep(1000);
	    
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_LEFT);
	    solo.sleep(1000);
	    
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_LEFT);
	    solo.sleep(1000);
		Log.d(TAG, "向左滑页面");

		//点击返回按钮
		solo.clickOnView(solo.getView(MessagePage.tv_head_left));
		Log.d(TAG, "点击返回");
		solo.sleep(1000);

		//启动MiaoHomeActivity
		assertTrue("Activity\"HomeActivity\"is not start", MiaoHomePage.get_home(solo));
		Log.d(TAG, "启动美喵主页");
		solo.sleep(1000);

}
}