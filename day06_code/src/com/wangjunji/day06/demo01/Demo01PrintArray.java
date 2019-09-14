package com.wangjunji.day06.demo01;

import java.util.Arrays;

public class Demo01PrintArray {
    /**
     * 面向过程，当需要一个功能的时候，每个具体的步骤都需要亲力亲为，详细处理每一个细节
     * 面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，帮我做事儿
     */
    public static void main(String[] args) {
        int[] array={10,20,30,40,50,60};
        //要求打印的格式为{10，20，30，40，50，60}
        //使用面向过程，每一个步骤细节都要亲力亲为
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            if(i!=(array.length-1)  ) {
                System.out.print(array[i]+" ,");
            }else
                System.out.print(array[i]);
        }
        System.out.println("}");
        //使用面向对象
        //找一个jdk提供好的array类
        //其中有一个toString类，直接就能把数组组成想要的格式的字符串
        System.out.println(Arrays.toString(array));
    }
}
