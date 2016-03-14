package com.meilishuo.meidian.init;

import java.lang.annotation.*;

/**
 * Created by MLS on 15-4-21.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TestCase {
}
