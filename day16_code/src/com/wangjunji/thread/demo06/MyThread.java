package com.wangjunji.thread.demo06;

public class MyThread extends Thread {
    @Override
    public void run(){
        for (int i = 20; i > 0; i--) {
            System.out.println("run:"+i);
        }
    }
}
