package com.wangjunji.thread.demo04;

import java.util.Scanner;

/**
 * 要求，我们模拟注册操作，如果用户已存在，则抛出异常并提示，亲，该用户名已经被注册
 * 分析：
 *      使用数组保存已经注册过的用户名（数据库）
 *      使用scanner获取用户输入的注册的用户名（前端，页面）
 *      定义一个方法，对用户输入的中注册的用户名进行判断
 *      遍历存储已经过用户名的数组，获取每个用户名
 *      使用获取得到的用户名和用户输入的用户名比较
 *      true:
 *          用户名，已经存在，抛出RegisterException异常，告知用户“亲，该用户名已经注册
 *         ”
 *      false:
 *          继续遍历比较
 *        如果循环结束了，还没有找到重户用户提示恭喜您，注册成功
 */

public class Demo01RegisterException {
    private static String[] usernames={"张三","李四","王五"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名：");
        String user  = sc.nextLine();
        sc.useDelimiter("\r\n");
        cheackUser(user);

    }

    public static void cheackUser(String user){
        for(String username:usernames){
            if(user.equals(username)){
                throw  new RuntimeException("新该 用户已注册");
            }
        }
        System.out.println("恭喜您注成功");
    }

}
