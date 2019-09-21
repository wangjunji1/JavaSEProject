package com.wangjunji.thread.demo01;

/**
 * 异常的产生的过程的解析（分析异常的怎么产生的，如何处理异常）
 */
public class Demo02Exception {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int e = getElement(arr,3);
        System.out.println(e);
        System.out.println("hello world");

    }

    public static int getElement(int[] arr,int i) {
        try {
            return arr[i];
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  -1;
    }
}
