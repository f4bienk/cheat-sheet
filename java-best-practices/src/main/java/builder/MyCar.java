package builder;

import java.util.HashMap;
import java.util.Map;

/**
 * This Class demonstate the use of a Builder and Static Factory on the builder
 * Created by fabienk on 2016/05/09.
 */
public class MyCar {

    //Immutable parameters
    private final String make;
    private final String model;
    private final int year;
    private final Map<String,String> options;
    private final String color;


    public static class Builder{

        private final String make;
        private final String model;
        private final int year;

        //Optional parameters
        private Map<String,String> options = new HashMap<String, String>();
        private String color = "n/a";

        public static Builder newInstance(String make, String model, int year){
            return new Builder(make, model, year);
        }

        private Builder(String make, String model, int year){
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public Builder addOption(String type, String option){
            options.put(type, option);
            return this;
        }

        public Builder color(String color){
            this.color = color;
            return this;
        }

        public MyCar build(){
            return new MyCar(this);
        }

    }

    /**
     * Private constructor.
     * The only option to instanciate the class is through the builder
     * @param builder
     */
    private MyCar(Builder builder){
        this.make = builder.make;
        this.color = builder.color;
        this.model = builder.model;
        this.year = builder.year;
        this.options = builder.options;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args){

        /**
         * Use
         */

        MyCar myBmw = MyCar.Builder.newInstance("BMW", "320", 2016).color("white").addOption("ABS", "true").build();


    }
}
