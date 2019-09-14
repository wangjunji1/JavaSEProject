package com.wangjunji.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();//无参构造
        System.out.println("===========================");
        Student stu2 = new Student("赵丽颖",10);
        stu2.setAge(20);
        System.out.println("姓名："+stu2.getName()+"年龄："+stu2.getAge());
    }
}
