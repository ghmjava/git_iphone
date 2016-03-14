package com.meilishuo.meidian.page;

import android.util.Log;
import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/9/17.
 */
public class MiaoOrderListPage {
    public static final String TAG = "Robotium";
    public static String Activity="OrderListActivity";
    public static String tv_head_title="tv_head_title";
    public static String tv_head_left="tv_head_left";
    public static String order_status="order_status"; //订单状态
    public static String ic_shop="ic_shop"; //卖家头像
    public static String meidian_name="meidian_name"; //卖家用户名
    public static String union="union"; //盟标
    public static String user_title="user_title"; //卖家身份
    public static String btn_to_im="btn_to_im"; //私聊icon
    public static String call_phone="call_phone"; //打电话icon
    public static String order_goods_pic="order_goods_pic"; //商品图片
    public static String order_goods_title="order_goods_title"; //商品标题
    public static String sku_info="sku_info"; //规格
    public static String express_info="sku_info"; //服务方式
    public static String service_time="service_time"; //服务时长
    public static String item_price="item_price"; //商品单价
    public static String item_count="item_count"; //商品数量
    public static String order_remark="order_remark"; //买家留言
    public static String  vip_price="vip_price"; //会员特权
    public static String  total_price="total_price"; //实付金额
    public static String  cancel_order="cancel_order"; //取消订单
    public static String  red_btn="red_btn"; //查看评价按钮／消费码
    public static String  refund="refund"; //退款

    // 点击订单的商品
    public static void getClickSku(Solo solo,int id){
        Log.d(TAG, "点击商品");
        solo.clickOnView(solo.getView(order_goods_pic,id));
    }
    // 判断是否为全部订单页
    public static boolean get_miaoorderlist(Solo solo) {
        return solo.waitForActivity(Activity, 30000);
    }
}
