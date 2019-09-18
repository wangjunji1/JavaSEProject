package com.wangjunji.concurrent.chapter03;

import static java.lang.Thread.sleep;

public class ThreadSleep {
    public static void main(String[] args) {
        new Thread(()->{long startTime=System.currentTimeMillis();
            sleep(2000L);
            long endtime=System.currentTimeMillis();
            System.out.println(String.format("Total spend %d ms",(endtime-startTime)));


        }).start();
        long startTime = System.currentTimeMillis();

            sleep(3000L);

            //使用threadunit替代thread.sleep
        //使用TimeUnit替代thread.sleep



    }

    private static void  sleep(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
