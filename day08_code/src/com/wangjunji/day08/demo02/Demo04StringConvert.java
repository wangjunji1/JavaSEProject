package com.wangjunji.day08.demo02;

/**
String 当中的转换相关的常用方法有
 public char[] toCharArray:把当前的字符串拆成为字符数组作为返回值
 public byte[] getBytes:获得当前字符串底层的字节数组
 public String replace(charsequence oldstring,charsequece newstring)
 将所有的出现的老字符替换成字符串，返回替换之后的结果新

 */
public class Demo04StringConvert {
    public static void main(String[] args) {
        //转换为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println("Hello");
        System.out.println(chars.length);
        System.out.println("=====================");
        //转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("======================");
        //字符串的内容替换
        String str1 = "How do you do?";
        String str2 =str1.replace('o','*');
        System.out.println(str2);

        String lang1 = "会不会玩儿呀！你大爷的！你大爷的";
        String lang2 = lang1.replace("你大爷的","***");
        System.out.println(lang2);

    }
}
