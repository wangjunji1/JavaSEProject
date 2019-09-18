package com.wangjunji.day10.demo01;

public interface LiveAble {
    //默认方法
    public default void fly(){
        System.out.println("天上飞");
    }
}
