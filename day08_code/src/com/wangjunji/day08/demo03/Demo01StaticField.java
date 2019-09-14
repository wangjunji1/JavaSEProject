package com.wangjunji.day08.demo03;

/**
 * 如果一个成员变量使用Static关键字，那么这个变量不再属于对自已，而是属于所在的类，多个对象共享同一份数据
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student two = new Student("黄蓉",16);
        two.root="101教室";
        System.out.println("姓名："+two.getName()+"年龄："+two.getAge()+"教室"+two.root+
        "学号"+two.getId()
        );
        Student one = new Student("郭靖",16);

        System.out.println("姓名："+one.getName()+"年龄："+one.getAge()+"教室"+one.root+
                "学号"+one.getId()
        );

    }

}
