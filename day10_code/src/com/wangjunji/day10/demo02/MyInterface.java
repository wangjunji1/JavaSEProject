package com.wangjunji.day10.demo02;

public interface MyInterface {
    public default void mehtod(){
        System.out.println("接口的默认方法");
    }
}
