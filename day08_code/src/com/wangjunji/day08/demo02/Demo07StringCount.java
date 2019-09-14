package com.wangjunji.day08.demo02;

import java.util.Scanner;

/**
 * 题目：键盘输入一个字符串，并统计其中字符出现的次数
 * 种类有：大写字母，小写字母，数字，其他
 * 思路：
 * 即然用到键盘输入，肯定是scanner
 * 键盘输入的是字符中，那么String str = sc.next()
 * 定义四个变量，分别代表四种字符各自的出现次数
 * 需要对字符串一个个地检查，方法
 */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        String input = sc.next();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println(countLower);
        System.out.println(countUpper);
        System.out.println(countNumber);
        System.out.println(countOther);
    }

}
