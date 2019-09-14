package com.wangjunji.day08.demo03;

public class Person {
    static {
        System.out.println("静态代码先执行");
    }

    public Person(){
        System.out.println("构造方法执行！");
    }
}
