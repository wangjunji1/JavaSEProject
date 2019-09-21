package com.wangjunji.thread.demo05;

/**
 * 主线程：执行主（main）方法的线程
 * 单线程程序：从java程序中只有一个线程
 * 执行从main方法开始，从上到下依次执行
 * jvm执行main方法，main会进入栈内存
 * jvm会找操作系统开避一条main方法通向cpu的执行路径
 * cpu就可以通过这个路径执行main方法
 * 而这个路径有一个名字，叫main主线
 */
public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小强");
        p1.run();
        System.out.println(0/0);
        Person p2 = new Person("旺财");
        p2.run();
    }
}
