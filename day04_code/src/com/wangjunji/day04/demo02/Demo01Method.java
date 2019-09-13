package com.wangjunji.day04.demo02;

/**
 * 复习一下此前学习的方法的基础入门知识
 * 定义格式：
 *      public static vid 方法名称(){
 *          方法体
 *      }
 *   调用格式
 *   方法名称
 *   注意事项：
 *      1.方法定义的先后顺序无所谓
 *      2.方法定义必须是挨着的，不能一个方法的内部定义另一个方法
 *      3.方法定义后，自已不会执行的，如果希望执行，一定要进行方法的调用
 *
 */

public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod(){
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 20; i1++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
