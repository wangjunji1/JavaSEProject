package com.wangjunji.day10.demo01;

/**
 * 在任何版本的java中，接口都能定义抽象方法
 * 格式：
 *  public abstract 返回值类型 方法名称（参数列表）;
 *  注意事项
 *  1.接口当中的抽象方法，修饰符必须是两个固定的关键的字，public abstract
 *  2.这两个关键字修饰符，可以选择性的省略
 *  3.方法的三要系，可以随意定义
 */
public interface MyInterfaceAbstract {
    public abstract void methodAbs1();
    //这也是抽象方法
    public void methodAbs3();
    //这也是抽象方法
    abstract void methodAbs2();
    //这也是抽象方法
    void methodAbs4();


}
