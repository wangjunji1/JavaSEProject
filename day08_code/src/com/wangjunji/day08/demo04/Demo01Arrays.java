package com.wangjunji.day08.demo04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


/**
 * java.util.Arrays是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现常见的操作
 * public static String toString(数组) 将参数数组变成字符串 按照默认格式
 * public static void sort 数组按照大小到大进行排序
 * 备注：
 *  如果是数值，sort默认按照升序从小到大
 *  如果是字符串，sort默认按照字母升序
 *  如果是自定义的类型，那么这个自定义的需要有Comparable 或Comparator接口的支持
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        //将int[] 数组按照按照默认格式变字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);
        int[] array1 = {20,1,2,3,10};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        String[] arrays = {"bbb","aaa","ccc"};
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
    }
}
