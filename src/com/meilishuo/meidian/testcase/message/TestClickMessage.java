package com.meilishuo.meidian.testcase.message;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.IMGroupPage;
import com.meilishuo.meidian.page.MessagePage;
import com.meilishuo.meidian.page.MiaoHomePage;


@SuppressWarnings("unchecked")
public class TestClickMessage extends BaseClass{

	@Discover
	public void testClickMessage(){
		init();
		//点击我的消息
		MiaoHomePage.getClickMessage(solo);
		Log.d(TAG, "点击消息");
		solo.sleep(3000);
		//启动我的消息页面
		assertTrue("Activity\"MessageActivity\"is not start",MessagePage.get_messagepage(solo));
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

		//UI确定
		assertTrue(solo.waitForView(solo.getView(IMGroupPage.avatar)));
		assertTrue(solo.waitForView(solo.getView(IMGroupPage.group_owner_name)));
		assertTrue(solo.waitForView(solo.getView(IMGroupPage.group_owner_brand)));
		assertTrue(solo.waitForView(solo.getView(IMGroupPage.txt_left)));
		//时间
		assertTrue(solo.waitForView(solo.getView(IMGroupPage.time)));
		assertTrue(solo.waitForView(solo.getView(IMGroupPage.txt_content)));
		assertTrue(solo.waitForView(solo.getView(IMGroupPage.user_name)));

		//添加按钮、评论、发送
		assertTrue(solo.waitForView(solo.getView(IMGroupPage.add)));
		assertTrue(solo.waitForView(solo.getView(IMGroupPage.comment)));
		assertTrue(solo.waitForView(solo.getView(IMGroupPage.send)));
		Log.d(TAG, "UI正确");
		//在评论框中输入内容
		solo.enterText(0, "你好");
		Log.d(TAG, "在评论框中输入“你好”");
		solo.sleep(1000);
		//点击发送
		solo.clickOnView(solo.getView(IMGroupPage.send));
		Log.d(TAG, "发送消息");
		solo.sleep(1000);


		//点击添加按钮
		solo.clickOnView(solo.getView(IMGroupPage.add));
		Log.d(TAG, "点击添加按钮");
		solo.sleep(1000);

		//出现添加照片、商品按钮
		assertTrue(solo.waitForView(solo.getView(IMGroupPage.img)));
		solo.searchText("商品");
		solo.searchText("商品");
		Log.d(TAG, "出现添加照片、商品按钮");
		solo.sleep(1000);

		//下拉页面
		solo.scrollToBottom();
		Log.d(TAG, "下拉页面");

		//点击返回按钮
		solo.clickOnView(solo.getView(IMGroupPage.txt_left));
		Log.d(TAG, "点击返回");
		solo.sleep(1000);

		//启动MessageActivity
		assertTrue("Activity\"MessageActivity\"is not start", MessagePage.get_messagepage(solo));
		Log.d(TAG, "启动我的消息页面");
		solo.sleep(1000);










	}
}