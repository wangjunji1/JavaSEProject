package com.wangjunji.day08.demo02;

/**
 题目：
 定义一个方法，把数组[1,2,3]按照指定格式拼接成一个字符串，格式参数如下：【word#word#word】
 分析：
    首先准备一个int[] 数组，内容是 1、2、3
    定义一个方法，用来将数组变成字符串
 三要素，返回string
 方法名：fromArrayToString
 参数列表：int []
 3.格式【word#word#word】
 用到for循环、字符串拼接，每个数组元素都有一个word字样、
 */
public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        String result = fromArrayToString(array);
        System.out.println(result);

    }

    public static String fromArrayToString(int[] array){
        String s = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                s+="word"+array[i]+"]";
            }else{
                s+="word"+array[i]+"#";
            }

        }

        return s;
    }
}
