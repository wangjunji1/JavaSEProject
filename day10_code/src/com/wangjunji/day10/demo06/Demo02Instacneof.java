package com.wangjunji.day10.demo06;




/**
 * 如何才能知道一个父类引用的对象，本来是什么子类
 * 格式：
 * 对象 instanceof 类名称
 * 这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例。
 */
public class Demo02Instacneof {
    public static void main(String[] args) {
        Amimal amimal = new Dog();
        amimal.eat();

        //如果希望掉用子类特有方法，需要向下转型
        //判断一下父类引用animal本来是不是Dog
        if (amimal instanceof Dog) {
            Dog dog = (Dog) amimal;
            dog.watchHouse();
        }

        if (amimal instanceof Cat) {
            Cat cat = (Cat) amimal;
            cat.catchMouse();
        }

        giveMePet(new Dog());


    }

    public static void giveMePet(Amimal animal){
        if(animal instanceof  Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if(animal instanceof  Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }


}
