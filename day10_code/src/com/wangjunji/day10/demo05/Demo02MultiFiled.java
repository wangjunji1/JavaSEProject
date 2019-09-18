package com.wangjunji.day10.demo05;

/**
 * 在多态的代码当中，成员方法的访问规则是，看new是谁，
 * 就优先用谁，测有则向上找
 * 成员变量：编译看左边，运行还看左边
 * 成员方法：编译看左边，运行看右边
 *
 */
public class Demo02MultiFiled {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.showNum();
        obj.method();
        obj.methodFu();
    }
}
