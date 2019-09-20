package com.wangjuni.thread.Demo01;

public class Demo01ThreadName {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        new MyThread().start();
    }
}
