package com.wangjunji.day04.demo02;
/*
题目要求：
    定义一个方法，用来求出两个数字之和，
题目变形：
    定义一个方法，用来打印两个数字之和
注意事项：
    对于返回值的方法，可以单独调用，打印调用或者赋值调用
    但是对于无返回值的方法，只能使用单独调用，不能使用打印调用或者赋值调用
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        //我是main方法，我来调用你
        //我调用你，你来帮我坟算
        int sum = getSum(10,10);
        System.out.println(sum);
        printSum(10,10);

    }
    public static int getSum(int a ,int b ){
        return a+b;
    }

    public static  void printSum(int a ,int b ){
        System.out.println(a+b);
    }
}
