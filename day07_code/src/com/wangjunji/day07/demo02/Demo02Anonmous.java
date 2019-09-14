package com.wangjunji.day07.demo02;

import java.util.Scanner;

public class Demo02Anonmous {
    public static void main(String[] args) {
        //普通使用
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //匿名对象的方式
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("输入的是："+num1);
        //使用一般写法传入参数
        Scanner sc1 = new Scanner(System.in);
        methodParam(sc);

        Scanner sc2 = methodReturn();
        int i = sc.nextInt();
        System.out.println(i);
    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是"+num);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }

}
