package com.meilishuo.meidian.testcase.message;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.CommonMethod;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.IMGroupPage;
import com.meilishuo.meidian.page.MessagePage;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.SelectGoodsListPage;


@SuppressWarnings("unchecked")
public class TestSendGoods extends BaseClass{
	@Discover
	public void testSendGoods(){
		init();

		//点击消息
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
	
	   //出现添加照片、商品按钮
	    assertTrue(solo.waitForView(solo.getView(IMGroupPage.img)));
		Log.d(TAG, "商品、照片的图像出现");
		solo.sleep(1000);
	    solo.searchText("商品");
	    solo.searchText("照片");
		Log.d(TAG, "商品、照片文案");
		solo.sleep(1000);
	   //点击商品
	   solo.clickOnView(solo.getView(IMGroupPage.img,1));
	   Log.d(TAG, "点击商品按钮");
	   solo.sleep(1000);
	   
	 //启动选择商品页面
	 	assertTrue("Activity\"SelectGoodListActivity\"is not start",solo.waitForActivity(SelectGoodsListPage.SelectGoodsListActivity));
	 	Log.d(TAG, "启动选择商品页面");
	    solo.sleep(1000);
	    
	    //标题、完成、返回页面
	    assertTrue(solo.waitForView(solo.getView(SelectGoodsListPage.tv_head_left)));
		Log.d(TAG, "返回UI检查");
	    assertTrue(solo.waitForView(solo.getView(SelectGoodsListPage.tv_head_right)));
		Log.d(TAG, "完成UI");
	    assertTrue(CommonMethod.get_title(solo).equals("本店妆品"));
		Log.d(TAG, "标题检查");
	    
	    //图像等确认
	    assertTrue(solo.waitForView(solo.getView(SelectGoodsListPage.cover)));
	    assertTrue(solo.waitForView(solo.getView(SelectGoodsListPage.radio)));
	    assertTrue(solo.waitForView(solo.getView(SelectGoodsListPage.title)));
	   // assertTrue(solo.waitForView(solo.getView(SelectGoodsListPage.tv_date)));
	    assertTrue(solo.waitForView(solo.getView(SelectGoodsListPage.price)));

		Log.d(TAG, "商品UI检查");
	    
	    
	    
	    //点击商品
	    solo.clickOnView(solo.getView(SelectGoodsListPage.cover));
		Log.d(TAG, "点击商品");
	    solo.sleep(2000);
	    
	    //点击完成
	    solo.clickOnText("^完成$");
		Log.d(TAG, "点击完成");
	    solo.sleep(2000);

		//启动群聊页面
		assertTrue("Activity\"IMGroupActivity\"is not start", IMGroupPage.get_IMGrouppage(solo));
		Log.d(TAG, "启动群聊页面");
		solo.sleep(1000);


	}
}