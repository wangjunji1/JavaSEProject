package demo01;

public class StringExample {
    public static void main(String[] args) {
        subStringExample();
    }

    public static void  subStringExample(){
        String originalString = "This is the original String";
        System.out.println(originalString.substring(12));
        System.out.println(originalString.substring(5,12));
        System.out.println(originalString.substring(0,originalString.length()));
    }
}
