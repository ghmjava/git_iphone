package com.meilishuo.meidian.init;

import com.robotium.solo.Solo;

import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.TextView;



public class CommonMethod {	
	private static DisplayMetrics dm;



	// 获取title
	public static String get_title(Solo solo) {
		TextView textview = (TextView) solo.getView("tv_head_title");
		return textview.getText().toString();
	}
	//下拉刷新
		public static void page_refresh(Solo solo) {
			dm = new DisplayMetrics();
			solo.getCurrentActivity().getWindowManager().getDefaultDisplay()
					.getMetrics(dm);
			int width = dm.widthPixels;
			int height = dm.heightPixels;
			solo.drag(width * 0.5f, height * 0.6f, width * 0.5f, height * 0.8f, 3);
		}
		// 向下滑动屏幕
		public static void down_screen(Solo solo) {
			dm = new DisplayMetrics();
			solo.getCurrentActivity().getWindowManager().getDefaultDisplay()
					.getMetrics(dm);
			int width = dm.widthPixels;
			int height = dm.heightPixels;
			solo.drag(width * 0.5f, height * 0.8f, width * 0.5f, height * 0.2f, 2);
		}
		//向上滑动屏幕
		public static void up_screen(Solo solo){
			dm = new DisplayMetrics();
			solo.getCurrentActivity().getWindowManager().getDefaultDisplay()
					.getMetrics(dm);
			int width = dm.widthPixels;
			int height = dm.heightPixels;
			solo.drag(width * 0.5f, height * 0.5f, width * 0.5f, height * 0.8f, 2);
		}
//		public static Object get_title1(
//				com.jayway.android.robotium.solo.Solo solo) {
//			// TODO Auto-generated method stub
//			return null;
//		}
		// 根据id获取文本
		public static String get_text(Solo solo, String id, int index) {
			TextView textview = (TextView) solo.getView(id, index);
	        Log.d("Robotium", "get textview:"+textview.getText().toString());
	        return textview.getText().toString();
		}
	
}