package com.wangjunji.day05.demo03;

public class Demo06ArrayMin {
    public static void main(String[] args) {
        int[] array ={12,12,3,41,123,120,0,-10};
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            min=array[i]<min?array[i]:min;
        }
        System.out.println(min);
    }
}
