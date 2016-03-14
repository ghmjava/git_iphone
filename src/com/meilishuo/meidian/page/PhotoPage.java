package com.meilishuo.meidian.page;

import com.robotium.solo.Solo;

/**
 * Created by MLS on 15/4/28.
 */
public class PhotoPage {
    private static String PhotoActivity = "photo.PhotoActivity";
    public static String photo_img_view="photo_img_view";

    // 判断是否为选择商品页
    public static boolean get_photo(Solo solo) {
        return solo.waitForActivity(PhotoActivity, 30000);
    }
}
