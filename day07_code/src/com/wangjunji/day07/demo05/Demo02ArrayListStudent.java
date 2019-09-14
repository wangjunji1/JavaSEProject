package com.wangjunji.day07.demo05;

import java.util.ArrayList;

/**
 * 题目：
 *  自定义4个学生对象，添加集合，并遍历
 * 思路：
 *  自定义student学生类，四个部分
 *  创建一个集合，用来存储学生对象。泛型<student>
 *  根据类，创建4个学生对象
 *  将4个对象添加到集合中，add
 *  遍历集合，for，size,get
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("洪七公",201);
        Student two = new Student("欧阳峰",210);
        Student three = new Student("黄药师",210);
        Student four = new Student("段智兴",120);
        list.add(one);
        list.add(three);
        list.add(two);
        list.add(four);
        for (Student student : list) {
            System.out.println(student.getAge()+student.getName());

        }
    }
}
