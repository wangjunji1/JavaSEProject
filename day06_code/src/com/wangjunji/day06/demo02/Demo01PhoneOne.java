package com.wangjunji.day06.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        //根据phone 类，创建一个为one的对象
        //格式：类名称 对象名=new 类名称（）
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        one.brand="苹果";
        one.price=8388.0;
        one.color="黑色";

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        one.call("乔布斯");//给乔布斯打电话
        one.sendMessage();//群发短信

    }
}
