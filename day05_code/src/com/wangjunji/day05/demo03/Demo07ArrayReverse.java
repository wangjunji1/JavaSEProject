package com.wangjunji.day05.demo03;

/**
 * 数组本来的样子，
 * 本来的样子[1,2,3,4]
 * 翻转之后的样子[4,3,2,1]
 */
public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5};
        int temp;
        //遍历打印数组本来的样子
        for (int i = 0; i < array.length/2; i++) {
            temp = array[array.length-1-i];
            array[array.length-1-i]=array[i];
            array[i]=temp;
        }
        /**
         * 初始化语句：int min=0
         */
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
