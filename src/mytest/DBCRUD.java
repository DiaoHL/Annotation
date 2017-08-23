package mytest;

/**
 * Created by dllo on 17/8/21.
 */
public class DBCRUD {

    @MyTest(timeout=1000000)
    public void addTest()
    {
        System.out.println("addTest方法执行了");
    }

    @MyTest
    public void updateTest()
    {
        System.out.println("updateTest方法执行了");
    }

}
