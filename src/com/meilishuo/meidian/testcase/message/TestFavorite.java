package com.meilishuo.meidian.testcase.message;

import android.util.Log;
import android.view.KeyEvent;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MessagePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.ReviewDetailPage;

//import com.meilisuo.meidian.init.BaseClass;

@SuppressWarnings("unchecked")
public class TestFavorite extends BaseClass{
	@Discover
	public void testFavorite(){

		init();
		//点击消息
		MiaoHomePage.getClickMessage(solo);
		Log.d(TAG, "点击我的消息");
		solo.sleep(3000);
		//启动我的消息页面
		assertTrue("Activity\"MessageActivity\"is not start", MessagePage.get_messagepage(solo));
		Log.d(TAG, "启动我的消息页面");
		solo.sleep(1000);
		
		//点击喜欢
		solo.clickOnText("^喜欢$");
		Log.d(TAG, "点击喜欢");
		solo.sleep(1000);
		
		
	   //UI页面确定
		assertTrue(solo.waitForView(solo.getView(MessagePage.reply_icon)));
		assertTrue(solo.waitForView(solo.getView(MessagePage.reply_nickname)));
		assertTrue(solo.waitForView(solo.getView(MessagePage.like_reply)));
		assertTrue(solo.waitForView(solo.getView(MessagePage.reply_time)));
		assertTrue(solo.waitForView(solo.getView(MessagePage.product_image)));

		//点击被喜欢的第一条评论
		MessagePage.click_first_like(solo);

		//启动晒单详情页
		assertTrue("Activity\"ui.ReviewDetailActivity\"is not start", ReviewDetailPage.get_reviewdetail(solo));
		Log.d(TAG,"启动晒单详情页");
		solo.sleep(2000);

		//点击返回至消息页
        solo.clickOnView(solo.getView(ReviewDetailPage.tv_head_left));
		Log.d(TAG,"点击返回");
		solo.sleep(2000);

		//启动消息页
		assertTrue("Activity\"MessageActivity\"is not start", MessagePage.get_messagepage(solo));
		Log.d(TAG,"启动消息页");
		solo.sleep(2000);

		//下滑页面
		solo.scrollToBottom();
		solo.sleep(1000);
		
		//上滑页面
		solo.scrollToTop();
		solo.sleep(1000);
		
		//向右滑屏
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_RIGHT);
	    solo.sleep(1000);
	    
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_RIGHT);
	    solo.sleep(1000);
	   
	    
	    //向左滑动
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_LEFT);
	    solo.sleep(1000);
	    
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_LEFT);
	    solo.sleep(1000);
	    
	    solo.scrollToSide(KeyEvent.KEYCODE_DPAD_LEFT);
	    solo.sleep(1000);
		
	    
}
}