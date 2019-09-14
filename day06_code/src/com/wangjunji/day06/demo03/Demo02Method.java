package com.wangjunji.day06.demo03;

/**
 * 面向对象的三大特征：封装，继承，多态
 * 封装性在java中的体现
 *  方法就是一种封装
 *  关键字private 也是一种封装
 *  封装就是将一些细节信息隐藏起来，对于外界不可见
 */
public class Demo02Method {
    public static void main(String[] args) {
        int[] array ={5,15,20,25,30};
        int max = getMax(array);
        System.out.println(max);
    }

    public static int getMax(int[] array){
        int max=array[0] ;
        for (int i : array) {
            max=max>i?max:i;
        }
        return max;
    }
}
