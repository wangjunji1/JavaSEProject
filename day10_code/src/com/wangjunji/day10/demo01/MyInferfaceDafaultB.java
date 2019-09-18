package com.wangjunji.day10.demo01;

public class MyInferfaceDafaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现类B实现抽象方法11");
    }

    @Override
    public void methodAbs2() {
        System.out.println("实现类B实现抽象方法22");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写接口的默认方法");
    }
}
