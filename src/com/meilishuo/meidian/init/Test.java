package com.meilishuo.meidian.init;

/**
 * Created by MLS on 15/10/8.
 */
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Test {
}
