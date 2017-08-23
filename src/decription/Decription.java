package decription;

import sun.dc.pr.PRError;

import java.lang.annotation.*;

/**
 * Created by dllo on 17/8/21.
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME) // 也被称为元注解
@Inherited
@Documented
public @interface Decription {
    String id();
    String decription() default "我是默认值";
}

