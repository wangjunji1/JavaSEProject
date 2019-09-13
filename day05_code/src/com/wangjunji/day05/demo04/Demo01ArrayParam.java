package com.wangjunji.day05.demo04;

/**
 * 一个方法以有0，1多个参数，但是只能有0或者1个返回值，不能有多个返回值
 * 如果希望一个方法当中产生多个结果数据进行返回，怎么办
 * 解决方案，返回一个数组
 * 任何数据类型都能作为方法的参数类型，或者返回类型
 * 数组作为方法的参数，传递进去其实数组的地址值
 * 数组作为方法的返回值，返回的其实也是数组的地址值
 */
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] result = calculate(1,2,3);
        System.out.println("返回值的地址是"+result);
        System.out.println("总数："+result[0]);
        System.out.println("平均数："+result[1]);
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a+b+c;
        int avg = sum/3;
        //两个结果都希望进行返回
        //需要一个数组，也就是一个保存多个结果
        int[] array =new int[2];
        array[0]=sum;
        array[1]=avg;
        return array;
    }
}
