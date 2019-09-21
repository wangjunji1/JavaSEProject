package com.wangjunji.thread.demo01;

import java.util.Objects;

public class Demo04Object {
    /**
     * object类的静态方法
     *  public  static<T> T requireNonNull(T object)查看指定的对象不是不是null.
     *  源码
     *      public static <T> T requireNoneNull(T obj){
     *          if(obj == null ){
     *              throw new NullPoninterException
     *              return obj;
     *          }
     *      }
     */
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Objects obj){
        Objects.requireNonNull(obj,"传递的对象的使用是null");
    }

}
