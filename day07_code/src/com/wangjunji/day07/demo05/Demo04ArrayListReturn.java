package com.wangjunji.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * 题目：
 * 用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中
 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> arrayInt = new ArrayList<>();
        ArrayList<Integer> arraydouble = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayInt.add(rd.nextInt());
        }
        //        System.out.println(arrayInt);
        for (Integer num : arrayInt) {
            if(num%2 == 0){
                arraydouble.add(num);
            }
        }
        System.out.println(arraydouble);

    }
}
