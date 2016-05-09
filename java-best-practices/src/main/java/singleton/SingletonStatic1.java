package singleton;

/**
 * Created by fabienk on 2016/05/09.
 */
public class SingletonStatic1 {

    /**
     * In that case the public static instance is directly accessible.
     */
    public final static SingletonStatic1 INSTANCE = new SingletonStatic1();

    public String sayHello(){
        return "Hello";
    }

}
