package com.wangjunji.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字");
        int  b = scanner.nextInt();
        System.out.println("请输入第三个数字");
        int c = scanner.nextInt();
        int max = (a>b?a:b)>c?((a>b?a:b)):c;
        System.out.println(max);
    }
}
