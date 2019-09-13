package com.wangjunji.day05.demo04;

public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        System.out.println(array);
        printAll(array);//传递进去的就是array当中的保存的地址
        System.out.println("=====================aaa======================");
        printAll(array);        System.out.println("=====================BBB=======================");
        printAll(array);
    }

    /**
     *三要素
     * 返回值类型：只是进行打印而已，不需要进行计算，也没有结果，用void
     * 方法名称：printArray
     * 参数列表：必须给我数组，我才能打印其中的元素，int[] array
     */
    public static void printAll(int[] args){
        System.out.println("printArray方法收到的参数是：");
        System.out.println(args);
        for (int arg : args) {
            System.out.println(arg);
        }
    }
}
