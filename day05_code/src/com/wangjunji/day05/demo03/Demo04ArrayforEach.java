package com.wangjunji.day05.demo03;

/**
 * 遍历数组：说的就是对数组当中每一个元素逐一、挨个处理，默认的处理方式就是打印输出
 *
 */
public class Demo04ArrayforEach {
    public static void main(String[] args) {
        int[] array = {15,25,30,35,40,50,60,75};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[6]);
        System.out.println(array[7]);
        //使用循环，次数其实就是数组的长度
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("------------------------------");
        //array.length数组的长度
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
