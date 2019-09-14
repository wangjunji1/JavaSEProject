package com.wangjunji.day07.demo04;

import java.util.ArrayList;

/**
 * ArrayList当中常用的方法有：
 *  public boolean add(E e) 向集合当中添加元素，参数类型跟泛型一致，返回值代表添加是否成功
 *  备注ArrayList集合来说，add添加动作一定是成功，返回值可用可不用。
 *  但是对于其他集合，add添加不一定成功
 *  public E get(int index) 从集合当中元素，参数是索引编号，返回值就是对应位置的元素。
 *  public E remove(int index) 从集合中删除元素，参数是索引编号，返回值就是被删除的元素
 *  public int size() 获取集合的长度，返回值是集合中包含的个数
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        //向集合中添加元素:add
        boolean success = list.add("柳岩");
        System.out.println("添加的动作是否成功："+success);
        list.add("高圆圆");
        list.add("赵又延");
        list.add("李小璐");
        list.add("贾乃亮");
        System.out.println(list);
        //从集合中获取元素，get 索引从0开始
        String name = list.get(2);
        System.out.println("第2号索引位置"+name);
        //从集合中删除元素，索引从0开始
        String whoRemoved = list.remove(2);
        System.out.println("被删除的人是"+whoRemoved);
        System.out.println(list);
        //获取集合的长度，也就是其中元素的个数
        int size = list.size();
        System.out.println(size);
    }
}
