package com.wangjunji.day08.demo02;

/**
 * 字符串的截取方法：
 *      public String substring(int index):截取从参数位置一直到字符串末尾，返回字符串。
 *      public String substring(int begin,int end):截取从begin开始，一直到end结束，中间的字符串
 *  备注[begin,end)包含左边，不包含右侧
 */
public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "Helloworld";
        String str2 = str1.substring(9);
        System.out.println(str2);
        System.out.println("=================");
        String str3 = str1.substring(4,7);
        System.out.println(str3);
        System.out.println("=================");
        //下面这种写法，字符串内容仍然是没有改变的
        //下面有两种字符串，"Hello" "java"
        //strA当中保存的是地址值
        //本来地址值hello
        //后来的地址值 变成java

        String strA = "Hello";
        System.out.println(strA.hashCode());
        strA = "Java";
        str1="Java";
        str2=new String(new char[]{'J','a','v','a'});
        System.out.println(strA.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
