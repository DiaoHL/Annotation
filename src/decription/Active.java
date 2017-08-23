package decription;

/**
 * Created by dllo on 17/8/21.
 */
@Decription(id = "我是类id",decription = "我是类注释")
public class Active {
    private String name;

    public String getName(){
        return name;
    }

    @Decription(id = "我是方法id",decription = "我是方法注释")
    public void setName(String name){
        this.name = name;
    }
}
