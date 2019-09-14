package com.wangjunji.day08.demo02;

/**
 * String当中与获取相关的常用方法有
 * public int length() 获取字符串当中含有字符个数，拿到字符串长度
 * public String concat(String str) ：将当前字符串和参数字符串拼接返回值新的字符串
 * public char charAt(int index): 获取指定索引位置的单个字符，索引从0开始
 * public int indexof(String str):查找参数字符串在本字符串当中首次出现的索引，如果没有返回值-1值
 */
public class Demo02StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int strLength = "1333333334234sdffgsdfg".length();
        System.out.println("字符串的长度是："+strLength);

        //拼接字符串
        String str1 = "Hello";
        String str2 = " World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        //获取指定索引位置的单个字符
        char ch = "Hello world".charAt(1);
        System.out.println(ch);
        System.out.println("============================");
        //查找参数字符串在本来字符串出现的第一次索引位置
        //如果根本没有，返回-1值
        String original = "HelloWorldHelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次索引值是"+index);
        System.out.println("Helloworld".indexOf("abc"));
    }

}
