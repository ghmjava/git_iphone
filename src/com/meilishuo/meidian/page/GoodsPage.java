package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15-4-24.
 */
public class GoodsPage {
    public static String Activity="GoodsListActivity";
    public static String TAG="Robotium";
    public static String txt_right="tv_head_right";//添加
    public static String txt_left="tv_head_left";//返回
    public static String tv_head_title="tv_head_title";//我的商品Title
    public static String text="text";//tab
    public static String main_block="main_block";//商品模块
    public static String image="image";
    public static String iv_show="iv_show";
    public static String iv_qrcode="iv_qrcode";
    public static String iv_weixin="iv_weixin";
    public static String iv_friend="iv_friend";
    public static String edit="edit";
    public static String tv_add="tv_add";
    public static String search_box="search_box";
    public static String edit_goods_title="edit_goods_title";
    public static String edit_sku_name="edit_sku_name";
    public static String add_content="add_content";
    public static String edit_sku_repertory="edit_sku_repertory";
    public static String label_jian="label_jian";
    public static String add_sku="add_sku";
    public static String content_pic="content_pic";
    public static String edit_content_desc="edit_content_desc";
    public static String add_goods_category="add_goods_category";
    public static String delete_goods="delete_goods";
    public static String radio="radio";
    public static String tv_title="tv_title"; //商品名称
    public static String tv_date="tv_date"; //上架时间
    public static String tv_price="tv_price";//价格
    public static String tv_sales="tv_sales"; //销量
    public static String tv_stock="tv_stock";//库存
    //public static String tv_check_state="tv_check_state";//审核状态
    public static String tv_check_state_reason="tv_check_state_reason";//审核不通过时的原因
    public static String tv_cancel="tv_cancel";
    public static String tv_category="tv_category";
    public static String tv_sku="tv_sku";
    public static String tv_description="tv_description";
    public static String ic_arrow="ic_arrow"; //箭头
    public static String qrcode="qrcode"; //二维码
    public static String preview="preview"; //预览商品
    public static String share="share"; //分享icon

    //点击商品
    public static void getClickSku(Solo solo){
        Log.d(TAG, "点击商品");
        solo.clickOnView(solo.getView(main_block));
    }


    // 判断是否为商品列表页
    public static boolean get_GoodsList(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }


}
