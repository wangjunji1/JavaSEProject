package com.wangjunji.day06.demo04;

/**
 * 构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法
 * 格式：
 *      public 类名称(参数类型 参数名称)
 *      {
 *          方法体
 *      }
 *
 * 注意事项
 *      构造方法的名称必须和所在的类名完全一样，就大小写也要一样
 *      构造方法不要写返回值类型，连void 都不写
 *      构造方法不能有return 一个具体的返回值
 *      如果没有编写任何构造方法，那么编译器将会默认赠送一个构造方法，没有参数 ，方法体什么事情都不会
 *      public Student(){}
 *      一旦编写至少一个构造方法，那么编译器将不再赠送
 *      构造方法也是可以进行重载的
 */
public class Student {
    //成员变量
    private String name;
    private int age;
    //无参数构造方法
    public Student(){
        System.out.println("无参数构造方法执行啦");
    }

    //全参数构造方法
    public Student(String name,int age){
        System.out.println("全参构造方法执行啦。。");
        this.age=age;
        this.name = name;
    }

    //Getter Setter方法
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}
