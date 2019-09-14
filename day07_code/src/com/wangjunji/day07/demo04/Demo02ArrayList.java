package com.wangjunji.day07.demo04;

import java.util.ArrayList;

/**
 * 数组的长度不可以发生改变
 * 但是arrayList集合的长度是可以随意变化
 * 对于arrayList来说，有一个尖括号<E> 代表泛型
 * 泛型：也就是装在集合当中的所有元素，全都是统一的什么类型
 * 注意：泛型只能是引用类型，不能是基本类型
 * 注意事项：
 *      对于ArrayList集合，直接打印得到不是地址值，而是内容
 *      如果内容是空，得到的空的中括号
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个arrayList ，集合的名称是List,里的全都是String字符串类的数据
        //备注：从jdk1.7开始，右侧泛型尖括号内部不可以写内空，但是方括号一定要写
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        //向集合中添加元素
        list.add("迪丽热巴");
        list.add("古力那扎");
        list.add("玛尔扎哈");
        System.out.println(list);
        //list.add(100) //错误 写法，因为创建的时候类括号泛型已经说了字符串，添加进去的元素就必须是字符串才行

    }
}
