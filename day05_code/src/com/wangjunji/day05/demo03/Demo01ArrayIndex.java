package com.wangjunji.day05.demo03;

/**
 * 数组的索引编号从0开始，一直到数据长度为-1为止
 * 如果访问数据元素的时候，索引编号并不存在，那么将会发生，数组索引越界异常
 * ArrayIndexOutofBoundsException
 */
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] array={15,25,35};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        try {
            System.out.println(array[3]);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("frunk 已经半夜了");
    }

}
