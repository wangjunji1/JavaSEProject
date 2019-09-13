package com.wangjunji.day05.demo01;

/**
 * 直接打印数组名称，得到的是数据对应的，内存哈希值
 * 二进制：01
 * 十进制：0123456789
 * 16进制：0123456789abcdef
 */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        //静态初始化,可以省略new int[]
        int[] array = {1,2,3,4,5,6};
        //直接打印内存地址
        System.out.println(array);
        //直接打印数据当中的元素
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        //也可以将数组当中的某一个单一元素，赋值交给变量
        int num = array[1];
        System.out.println(num);


    }
}
