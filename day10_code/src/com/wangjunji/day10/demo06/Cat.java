package com.wangjunji.day10.demo06;


public class Cat extends Amimal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
