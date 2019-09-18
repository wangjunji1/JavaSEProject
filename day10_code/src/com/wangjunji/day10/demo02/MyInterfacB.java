package com.wangjunji.day10.demo02;

public interface MyInterfacB {
    public abstract void methodA();
    public abstract void methodB();
    public abstract void methodABC();
    public default  void methodDefault(){
        System.out.println("默认方法AAA");
    }
}
