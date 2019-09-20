package com.wangjuni.thread.Demo02;

/**
 设置线程的名称（了解）：
    使用thread类的方法setName名字
    void setName改变线程名称，使之与参数name相同
    创建一个带参数的构造方法，参数传递线程的名称，调用父类的带参构造方法
    把线程名称传递给父类，让父类给
 */
public class MyThread  extends Thread{
    public MyThread(){

    }

    public MyThread(String name){
        super(name);
    }

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

}
