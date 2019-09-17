package com.wangjunji.day09.demo11;

/**
 * 抽象方法，就加上一个abstract关键字，然后去掉大括号，直接分号结束
 * 抽象类：抽象方法所在的类，必须是抽像类才行，在class之前写上abstract即可
 *
 * 如何使用抽象类和抽象方法
 * 不能直接创建new 抽象类对象
 * 必须用一个子类继承抽象父类
 * 子类必须覆盖重写抽象父类当中的所有的抽像方法
 * 覆盖重写，子类去掉abstract关键字，然后补上方法体上括号
 * 创建 子类对象进行
 */
public abstract  class Animal {
    //这是一个抽象方法，代表吃东西，但是具体吃什么不确
    public abstract void eat();
}
