package test;

import builder.MyCar;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Test MyCar instantiation using the Builder
 * Created by fabienk on 2016/05/09.
 */
public class BuilderTest {

    private final static String MAKE = "bwm";
    private final static String MODEL = "320";
    private final static int YEAR = 2016;
    private final static String OPTION1 = "option1";
    private final static String COLOR1 = "black";
    private final static String NOCOLOR = "n/a";

    @Test
    public void testMyCarBuilderOnlyRequired(){

        MyCar car1 = MyCar.Builder.newInstance(MAKE,MODEL,YEAR).build();

        assertThat(car1.getColor(),equalTo(NOCOLOR));
        assertThat(car1.getOptions(),notNullValue());
        assertThat(car1.getOptions().size(),equalTo(0));

    }

    @Test
    public void testMyCarBuilderWithOption(){

        MyCar car1 = MyCar.Builder.newInstance(MAKE,MODEL,YEAR).addOption(OPTION1,OPTION1).color(COLOR1).build();

        assertThat(car1.getColor(),equalTo(COLOR1));
        assertThat(car1.getOptions(),notNullValue());
        assertThat(car1.getOptions().size(),equalTo(1));
        assertThat(car1.getOptions().get(OPTION1),equalTo(OPTION1));

    }

}
