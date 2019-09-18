package com.wangjunji.day10.demo02;

/**
 * 使用接口的时候，需要注意
 * 1.静态是没有静态代码块或者构造方法的
 * 一个类的直接父类是唯一的，但是一个类可以同时实现多个接品
 * 格式
 * public class myinterfaceimpl extends classname implemnets myInterfaceA,myInterfaceB{
 *     //覆盖重写所有的抽象方法
 * }
 * 如果实现类所实现的多个接口当中，存在重复抽象，那么只需要覆盖重写一次就可以了
 * 如果实现类没有覆盖重写所有接口当中的所有抽旬，哪么实现类就必须是一个抽象类
 * 如果实现实现的多个接口当，存在重复的默认方法，那么实现类一事实上要对冲突的方法进行覆盖写
 * 一个类如果直接父类的方法当中的方法，和接口当中的默认方法产生冲突 ，优先使用父类的方法
 */
public class Demo01Interface  {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.mehtod();
    }
}
