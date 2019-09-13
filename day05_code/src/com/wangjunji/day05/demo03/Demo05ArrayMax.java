package com.wangjunji.day05.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {5,15,30,20,10000,30,35};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = array[i]>max?array[i]:max;
        }
        System.out.println(max);
    }
}
