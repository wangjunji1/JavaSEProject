package com.wangjunji.day08.demo04;

/**
 * 题 目：计算-10.8和5.9之间，绝对值大于6小于2.1整数有多少
 */
public class Demo04MathPractice {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        for (int i = (int) Math.ceil(min); i < Math.floor(5.9); i++) {
            if(Math.abs(i)>6||Math.abs(i)<2.1){
                count++;
            }
        }
        System.out.println(count);

    }
}
