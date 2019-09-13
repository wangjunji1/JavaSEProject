package com.wangjunji.day04.demo02;

/**
 * 方法基实就是若干语句功能的复合
 * 方法好比是一个工厂
 * 蒙牛工厂 原料奶牛，饲料，水
 *      产出物：奶制器
 *  钢铁厂：原料：铁矿石、煤炭
 *      产出品：钢铁建材
 *  参数（原料）：就是进入方法的数据
 *  返回值（产出物）：就是方法中产出的数据
 *
 *  定义方法的完整格式：
 *      修饰符 返回值类型 方法名称（参数类型 参数名称，……）
 *      方法体
 *      return 返回值
 *
 *  修饰符：现阶段的固定写法 public static
 *  返回值类型，也就是方法最终产生的数据结果是什么类型
 *  方法名称：方法的名字，规则和变量，跟变量一样
 *  参数类型:进入方法的数据的类型是什么
 *  参数据：进入方法的数据对应的变理名称
 *  ps:参数如果有多个，使用逗号进行分隔
 *  方法体：方法需要做的事情，若干行代码
 *  return 两个作用，第一停止当前的访求 ，第二将后面返回值还给调用处
 *  返回值：也就是方法执行后产生的数据结果
 *  注意：return 后面的返回值,必须和方法名称前面的返回值类型，保持对应
 *
 *  定义一个两个int 数据字相加，三要素
 *  返回值：int
 *  方法名：sum
 *  参数名称：int a ,int b
 *
 *  方法的三种调用格式：
 *  1：单独调用：方法名称（参数）
 *  2：打印调用：System.out.println(方法名称（参数）)
 *  3：赋值调用：数据类型 变量名=方法名称（参数）
 *
 *  注意：此前学习的方法，返回值类型固定的写为void,这种方法只能单独调用，不能进行打印调用或者赋值调用
 */
public class Demo02MethdodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(10,29);
        System.out.println("============================");
        //打印调用
        System.out.println(sum(10,290));
        System.out.println("============================");
        //赋值调用
        int number = sum(10,290);
        System.out.println("变量的值"+number);
        System.out.println("============================");
    }

    public static int sum(int a ,int b ){
        return a+b;
    }

}
