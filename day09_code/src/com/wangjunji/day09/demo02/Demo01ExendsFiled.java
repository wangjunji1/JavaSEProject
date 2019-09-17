package com.wangjunji.day09.demo02;

/**
 * 在父子类的继承关系当中，如果成员变量重名，则创建子类对象，访问有两种方式：
 *  直接通过子类对象访问成员变量
 *      等号左边是谁，就是优用谁，没有则向上找
 *  间接通过成员方法访问成员变量
 *      该方法属于谁，就优先于，没有则向上找
 */
public class Demo01ExendsFiled {
    public static void main(String[] args) {
        //创建父类对象
        Fu fu = new Fu();
        //只能使用父类的东西，没有任何子类内容
        System.out.println(fu.numFu);
        System.out.println("--------------------------------------");
        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println(zi.num);
        System.out.println("--------------------------------------");
        //等号左边是谁，就优先用谁
        System.out.println(zi.num);
        System.out.println("--------------------------------------");
        Fu zi1 = new Zi();
        System.out.println(zi1.num);
        //这个方法是子类，优先用子类的，没有向上找
        zi1.methodFu();


    }
}
