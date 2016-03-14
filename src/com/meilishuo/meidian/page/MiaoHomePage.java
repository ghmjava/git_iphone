package com.meilishuo.meidian.page;
import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/8/25.
 */
public class MiaoHomePage {
    public static final String TAG = "Robotium";
    public static String Activity="feature.home.MainActivity";
    public static String iv_user="iv_user";//我的
    public static String user_portrait="user_portrait";//头像
    public static String user_profile_indicator="user_profile_indicator";//用户信息 箭头
    public static String login_btn="login_btn";//登录
    public static String register="register_btn";//注册
    public static String usercenter_listitem_title="usercenter_listitem_title"; //我的二维码
    public static String my_qr_code="my_qr_code"; //二维码缩图
    public static String qrcode="qrcode"; //二维码
    public static String usercenter_listitem_indicator="usercenter_listitem_indicator";//二维码箭头
    public static String message_image="message_image";//消息
    public static String tv_head_title="tv_head_title";//标题
    public static String iv_head_right="iv_head_right";//发帖iCON
    public static String iv_head_right_2="iv_head_right_2";//找人
    public static String iv_explore="iv_explore";//发现icon
    public static String iv_qa="iv_qa";//咨询icon
    public static String item_map="item_map";//地图icon
    public static String iv_message="iv_message";//会员icon
    public static String user_name="user_name";//用户名
    public static String user_follow="user_follow";//关注
    public static String user_fans="user_fans";//粉丝
    public static String usercenter_listitem_text_news="usercenter_listitem_text_news";//会员用户到期日期／优惠券未使用数量

    public static void getClickUser(Solo solo){
        Log.d(TAG,"点击我的");
        solo.clickOnView(solo.getView(iv_user));
    }

    public static void getClickMeidian(Solo solo){
        Log.d(TAG,"点击我的美店");
        solo.clickOnView(solo.getView(usercenter_listitem_title,5));
    }

    public static void getClickLogin(Solo solo){
        Log.d(TAG,"点击登录");
        solo.clickOnView(solo.getView(login_btn));
    }

    public static void getClickRegister(Solo solo){
        Log.d(TAG,"点击注册");
        solo.clickOnView(solo.getView(register));
    }


    public static void getClickMessage(Solo solo){
        Log.d(TAG,"点击消息");
        solo.clickOnView(solo.getView(message_image));
    }

    public static void getClickList(Solo solo,int num){
        solo.clickOnView(solo.getView(usercenter_listitem_title,num));
        solo.sleep(2000);
    }
    //点击找人icon
    public static void getClickSearchPerson(Solo solo){
        Log.d(TAG,"点击找人icon");
        solo.clickOnView(solo.getView(iv_head_right_2));
    }

    //点击发帖icon
    public static void getClickCamera(Solo solo){
        Log.d(TAG,"点击发帖icon");
        solo.clickOnView(solo.getView(iv_head_right));
    }

    //点击 关注数
    public static void getClickFollow(Solo solo){
        Log.d(TAG,"点击关注数");
        solo.clickOnView(solo.getView(user_follow));
    }

    //点击粉丝数
    public static void getClickFans(Solo solo){
        Log.d(TAG,"点击粉丝数");
        solo.clickOnView(solo.getView(user_fans));
    }

    //点击用户信息
    public static void getClickUserInfo(Solo solo){
        Log.d(TAG,"点击用户信息");
        solo.clickOnView(solo.getView(user_portrait));
    }

    //点击我的二维码
    public static void getClickQrCode(Solo solo){
        Log.d(TAG,"点击我的二维码");
        solo.clickOnView(solo.getView(usercenter_listitem_title));
    }


    // 判断是否为MiaoHome页
    public static boolean get_home(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }




}
