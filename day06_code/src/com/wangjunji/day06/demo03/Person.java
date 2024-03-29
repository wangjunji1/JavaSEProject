package com.wangjunji.day06.demo03;

/**
 * 问题描述：定义phone的年龄时，无法阻止不合理的数值被设置进来。
 * 解决方案，用private 关键字将需要保护的成员变量进行修饰
 * 一旦使用了private进行修饰，那么本地类当中仍然可以随意访问
 * 但是！超出了本类范围之外的就不能直接访问了
 *
 * 间接访问private 成员变量，就是定义一对getter setter方法
 * 必须叫setXXX 或者 getXXX 命名规则
 * ，对于Getter来说，不能有参数，返回值类型和成员变量对应
 * 对于Setter 来说，不能有返回值，参数类型和成员变量对应。
 */
public class Person {
    String name;//姓名
    private  int age;//年龄

    public void show(){
        System.out.println("我叫"+name+" ,年龄"+age);
    }

    //这个成员方法，专门用于向age设置数据
    public void setAge(int num){
        if(num < 100 && num>=9){
            age = num;
        }else{
            System.out.println("数据不合理");
        }
    }

    public int getAge(){
        return age;
    }
}
