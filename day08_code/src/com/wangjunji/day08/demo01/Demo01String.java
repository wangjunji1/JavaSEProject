package com.wangjunji.day08.demo01;

/**
 * java.lang.String类代表字符串类
 * API当中说，java程序中所有字符串，字符值（如“abc”）都作为此类的实例实现
 * 基实就是说，程序当中所有的双引号字符串，都是string类的对象，
 * 字符串的特点：
 *      字符串的内容永不可变
 *      正是因为字符串不可改变，所以字符串是可以共享使用的
 *      字符串效果上相当于是char[] 字符数组，但是底层原理是byte[] 字节数组
 *  创建字符串的常见三种方法。
 *  public String():创建一个空白字符 串，不含 任何内容
 *  public String(char[] array):根据字符数组的内容，来创建对应的字符串
 *  public String(byte[] array):根据字节数组的内容，来创建对应的字符串
 *  一种直接创建：
 *   String str="Hello" //右边直接用双引号
 *   注意写上双引号，就是字符串对象
 */

public class Demo01String {
    public static void main(String[] args) {
        char wang = '王';
        char jun = '骏';
        char ji = '骥';
        System.out.println(wang+0);
        System.out.println(jun+0);
        System.out.println(ji+0);
        //使用空参构造
        //小括号留空，说明字符串什么内容都没有
        String str = new String();
        System.out.println("第二个字符串"+str);
        char[] str2 = {29579,39567,39589};
        String str3 = new String(str2);
        System.out.println(str3);
        byte[] str4 = new byte[]{97,98,99};
        String str5 = new String(str4);
        System.out.println(str5);
    }
}
