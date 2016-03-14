package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15-4-24.
 */
public class ShopPage {
    public static String ShopDetailSettingActivity="ShopDetailSettingActivity";
    public static String TAG="Robotium";
    public static String tv_instro="tv_instro";//个人简介
    public static String tv_head_title="tv_head_title";
    public static String tv_head_left="tv_head_left";
    public static String ba_cover="ba_cover";//封面
    public static String cover_desc="cover_desc";//封面预览
    public static String cover_right_arrow="cover_right_arrow";//预览箭头
    public static String layout_instro="layout_instro";//个人简介－layout
    public static String et_instro="et_instro";//个人简介－内容
    public static String instro_right_arrow="instro_right_arrow";//个人简介－剪头
    public static String tv_good_at="tv_good_at";//擅长－擅长标题
    public static String good_at_layout="good_at_layout";//擅长－layout
    public static String et_good_at="good_at_layout";//擅长－擅长内容
    public static String good_at_right_arrow="good_at_right_arrow";//擅长－擅长箭头
    public static String sevice_area_layout="sevice_area_layout";//服务商圈－layout
    public static String tv_sevice_area="tv_sevice_area";//服务商圈－标题
    public static String et_sevice_area="et_sevice_area";//服务商圈－服务商圈内容
    public static String sevice_area_right_arrow="sevice_area_right_arrow";//服务商圈－箭头
    public static String role_layout="role_layout";//身份——layout
    public static String tv_role="tv_role";//身份——标题
    public static String et_role="et_role";//身份——内容
    public static String role_right_arrow="role_right_arrow";//身份——箭头
    public static String layout_shop="layout_shop";//所在门店－layout
    public static String tv_shop_label="tv_shop_label";//所在门店－标题
    public static String et_shop_name="et_shop_name";//所在门店－内容
    public static String shop_name_right_arrow="shop_name_right_arrow";//所在门店－箭头
    public static String layout_shop_addr="layout_shop_addr";//详细地址－layout
    public static String tv_shop_addr_label="tv_shop_addr_label";//详细地址－标题
    public static String et_shop_addr="et_shop_addr"; //详细地址－内容
    public static String shop_addr_right_arrow="shop_addr_right_arrow"; //详细地址－箭头
    public static String my_phone_layout="my_phone_layout"; //联系电话－layout
    public static String tv_phone_label="tv_phone_label"; //联系电话－标题
    public static String et_phone="et_phone";//联系电话－内容
    public static String et_phone_right_arrow="et_phone_right_arrow";//联系电话－箭头


    //启动完善资料页面
    public static boolean get_shopdetail(Solo solo) {
        return solo.waitForActivity(ShopDetailSettingActivity, 30000);
    }



}
