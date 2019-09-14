package com.wangjunji.day06.demo01;

/**
 * 通常情况下， 一个类不能直接使用，需要创建对象，才能使用
 * 1.导包：也就是指出需要使用的类，在什么位置
 * import 包名.类名
 * import com.wangjunji.day06.demo01.Student
 * 对于和当前类属于同一个包的情况下，可以省略包语句不写
 * 2.创建，格式
 *  类名称，对象名 = new 类名称
 *  Student stu = new Student;
 *
 *  3.使用，分为两种情况
 *  使用成员变量，对象名.成员变量名
 *  使用成员方法  对象名.成员方法名（参数）
 *  注意事项：
 *          如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样。
 */
public class Demo02Student {
    public static void main(String[] args) {
        //导包
        //我需要使用student类，和省略导包语句不写
        //创建格式
        Student st = new Student();
        //使用其中的成员变量、格式
        //对象名.成员变量名
        System.out.println(st.age);
        System.out.println(st.name);
        System.out.println("==============================");
        //改变对象当中的成员变量数值内容
        //将右侧的字符串，赋值交给St对象当中的name成员变量
        System.out.println("==============================");
        st.age=18;
        st.name="赵丽颖";
        System.out.println(st.age);
        System.out.println(st.name);
        System.out.println("=================================");
        //使用对象的成员方法，格式
        //对象名.成员方法名()
        st.eat();
        st.sleep();
        st.study();
    }
}
