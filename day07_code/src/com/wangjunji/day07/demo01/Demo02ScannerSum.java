package com.wangjunji.day07.demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 题目：
 *      键盘输入两个int数字，并且求出和的值
 *  思路：
 *      即然要输入键盘，那么就用Scanner
 *      scanner 的三个步骤，导包，创建，使用
 *      需要的两个数字，所以要调用两次nextInt方法
 *      得到了两个数字，就需要加在一起
 *      将结果打印输出
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream("D:\\code\\day01_eesy_04mybatis_design\\src\\main\\resources\\SqlMapConfig.xml"));
            scanner.useDelimiter("\r\n");
            while(scanner.hasNext()){
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
