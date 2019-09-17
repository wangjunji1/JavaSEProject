package com.wangjunji.day09.demo08;

/**
 * super关键字的用法有三种
 * 在子类的成员方法中，访问父类的成员变量
 * 在子类的成员方法中，访问父类的成员方法
 * 在子类的构造方法中，访问父类的构造方法
 */
public class Zi extends Fu {
    int num = 20;
    public Zi(){
        super();
    }

    public void methodZi(){
        System.out.println(super.num);
    }

    public void method(){
        super.method();
        System.out.println("子类方法");
    }
}
