package com.wangjunji.thread.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.lang.Throwable: 类是java语言中所有错误和异常的超类
 * Exception：编译器异常，进行编译（写代码）java程序出现的问题。
 * RuntimeException：运行期异常，java程序运行过程中出现的问题
 * 异常就相当于程序得了一个小毛病（感冒，发烧），把异常处理掉，程序可以继续（吃点药，继续革命工作）
 * Error:错误
 *  错误：就相当于程序得了一个无法治愈的毛病，必须修改源代码，程序才能继续执行。
 */
public class Demo01Exception  /* throws ParseException*/{
    public static void main(String[] args) {
        //Exception:编译期异常，进行编译（写代码） java程序出现的问题
        //用来格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = new Date() ;
        try {
            //把字符串的格式的日期，解析为Date格式的日期
            date = sdf.parse("1999年01月01日");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //RuntimeException:运行期异常，java程序运行过程出现的的问题
       // System.out.println(date);
        int []arr = {1,2,3};
        System.out.println(arr[0]);

        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * Error错误：
         *  OutOfMemoryError: java heap space
         *  内存溢出的错，创建的数据太大，超出了jamv给的内存
         *
         */

        try {
            int[] arr1 = new int[10000*100000*1000];
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        } finally {
        }
        System.out.println("后续代码");
    }
}
