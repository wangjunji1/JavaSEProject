package com.wangjunji.day10.demo01;

/**
 *接口就是多个类的公共规范。
 * 接口是一种引用数据类型，最重要的内容就是其中，抽象方法
 *
 * 如何定义一个接口的格式,那么接口可以包含的内容有
 * 常量，抽象方法
 *
 * 如果是java8，还可以包含有：
 *  默认方法
 *  静态方法
 *
 *  如果java 9,还可以包括有：
 *      私有方法
 *
 *
 */
public interface Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceAbstract imp1 = new MyInterfaceAbstractImpl();
        imp1.methodAbs1();
        imp1.methodAbs2();
        imp1.methodAbs3();
        imp1.methodAbs4();
    }
}
