package com.able.bubugao.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DistributedLock {
    /**
     *
     * 锁的名称
     * @return
     */
    String key();

    /**
     * 持锁时间，默认30秒
     * @return
     */
    long leaseTime() default 30000;

    /**
     * 锁的等待时间，默认10秒
     * @return
     */
    long waitTime() default 10000;

    /**
     * 时间单位，默认为毫秒
     * @return
     */
    TimeUnit timeUnit() default TimeUnit.MILLISECONDS;

}
