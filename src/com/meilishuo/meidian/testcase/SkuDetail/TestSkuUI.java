package com.meilishuo.meidian.testcase.SkuDetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.GoodsDetailPage;
import com.meilishuo.meidian.page.MiaoOrderListPage;

/**
 * Created by MLS on 15/9/21.
 */
public class TestSkuUI extends BaseClass {
    @Discover
        public void testSkuUI() {
            init();
            //点击全部订单
            solo.clickOnText("^全部订单$");
            Log.d(TAG,"点击全部订单");
            solo.sleep(1000);

            // 点击商品
            MiaoOrderListPage.getClickSku(solo,0);
             Log.d(TAG,"点击商品");
             solo.sleep(3000);

            //进入商品详情页
            GoodsDetailPage.get_goodsdetail(solo);
            Log.d(TAG,"进入商品详情页");
            solo.sleep(3000);



            //返回按钮、喜欢icon、分享icon、商品图片、title、价格、描述
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.tv_head_left)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.iv_head_right)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.iv_head_right2)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.pic_img)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.label)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.page_num)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.origin_price)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.desc)));
            Log.d(TAG,"返回按钮、喜欢icon、分享icon、商品图片、title、价格、描述UI确认");
            solo.sleep(1000);
            solo.scrollUp();


            //BA头像、BA身份、评分、门店名、门店地址、打电话icon
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.user_avatar)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.user_name)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.user_title)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.union))); //盟标
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.start_0))); //星0
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.start_1))); //星1
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.start_2))); //星2
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.start_3))); //星3
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.start_4))); //星4
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.score_ontime))); //按时
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.score_attitude))); //态度
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.score_effect))); //效果
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.score_selling))); //无推销
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.shop_name))); //门店名
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.shop_address))); //门店地址
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.phone_button))); //打电话icon
            Log.d(TAG,"BA头像、BA身份、评分、门店名、门店地址、打电话iconUI确认");
            solo.sleep(1000);

            //预约时间参考、消费notice、喜欢者
            solo.scrollUp();
            assertTrue(solo.waitForText("^预约时间参考$"));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.work_time)));
            //assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.work_time_linear)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.busy_flag)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.consume_notice)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.follow_bar_grid_view)));


            //购买评价、最新评论
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.review_count)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.user_icon)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.user_name)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.content_message)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.img1_id)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.show_all)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.comment_count)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.no_comment_tip)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.action_button)));
            Log.d(TAG,"购买评价、最新评论UI确认");
            solo.sleep(1000);

            //私聊按钮、购买按钮UI确认
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.btn_to_im)));
            assertTrue(solo.waitForView(solo.getView(GoodsDetailPage.buy)));
            Log.d(TAG,"购买评价、最新评论UI确认");
            solo.sleep(1000);











        }
    }
