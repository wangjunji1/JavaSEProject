package com.wangjuni.thread.Demo02;

/**
 * 设置线程的名称（了解）
 * 使用thread类中的方法setName名字
 * void setName(String name)改变线程名称，使用之与参数name相同
 * 创建一个带参数的构造方法，参数传递
 */
public class Demo01SetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("小强");
        mt.start();

        new MyThread("旺财").start();
    }
}
