package com.wangjunji.day04.demo03;

/**
 * 使用方法的时候，注意事项
 * 1：方法应该定义在类中，但是不能在方法当中再定义方法，不能嵌套
 * 2：方法的定义的前后顺序无所谓
 * 3：方法定义之后不能执行，但是希望执行，一定要调用，打印调用，赋值调用
 * 4：如果方法有返回，那么必须写上return返回值，不能没有
 * 5：return 后面的返回值数据，必须和方法返回值类型同，对应起来
 * 6：对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自已
 * 7:对于void方法当中最后一行的return 可以省略不写
 * 一个方法当中可能有多个return 语句，但是必须保证同时只能只有一个会执行到，两个return 不能连写
 */
public class Demo04MethodNotice {
    public static int method(){
        return 10;
    }

    public static void method02(){
        return ;
    }

    public static void method03(){
        System.out.println("AAA");
        System.out.println("BBB");
    }

    public static int getMax(int a,int b ){
        return a>b?a:b;
    }


}
