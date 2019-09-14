package com.wangjunji.day07.demo02;

/**
 * 创建对象的标准格式
 * 类名称 对象名=new 类名称
 * 匿名对象就是只有右边的对象，没有左字的名字，和赋值运算符
 * new 类名称（）
 * 注意事项:匿名对象只能使用唯一的一次，下次再用不得创建一个新对象
 * 使用建议，如果确定有一个对象只需要唯一的一次，就可以用匿名对象
 */
public class Demo01AnonymOus {
    public static void main(String[] args) {
        Person one = new Person();
        one.name="高圆圆";
        one.showName();

        new Person().name="赵又迁";
        new Person().showName();
    }
}
