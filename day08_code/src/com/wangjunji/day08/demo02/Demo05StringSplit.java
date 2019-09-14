package com.wangjunji.day08.demo02;

/**
 * 分割字符串的方法：
 *  pulbic String[] split(String regex):按照参数的规则，将字符串切分成若干部分
 * 注意事项：
 *      split方法的参数其实是一个正则表达式。
 *      注意对于用.进行切分，必须需要用\\.
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] strSplit = str1.split("\\.");
        for (String s : strSplit) {
            System.out.println(s);
        }

        System.out.println("==============================");

        String str2 = "aaa bbb ccc";
        String[] strsplitByW = str2.split(" ");
        for (String s : strsplitByW) {
            System.out.println(s);
        }

        System.out.println("=================================");
        String str3 = "xxx.yyy.zzz";
        String[] potSplits = str3.split("\\.");
        for (int i = 0; i < potSplits.length; i++) {
            System.out.println(potSplits[i]);
        }
    }
}
