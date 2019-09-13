package com.wangjunji.day04.demo02;

/**
 * 有参数：小括号当中的内容，当一个方法需要一些数据条件，才能完成任务的时候，就是有参数
 * 例如两个数字相加，必须知道两个数字各自多少，才能相加
 * 无参数，小括号当中留空，一个方法不需要有任何的参数，自已就能独立地完成，就是无参数
 * 例如定义一个方法打印固定的10次hello world
 *
 */
public class Demo03MethodParam {
    public static void main(String[] args) {
        method();
        method(10,20);
    }

    /**
     * 两个数字相乘，必须知道两种数字各自是多少，否则无法进行计算
     * @param a
     * @param b
     */
    public static void method(int a ,int b ){
        int result = a*b;
        System.out.println("结果是："+result);
    }

    /**
     * 例如固定打印文本10次
     */
    public static void method(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world"+i);
        }
    }
}
