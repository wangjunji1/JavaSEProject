package com.wangjunji.day04.demo03;

/**
 * 题目要求：
 *      定义一个方法，用来打印指定次数Hello world
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
        /**
         * 三要素：
         *      返回值：只是进行一大堆打印操作，没有计算，也没有结果要告诉调用处
         * 方法名称：
         *      printCount
         * 参数打印多少次，必须告诉我，否则我不知道多少次，没有打印，次数int
         */
        printCount(16);

    }

    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("Hello world"+i);
        }
    }
}
