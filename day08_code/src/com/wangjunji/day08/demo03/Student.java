package com.wangjunji.day08.demo03;

import java.util.concurrent.atomic.AtomicInteger;

public class Student {
    private int id;
    private String name;
    private int age;
    static String root ;

    private static int idCounter = 0;
    public Student(){
        this.id = ++idCounter;
    }

    public Student( String name, int age ) {
        this.name = name;
        this.age = age;

        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
