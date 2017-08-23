package mytest;

import java.lang.annotation.*;

/**
 * Created by dllo on 17/8/21.
 */
//元注解： 用来注解注解的
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest {
    long timeout() default Integer.MAX_VALUE;//设置超时时间的
}
