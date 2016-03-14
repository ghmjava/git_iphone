package com.meilishuo.meidian.init;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import com.meilishuo.meidian.page.LoginPage;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15-4-27.
 */
public class BaseClass extends ActivityInstrumentationTestCase2{
    public static final String TAG = "Robotium";
    //    public static final String TARGET_PACKAGE_ID = "com.meilishuo.meidian";
    public static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.meilishuo.meimiao.feature.home.MainActivity";
    public static Class<?> launcherActivityClass;
    public static Solo solo;
    static {
        try {
            launcherActivityClass = Class
                    .forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public BaseClass() {
        super(launcherActivityClass);
    }

    public void init() {
        solo=new Solo(getInstrumentation(),getActivity());
        if(solo.waitForText("^允许$")){
            solo.clickOnText("^允许$");
            solo.sleep(1000);
        }
        if (solo.waitForText("发现新版本",1,3000)){
            solo.clickOnText("以后再说");
        }
        solo.sleep(3000);

        solo.clickOnView(solo.getView("iv_user"));
        solo.sleep(1000);
        login("13820276123", "123456");
    }
    public void init2() {
        solo=new Solo(getInstrumentation(),getActivity());
        if (solo.waitForText("发现新版本",1,3000)){
            solo.clickOnText("以后再说");
        }
        solo.sleep(3000);

        solo.clickOnView(solo.getView("iv_user"));
        solo.sleep(1000);
        login("18500383830","123123");
    }
    //初始化－不登录
    public void init1() {
        solo=new Solo(getInstrumentation(),getActivity());
        if (solo.waitForText("发现新版本",1,3000)){
            solo.clickOnText("以后再说");
        }
        solo.sleep(3000);

        solo.clickOnView(solo.getView("iv_user"));
        solo.sleep(1000);
        login1();
    }


    public void login(String name, String pass) {
        // 等待欢迎页面完成
        if (solo.searchButton("^登录$", true)) {

            solo.sleep(2000);
            Log.d("Robotium","环境修改");
            solo.clickOnView(solo.getView("login_btn"));
            solo.sleep(1000);
            solo.clickOnView(solo.getView("tv_api"));
            solo.clickOnText("mobapi");

            solo.enterText(0, name);
            solo.enterText(1, pass);
            Log.d("Robotium", "enter over");
            solo.clickOnView(solo.getView("tv_login"));

        }else{

            Log.d(TAG,"已登录退出登录");
            solo.scrollDown();
            logout();
            Log.d("Robotium", "环境修改");
            solo.scrollToTop();
            solo.sleep(1000);
            solo.clickOnView(solo.getView("login_btn"));
            solo.sleep(1000);
            solo.clickOnView(solo.getView("tv_api"));
            solo.sleep(1000);
            solo.clickOnText("mobapi");

            solo.enterText(0, name);
            solo.enterText(1, pass);
            Log.d("Robotium", "enter over");
            solo.clickOnView(solo.getView("tv_login"));
            solo.sleep(2000);

        }
        solo.sleep(2000);
    }

    public void login1() {
        // 等待欢迎页面完成
        if (solo.searchButton("^登录$", true)) {

            solo.sleep(1000);

        }
        else
        {

            Log.d(TAG,"已登录退出登录");
            solo.scrollDown();
            logout();


        }
        solo.sleep(1000);
    }

    //输入用户名、密码登录
    public void login2(String name, String pass) {
        solo.enterText(0,"13820276123");
        solo.enterText(1,"123456");
        Log.d(TAG, "输入用户名、密码");
        solo.sleep(1000);
        solo.clickOnView(solo.getView(LoginPage.tv_login));
        Log.d(TAG, "点击登录按钮");
        solo.sleep(2000);
    }


    public void logout(){

        Log.d(TAG,"退出登录");
        solo.clickOnText("^设置$");
        solo.sleep(1000);
        solo.clickOnView(solo.getView("tv_login_out"));
        solo.sleep(1000);
    }

    @Override
    protected void setUp() throws Exception{
        solo = new Solo(getInstrumentation(), getActivity());
    }
}
