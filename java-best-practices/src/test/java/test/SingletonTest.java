package test;


import org.junit.Test;
import singleton.SingletonEnum;
import singleton.SingletonStatic1;
import singleton.SingletonStatic2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Test case for the various Singleton methods
 * Created by fabienk on 2016/05/09.
 */
public class SingletonTest {

    @Test
    public void testEnumSingleton(){
        assertThat(SingletonEnum.INSTANCE.sayHello(), equalTo("Hello"));
    }

    @Test
    public void testStaticSingleton1(){
        assertThat(SingletonStatic1.INSTANCE.sayHello(), equalTo("Hello"));
    }

    @Test
    public void testStaticSingleton2(){
        assertThat(SingletonStatic2.getInstance().sayHello(), equalTo("Hello"));
    }

}
