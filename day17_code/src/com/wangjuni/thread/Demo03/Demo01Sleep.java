package com.wangjuni.thread.Demo03;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

/**
 * public static void sleep(long millis) 使用当前正在执行
 * 线程以指定的毫秒数置置换暂停
 */
public class Demo01Sleep {
    public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            System.out.println(i);

            try {
                sleep(300);
                TimeUnit.SECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
