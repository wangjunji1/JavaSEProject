package com.wangjuni.thread.Demo01;

/**
 * 获取线程的名称：
 *  使用thread类的中的方法getName()
 *  string getName() 返回该线程的名称
 *  可以先获取到当前正在执行的线程，使用线程中的方法getName获取线程的名称
 *  static Thread currentThread() 返回当前正在执行线程对象的引用
 */
//定义一个Thread类的子类
public class MyThread  extends  Thread{
    //重写Thread类中的run方法，设置线程任务
    public void run(){
        String name = getName();
        System.out.println(name);
        Thread t = Thread.currentThread();
        System.out.println(t);
        String name1 = t.getName();
        System.out.println(name1);
    }

}
