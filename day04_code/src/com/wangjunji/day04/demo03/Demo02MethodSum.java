package com.wangjunji.day04.demo03;

/**
 * 题目要求：
 *  定义一个方法，用来求出一个1~100之间所有数字的和值
 */
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是"+getSum());
        System.out.println(new Demo02MethodSum().tgsum(100));
        System.out.println(new Demo02MethodSum().tgsum(100));
    }
    public static int getSum(){
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        return sum;
    }
    private int num =0,sum=0;
    public  int  tgsum(int maxvalue){
        if(num<=maxvalue) {
            sum += num;
            num++;
            tgsum(maxvalue);
        }
        return sum;

    }
}
