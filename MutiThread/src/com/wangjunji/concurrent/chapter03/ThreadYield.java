package com.wangjunji.concurrent.chapter03;

import java.io.InputStream;
import java.util.stream.IntStream;

/**
 * yield方法介绍
 * yield方法属于一种启发式的方法，其会提醒调度器我愿意放弃当前的cpu资源，如果cpu资源不紧张
 * 则会忽略这种提醒。调用yield方法会使用当前的running状态切换到runable状态，
 */

public class ThreadYield{
    public static void main(String[] args) {
        IntStream.range(0,10).forEach(System.out::println);
        IntStream.range(0,21).mapToObj(ThreadYield::create).forEach(Thread::start);

    }

    public static Thread create(int index){
        return new Thread(()->{
            System.out.println(index);
        });
    }

}
