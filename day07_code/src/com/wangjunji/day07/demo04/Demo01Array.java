package com.wangjunji.day07.demo04;

/**
 * 题目：
 *      定义一个数组，用来存储3个Person对象
 * 数组有一个缺点，一旦创建，程序运行期间长度不可以发生改变。
 */
public class Demo01Array {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] persons = new Person[3];
        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力那扎",28);
        Person three = new Person("玛尔扎哈",38);
        persons[0] = one;
        persons[1] = two;
        persons[2] = three;
        System.out.println(persons[0]);
        System.out.println(persons[1]);
        System.out.println(persons[2]);
        System.out.println(persons[0].getName());
        System.out.println(persons[1].getName());
        System.out.println(persons[2].getName());
    }
}
