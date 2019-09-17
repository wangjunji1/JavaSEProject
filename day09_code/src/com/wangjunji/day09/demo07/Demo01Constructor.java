package com.wangjunji.day09.demo07;

/**
 * 继承关系中，父子类构造方法的访问特点
 * 子类构造方法当中隐含super调用，所以一定是先调用的父类构造，后执行子类的构造
 * 子类构造可以通过super关键字来调用父类重载构造
 * super的父类构造调用，
 */
public class Demo01Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();
    }

}
