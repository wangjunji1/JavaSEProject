package com.wangjunji.day08.demo04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 题目：
 *  请使用Arrays相关api,将一随机字符串所有升排序，并倒序打印
 */
public class Demo02ArrayPractise {
    public static void main(String[] args) {
        String str = "asv76agfqwdfvasdfvjh";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        for (int length = chars.length-1; length >= 0; length--) {
            System.out.print(chars[length]);
        }
    }
}
