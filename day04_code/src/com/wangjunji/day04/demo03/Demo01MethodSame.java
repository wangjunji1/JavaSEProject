package com.wangjunji.day04.demo03;

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,10));
        System.out.println(isSame(10,20));
    }

    /**
     * 三要素：
     *  返回值类型：boolean
     *  方法名称：isSame
     *  参数列表：int a,int b
     */
    public static boolean isSame(int a ,int b ){
        return a ==b ;
    }
}
