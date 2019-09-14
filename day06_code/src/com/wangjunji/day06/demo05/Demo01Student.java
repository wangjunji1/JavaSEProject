package com.wangjunji.day06.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(20);
        student.setName("鹿晗");
        System.out.println("姓名："+student.getName()+"年龄："+student.getAge());
        Student stu2 = new Student("古力那扎",21);
        System.out.println("姓名："+stu2.getName()+"年龄："+stu2.getAge());
        stu2.setAge(22);
        System.out.println("姓名："+stu2.getName()+"年龄："+stu2.getAge());

    }
}
