package com.wangjunji.thread.demo04;

public class RegisterException  extends RuntimeException{
    /**
     * 自定义异常为，不够我们自已定义的类，需要自已定义一些异常类
     * 格式：
     *      public class xxxException extends Exception |RuntimeException{
     *          添加一个空参数构造方法
     *          i添加一个带异常信息的构造方法
     *          注意：自定义异常类一般都 是以exception结尾，说明该类是一个异常类
     *          自定义异常类，必须的继承Exception或者RuntimeExcetpion
     *          继承Exctpion那么处
     *      }
     */

    public RegisterException(){

    }

    public RegisterException(String message){
        super(message);
    }
}
