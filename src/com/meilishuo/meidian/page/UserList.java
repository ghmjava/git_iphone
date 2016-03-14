package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

public class UserList {
	public static String TAG="Robotium";
	public static String view_users="view_users";
	public static String txt_left="txt_left";
	public static String url="url";
	public static String tv_name="tv_name";
	public static String tv_phone="tv_phone";
	public static String tv_amount="tv_amount";
	public static String tv_total="tv_total";
	public static String iv_array="iv_array";
	public static String Activity="UsersListActivity";
	public static void getHome(Solo solo){
		Log.d(TAG, "点击返回");
		solo.clickOnView(solo.getView(txt_left));
	}
	

}
