package com.wangjunji.thread.demo01;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * throws 关键字，异常处理的第一种方式，交给别人处理
 * 作用：
 *      当方法内部抛出异常对象的时候，那么我们就必须处理这个异常
 *      可以使用throws关键处理异常对象，会把异常对象声明抛出给方法的调用者处理（自已不处理，别人处理）
 *      最终交给jvm处理---》中断处理
 *  使用格式：在方法声明时使用
 */
public class Demo05Throws {
    public static void main(String[] args) throws IOException {
        readFile("c:\\a.txt");
        System.out.println("后续代码");
    }

    public static void readFile(String fileName) throws IOException {
        if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        }

        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
