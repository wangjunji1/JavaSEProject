package com.wangjunji.day07.demo05;

import java.util.ArrayList;

/**
 * 题目：定义指定格式打印集合的方法（ArrayList类型作为参数），使用{}扩起，使用@分隔元素
 * 格式参照{元素@元素@元素}
 * System.out.printl(list)
 * printArrayList(list)
 */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("宋远桥");
        list.add("张无忌");
        list.add("张翠山");
        System.out.println(list);
        printArrayList(list);
    }

    /**
     * 定义方法的三要素
     * 返回值类型：只是进行打印而已，没有运算，所以用void
     * 方法名称：printArrayList
     * 参数列表arrayList
     *
     */
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{ ");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                System.out.print( list.get(i));
            }else{
                System.out.print( list.get(i)+" ,");
            }
        }
        System.out.println(" }");

    }
}
