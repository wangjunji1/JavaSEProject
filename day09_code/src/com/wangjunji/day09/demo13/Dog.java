package com.wangjunji.day09.demo13;

//子类也是一个抽象为在
public abstract class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

}
