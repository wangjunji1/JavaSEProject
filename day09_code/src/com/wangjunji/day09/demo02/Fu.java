package com.wangjunji.day09.demo02;

public class Fu {
    int numFu = 10;
    int num = 100;
    public void methodFu(){
        //使用的本类当中，不会向下找子类的
        System.out.println(num);
    }
}
