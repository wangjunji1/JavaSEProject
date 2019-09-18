package com.wangjunji.day10.demo01;

public class Demo05Interface {
    public static void main(String[] args) {
        //访问接口的常量
        System.out.println(MyInterfaceConst.NUM_OF_MY_CLASS);
        //也不可以使用继承来访问父类的常量
        MyInterfaceConst myconf = new MyInterfaceConstimpl();
    }
}
