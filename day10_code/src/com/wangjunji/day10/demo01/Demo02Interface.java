package com.wangjunji.day10.demo01;

public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs(); //调用抽象方法，实际运行的是右侧实现类
        //调用默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault();//这是新添加的默认方法
        System.out.println("==================================");

        MyInferfaceDafaultB b = new MyInferfaceDafaultB();
        b.methodAbs();
        b.methodAbs2();
        b.methodDefault();
    }
}
