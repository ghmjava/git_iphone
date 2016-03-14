package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15-4-28.
 */
public class AddShopPage {
    public static String TAG="Robotium";
    public static String Activity="GoodsAddNewActivity";
    public static String tv_head_left="tv_head_left";
    public static String tv_head_title="tv_head_title";
    //public static String content_pic="content_pic";
    public static String search_box="search_box"; //搜索框
    public static String edit_goods_title="edit_goods_title"; //商品名称
    public static String edit_sku_name="edit_sku_name"; //商品规格
    public static String edit_sku_price="edit_sku_price";//商品价格
    public static String label_yuan="label_yuan";
    public static String edit_sku_repertory="edit_sku_repertory";//商品库存
    public static String label_jian="label_jian";
    public static String add_sku="add_sku"; //添加规格
    //public static String add_content="add_content";
    public static String edit_comment="edit_comment"; //点击这里添加描述
    public static String add_goods_category="add_goods_category";//商品分类
   // public static String button_capture="button_capture";
    public static String img_empty="img_empty";//添加图片icon
    public static String add_img="add_img"; //添加图片
    public static String tv_head_right="tv_head_right";
    public static String pic="pic"; //上传的图片
    public static String edit_desc="edit_desc"; //上传的图片描述
    public static String del_pic="del_pic"; //删除商品按钮
    public static String alertTitle="alertTitle"; //提示
    public static String message="message"; //喵。真的要删除吗？
    public static String button_ok="button_ok"; //取消按钮
    public static String button_cancel="button_cancel"; //确定按钮

    public static String select_service_mode="select_service_mode"; //服务方式
    public static String edit_sku_duration="edit_sku_duration"; //服务时长
    public static String label_minute="label_minute"; //服务时长－－分钟

    // 判断是添加商品页
    public static boolean get_addSku(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }

    //点击商品分类
    public static void getClickSkuCategory(Solo solo){
        Log.d(TAG, "点击商品分类");
        solo.clickOnView(solo.getView(add_goods_category));
    }

    //点击服务方式
    public static void getClickService_Mode(Solo solo){
        Log.d(TAG, "点击服务方式");
        solo.clickOnView(solo.getView(select_service_mode));
    }

    //删除商品
    public static void click_ButtonOk(Solo solo){
        Log.d(TAG, "点击删除按钮");
        solo.clickOnView(solo.getView(button_cancel));
    }

}
