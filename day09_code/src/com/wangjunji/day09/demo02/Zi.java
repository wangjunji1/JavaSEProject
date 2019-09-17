package com.wangjunji.day09.demo02;

public class Zi extends Fu{
    int numZi = 20;
    int num = 200;
    public void methodZi(){
        //因为本类当中有num,所以这里的用的本类的num
        System.out.println(num);
    }

}
