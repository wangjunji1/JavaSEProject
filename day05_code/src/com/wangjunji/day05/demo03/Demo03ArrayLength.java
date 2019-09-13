package com.wangjunji.day05.demo03;

/**
 * 如何获取数组的长度，格式
 * 数组名称.length
 * 这将会得到int数字，代表数据的长度
 * 数组一旦创建，程序运行期间，长度不可改变。
 */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = {10,11,2,2,345,4,55,6,6,23,7,8,89,};
        int len = arrayB.length;
        System.out.println("arrayB数组的长度是："+len);
        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC= new int[4];
        System.out.println(arrayC.length);
    }
}
