package decription;

import java.lang.reflect.Method;

/**
 * Created by dllo on 17/8/21.
 */

/**
 * 注解的反射,即为注解的灵魂
 */
public class ToDo {
    public static void main(String[] args) {
        try {
            // 通过反射去解析注解的属性
            Class<?> c = Class.forName("decription.ActiveChird");
            // 判断在类上是否使用了自定的注解
            boolean isExist = c.isAnnotationPresent(Decription.class);
            if (isExist){
                // 从类上获得自定义的注解
                Decription d = (Decription) c.getAnnotation(Decription.class);
                System.out.println(d.decription() + d.id());
            }
            // 得到该类及父类中的所有方法
            Method[] ms = c.getMethods();
            // 遍历所有方法
            for (Method m:ms){
                // 判断在方法上是否使用了自定的注解
                boolean isExistMothed = m.isAnnotationPresent(Decription.class);
                if (isExistMothed){
                    // 从方法上获得自定义的注解
                    Decription d = m.getAnnotation(Decription.class);
                    System.out.println(d.decription());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void pring(){
        System.out.println("嘿嘿嘿额");
    }
}
