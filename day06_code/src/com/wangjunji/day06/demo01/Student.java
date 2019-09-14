package com.wangjunji.day06.demo01;

/**
 * 定义一个类，用来模拟学生事物，其中就有两个组成部分
 * 属性（是什么）：
 *  姓名
 *  年龄
 * 行为（能做什么）
 *  吃饭
 *  睡觉
 *  学习
 *  对应的java的类当中
 *  成员变量（属性）：
 *      String name
 *      int age
 *   成员方法（行为）
 *      public void eat() 吃饭
 *      public void sleep() 睡觉
 *      public void study() 学习
 *   注意事项：
 *      成员变量是直接定义在类当中的，在方法外边
 *      成员方法要写static关键字
 */

public class Student {
    //成员变量
    String name;
    //年纪
    int age;
    //成员方法
    public void eat(){
        System.out.println("吃饭去！");
    }

    public void sleep(){
        System.out.println("睡觉去");
    }

    public void study(){
        System.out.println("学习~！");
    }
}
