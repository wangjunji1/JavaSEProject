package com.wangjunji.day06.demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.color="土豪金";
        one.price=8388.0;
        one.brand="苹果";
        method(one);
    }

    public static void method(Phone param){
        System.out.println(param.color);
        System.out.println(param.price);
        System.out.println(param.brand);

    }
}
