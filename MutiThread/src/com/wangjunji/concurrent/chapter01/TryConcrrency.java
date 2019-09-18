package com.wangjunji.concurrent.chapter01;

/**
 * TimeUnit提供了可读性更好的线程暂停操作，通常用来替换Thread.sleep();
 *
 */

import java.util.concurrent.TimeUnit;


public class TryConcrrency {
    public static void main(String[] args) throws InterruptedException {
      Thread t1 = new Thread(){
           @Override
           public void run(){
               browseNews();
           }
       };

        Thread t2=new Thread(){
            @Override
            public void run(){
                enjoyMusic();
            }
        };

        //java 8 Lamdba改造方面

        t1.start();
        t2.start();

        new Thread(TryConcrrency::enjoyMusic).start();


    }

    private static void browseNews() {
        for (; ; ) {
            System.out.println("Uh-hhh,the good news.");
            sleep(1);
        }
    }



    private static void enjoyMusic()  {
        for (; ; ) {
            System.out.println("Uh-hhh,the nice music.");
            sleep(1);
        }
    }

    private static void sleep(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
            //TimeUnit 类解决的了这个问题，DAYS,HOURS,MINUTEWS,
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
