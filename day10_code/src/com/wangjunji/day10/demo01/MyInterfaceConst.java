package com.wangjunji.day10.demo01;

/**
 * 接口当中也可以定成员变量，但是必须使用public static final 三个关键字进行修饰
 * 从效果上看，这其实就是接口的常量
 * 格式：
 *  public static final 数据常量 常量名称=数据值。
 *  备注：
 *      一旦使用final 关键字进行修饰，说明不可改变。
 *  注意事项：
 *      接口当中的变量，可以省略public static final注意，不写也照样也这样
 *      接口当中的常量，必须进行赋值，不能不赋值
 *      接口中学好，使用完全大写的字母，用下划线进行分隔（推荐命名规则）
 */
public class MyInterfaceConst {
    //这其实就是一个常量，一旦赋值，不可以修改
    public static final int NUM_OF_MY_CLASS=12;
}
