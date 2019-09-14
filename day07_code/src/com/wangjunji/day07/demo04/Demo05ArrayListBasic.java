package com.wangjunji.day07.demo04;

import java.util.ArrayList;

/**
 * 如果希望向集合ArrayList当中存储基本类型数据，必须使用基本对应的包装类
 * 基本类型 包括类 （引用类型，包括类都位于java.lang包下）
 * byte         Byte
 * short        Short
 * int           Integer  【特殊】
 * long         Long
 * float        Float
 * double      Double
 * char         Character [特殊]
 * boolean       Boolean
 *
 * 从jdk 1.5开始，支持自动装箱，自动拆箱
 * 自动装箱：基本类型---》包括类型
 * 自动拆箱： 包装类型---》基本类型
 */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        //错误的写 ArrayList<int> listB = new ArrayList<>();
        ArrayList<Integer> listB  = new ArrayList<>();
        listB.add(100);
        listB.add(200);
        int num = listB.get(1);
        System.out.println("第一号元素是"+num);
    }
}
