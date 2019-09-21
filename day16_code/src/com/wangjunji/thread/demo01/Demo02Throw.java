package com.wangjunji.thread.demo01;

/**
 * throw关键字
 *  作用：
 *      可以使用throw关键字在指定的方法抛出指定的异常
 *  使用格式：
 *      throw new xxxxExctpion（异常处产生的异常）
 *  注意：
 *      throw 关键字必须写在方法的内容
 *      throw关键字后边new的对象必须是Exception 或者Exception的子类对象
 *      throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
 *             throw关键字后边创建的对象 RuntimeException或者是RuntimeException的子类对象，我们可以不处理
 *             默认交给jvm处理（打印异常处理，中断程序）
 *             throw关键字，后面创建的是runtimeException或者是RuntimeException子类我们
 */

public class Demo02Throw {
}
