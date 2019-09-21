package com.wangjunji.thread.demo03;

/**
 * 如果finally有return 语句，永远返回finally中结果，避免该情况
 */
public class Deme02Exception {
    public static void main(String[] args) {

    }

    public static int getA() {
        int a = 10;
        //定义一个方法，返回变量a的值
            return a;

    }
}
