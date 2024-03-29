package com.wangjunji.day10.demo01;

/**
 * 注意事项：不能通过接口实现实现类的对象来调用接口中的静态方法
 * 正确的用法，通过接口名称，直接调用其中的静态方法
 * 格式
 *  接口名称.静态方法名（参数）
 */
public class Demo03Inferfac {
    public static void main(String[] args) {
        MyInterfaceStaticImpl mystf = new MyInterfaceStaticImpl();
        //mystf.methodStatic();
        //调用接口名称调用静态方法
        MyInterfaceStatic.methodStatic();
    }
}
