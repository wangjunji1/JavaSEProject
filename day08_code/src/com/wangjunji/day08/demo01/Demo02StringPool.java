package com.wangjunji.day08.demo01;

/**
 * 字符串常量池，程序当中直接写上的双引号字符串，就在字符串常量池中
 * 对于基本类型来说，==是进行数值的比较
 * 对于引用类型来说，==是进行地址值的比较
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        //字符串常量池，程序当中直接写双引号字符串，就在字符串常量池中
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a', 'b','c'};
        String str3 = new String(charArray);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str1==str3);
    }
}
