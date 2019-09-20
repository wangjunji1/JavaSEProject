package demo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01ToString {
    public static void main(String[] args) {
        Person p = new Person("张三",19);
        String s = p.toString();
        System.out.println(s);

        System.out.println(p);

        Random r = new Random();
        System.out.println(r);
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
    }
}
