package com.wangjunji.thread.demo06;

/**
 * 创建多线程程序，第一种方式：创建Thread类的子类
 * java.lang.Thread类，是描述线程的类，我们想要实现多线程程序，就必须继承thread类
 * 实现步骤：
 *      创建一个Thread类的子类
 *
 */
public class Demo01Thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 20; i > 0; i--) {
            System.out.println("main:"+i);

        }
    }
}
