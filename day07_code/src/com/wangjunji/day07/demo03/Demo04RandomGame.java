package com.wangjunji.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * 题目：
 *      用代码模拟猜数字
 * 1、首先需要生成一个随机数字，并一旦产生不再变化，用Random的nextInt方法
 * 2、需要键盘输入，所有用到了Scanner
 * 3、获取键盘输入的数字，判断if一下
 *  如果太大，提示
 *  太小也提示
 *  太大也提示
 *  可以重复猜
 */
public class Demo04RandomGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int gussNum = rd.nextInt(100);
        while (true){
            System.out.println("请输入一个数字");
            int i = sc.nextInt();
            if(gussNum>i){
                System.out.println("小了");
            }else if(gussNum <i){
                System.out.println("大了");
            }else{
                System.out.println("相等"+i);
                break;
            }
        }

    }


}
