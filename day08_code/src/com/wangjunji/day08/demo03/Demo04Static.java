package com.wangjunji.day08.demo03;

/**
 * 静态代码块的格式是
 *  public class类名称{
 *      static {
 *          静态代码块的内容
 *      }
 *  }
 *
 *  特点：当第一次用到本类时，静态代码块执行唯一的一次
 *  静态内容总是优先于非静态的
 *
 */
public class Demo04Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();

    }

}
