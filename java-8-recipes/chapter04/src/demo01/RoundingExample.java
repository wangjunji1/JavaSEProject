package demo01;

import java.util.regex.Matcher;

public class RoundingExample {
    public static void main(String[] args) {
        System.out.println(roundDoubleToLong(-9.9));
        System.out.println(roundFloatToInt(-8.8884f));
    }

    public static int roundFloatToInt(float myFloat){
        return Math.round(myFloat);
    }

    public static long roundDoubleToLong(double myDouble){
        return Math.round(myDouble);
    }

}
