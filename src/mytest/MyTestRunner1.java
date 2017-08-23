package mytest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by dllo on 17/8/21.
 */
public class MyTestRunner1 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class claz = DBCRUD.class;//得到字节码文件对象

        //得到该类及父类中的所有方法
        Method[] methods = claz.getMethods();

        for(Method m:methods){
            //判断方法是否使用了@MyTest这个注解
//          boolean boo = m.isAnnotationPresent(MyTest.class);
//          System.out.println(m.getName()+"===="+boo);//都是false 默认注解存活到 CLASS，改变存活到RUNTIME
            if(m.isAnnotationPresent(MyTest.class)){
                m.invoke(claz.newInstance(), null);
            }
        }
    }
}
