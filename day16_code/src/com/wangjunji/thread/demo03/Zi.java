package com.wangjunji.thread.demo03;

/**
 *
 */
public class Zi extends Fu{
    public void show01() throws NullPointerException,ClassCastException{}
    public void show02() throws ArrayIndexOutOfBoundsException{}
    public void show03()  {}
    public void show04() {
        try {
            throw new Exception("编译器异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
