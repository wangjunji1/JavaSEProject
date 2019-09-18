package com.wangjunji.day10.demo06;

public class Dog extends Amimal {
    @Override
    public void eat() {
        System.out.println("狗吃屎");
    }

    public void watchHouse(){
        System.out.println("狗看家");
    }
}
