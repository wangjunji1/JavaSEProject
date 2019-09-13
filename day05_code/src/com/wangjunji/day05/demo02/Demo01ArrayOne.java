package com.wangjunji.day05.demo02;

public class Demo01ArrayOne {
    public static void main(String[] args) {
        //动态初始化
        int[] arrayInt = new int[10];
        System.out.println(arrayInt);
        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[1]);
        System.out.println(arrayInt[2]);
        System.out.println(arrayInt[3]);
        System.out.println(arrayInt[4]);
        System.out.println(arrayInt[5]);
        System.out.println(arrayInt[6]);
        arrayInt[1] = 10;
        arrayInt[2] = 20;
        System.out.println(arrayInt[1]);
        System.out.println(arrayInt[2]);

        //将数组值 赋给另一个数组
        int[] arrayB = arrayInt;
        System.out.println(arrayB);
    }
}
