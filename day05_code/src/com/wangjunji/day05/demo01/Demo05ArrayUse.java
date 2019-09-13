package com.wangjunji.day05.demo01;

/**
 * 使用动态初始的时候，其中元素将会自动拥有一个默认值，规则如下：
 *  如果是整数类型，那么默认为0
 *  如果是浮点类型，那么默认为0.0
 *  如果字符类型，那么默认为'\u000000'
 *  如果是布尔类型，那么默认值是false
 *  如果是引用类型那么默认为null
 *  注意事项：
 *      静态初始化其实也有默认值的过程，只不过系统自动马上将默认值替换成大括号当中的具体数值。
 */
public class Demo05ArrayUse {
    public static void main(String[] args) {
        //动态初始一个数组
        int[] array = new int[3];
        System.out.println(array);
        System.out.println("==============================");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("==============================");
        //将数据123赋值交给数据Array当中1号元素
        array[1] = 123;
        System.out.println("==============================");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("==============================");

    }
}
