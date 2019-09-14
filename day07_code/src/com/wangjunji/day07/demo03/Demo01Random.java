package com.wangjunji.day07.demo03;

import java.util.Random;

/**
 * Random类用来生成随机数字，使用起来三个步骤
 * 1.导包
 *  import java.util.Random
 * 2创建
 *  Random r = new Random();
 * 3。使用
 *  获取一个随机的int数字 ，int num =r.nextInt()
 *  获取一个随机的int数字，
 *  实际上代表的含义是左闭右开[1,3）
 */
public class Demo01Random {
    public static void main(String[] args) {
        Random rd = new Random();
        int i = rd.nextInt(3);
        System.out.println("随机数是："+i);
    }
}
