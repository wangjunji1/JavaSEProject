package com.wangjunji.day08.demo03;

/**
 * 一旦使用static 修饰成员方法，那么就成为了静态方法，静态方法不属于对象，而是属于类的
 * 如果没有Static 关健字，那么必须首先创建对象，然后,通过对象才能使用它
 * 如果有了staic关键字，那么不需要创建对象，然后，就可以类名进行调用
 * 静态变量：类名称：静态变量
 * 静态方法：类名称：静态方法
 * 注意事项：
 *  静态不能直接访问非静态
 *  原因，因为内存当中是先有静态内空，后有的非静态内容
 *  先人不知道后人，但是后人知道先人
 *
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        //然后才能使用没有static关键字的内容
        obj.method();
        //对于静态方法来说，可通过对象名进行调用同，也可以直接通过类名称来调用
        obj.method();
        obj.methodStatic();
        MyClass.methodStatic();



    }

}
