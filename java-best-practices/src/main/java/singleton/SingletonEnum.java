package singleton;

/**
 * Created by fabienk on 2016/05/09.
 */
public enum SingletonEnum {

    /**
     * Only one instance can exist in that case
     */
    INSTANCE;

    public String sayHello(){
        return "Hello";
    }

}
