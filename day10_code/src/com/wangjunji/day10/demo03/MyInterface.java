package com.wangjunji.day10.demo03;

public interface MyInterface extends  MyInterfaceB,MyInterfaceA {
    public void method();
    public default  void methodDefault(){}
}
