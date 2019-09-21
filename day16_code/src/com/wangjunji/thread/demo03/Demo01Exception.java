package com.wangjunji.thread.demo03;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * 异常注意事项
 */
public class Demo01Exception {
    public static void main(String[] args) {
        /**
         * 多个异常使用捕获又该如何处理呢
         * 1.多个异常分别处理
         * 2.多个异常，多次处理
         * 3.多个异常一次捕获一次处理
         */

        //
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list.get(3));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        //多个异常一次捕获，多次处理
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list.get(3));
        } catch ( IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        /**
         * 一个try多个catch注意事项
         * catch里面定义的异常变量，如果有子父类关系，那么子类的异常变量
         */
    }
}
