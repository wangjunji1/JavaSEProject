package com.wangjunji.day10.demo06;

/**
 * 向上转型一定是安全的，没有问题的，正确的。
 * 但是也有一个弊端：
 * 对象一旦向上转型为父类，那么就无法调用子类原来特有的内容
 * 解决方案：用对象的向下转型
 */
public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型，就是：父类引用指向之类对象
        Amimal animal = new Cat();//本来创建的进候是一只猫
        animal.eat();
        //向下强转
        Cat cat = (Cat) animal;
        cat.catchMouse();
    }
}
