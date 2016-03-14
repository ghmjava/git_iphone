package com.meilishuo.meidian.page;

import android.widget.EditText;
import com.robotium.solo.Solo;

;

/**
 * 登录页
 * @author whuyi
 *
 */
public class LoginPage {


	private static String Activity="LoginActivity";
	private static String TAG="Robotium";
	private static String tv_head_title="tv_head_title";
	private static String tv_head_left="tv_head_left";
	private static String tv_head_right="tv_head_right";
	private static String phone="register_phone";//手机号
	private static String pass="et_password";//密码
	public static String tv_login="tv_login";//登录button
	public static String tv_regist="tv_regist";//注册button
	public static String tv_login_with_verifycode="tv_login_with_verifycode";//无账号快捷登录

	
	//进入登录页
	public static boolean get_login_page(Solo solo){
		return solo.waitForActivity(Activity, 30000);
	}
	
	//输入用户名
	public static void enter_username(Solo solo,String userphone){
		solo.enterText((EditText) solo.getView(phone),userphone);
	}
	
	//输入密码
	public static void enter_pwd(Solo solo,String pwd){
		solo.enterText((EditText) solo.getView(pass),
				pwd);
	}
	
	//点击登录按钮
	public static void click_login(Solo solo){
		solo.clickOnView(solo.getView(tv_login));
	}

	//判断为登录按钮
	public static boolean get_login(Solo solo) {
		return solo.waitForActivity(Activity, 30000);
	}

}
