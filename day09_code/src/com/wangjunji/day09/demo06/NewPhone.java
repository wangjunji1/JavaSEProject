package com.wangjunji.day09.demo06;

public class NewPhone extends Phone{
    public void show(){
        //把父类的show方法拿过来重复利用
        super.show();
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
