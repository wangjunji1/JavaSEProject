package com.wangjunji.day09.demo09;

/**
 * super关键字用来访问父类的内容，而this关键字用来访问本类内容，用法也有三种
 * 1.在本类的成员方法中，访问本类的成员变量
 * 2.在本类的成员方法中，访问本类的成员方法
 * 3.在本类的构造方法中，访问本类的另一个构造方法
 * 在第三种方法要注意
 *  this调用也必须是构造方法的第一个语句，唯一个。
 *  super和this两种构造调用，不能同时使用。
 */

public class Zi extends Fu {
    int num = 20;
    public Zi(){
        //super();
        this(21);
    }

    public Zi(int n){
        System.out.println(n);
    }




}
