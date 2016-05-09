package singleton;

/**
 * Created by fabienk on 2016/05/09.
 */
public class SingletonStatic2 {

    private final static SingletonStatic2 INSTANCE = new SingletonStatic2();

    /**
     * In that case the singleton instance is only accessible through the getInstance method
     */
    public static SingletonStatic2 getInstance() {
        return INSTANCE;
    }

    private SingletonStatic2() {
    }

    public String sayHello() {
        return "Hello";
    }
}
