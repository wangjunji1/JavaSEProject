package com.wangjunji.day06.demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone(){
        Phone phone = new Phone();
        phone.brand="三星";
        phone.price=8333.0;
        phone.color="土豪金";
        return  phone;
    }
}
