package com.wangjunji.day07.demo03;

import java.util.Random;

/**
 * 题目要求：
 *      根据int 变量的n的值，来随机数字，范围【1，n】,可以取到1也可以取到n
 * 思路：
 *       定义一个int n ,随意赋值
 *       要使用Random三个步骤：导包，创建，使用
 *       如果写10，那么就是0~9.然后需要1~10，那么发现整本+1即可
 *       打印随机数字
 */
public class Demo03Random {
    public static void main(String[] args) {
        int n =5;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(n)+1;
            System.out.println(result);
        }
    }
}
