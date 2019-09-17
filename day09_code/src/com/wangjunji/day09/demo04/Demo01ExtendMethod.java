package com.wangjunji.day09.demo04;

/**
 * 在父子类的继承关系当中，创建子类对象，访问成员方法的规则
 *   创建的对象是谁，优先先用谁，如果没有向上找
 *   注意事项：
 *      无论成员还是成员变量，如果没有都是向上找，绝对不向下找
 *      重写
 *      在继承关系中，方法的名称一样，参数列表也一样
 *      重写，方法的名称一样，参数列表也一样，重载
 *      方法的名称一样，参数个数不一样
 *
 *      方法的覆盖特点，创建的子类对象，则优先创建子类方法
 */
public class Demo01ExtendMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
        zi.methodZi();
        //
        zi.methodFu();
    }
}
