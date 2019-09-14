package com.wangjunji.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * 题目：生成1-33之间的随机整数，添加到集合，并遍历集合
 * 思路：
 * 需要存储6个数字，创建一个集合<Integer>
 *     产生随机数，需要用到random
 *     用循环6次，来产生6个随机数字，for循环
 *     循环内调用r.nextInt(int n).参数是33，整体+1才是33
 *     把数字添加到集合中，add
 *     遍历集合，for size get
 *
 */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        while(list.size()<=6){
          int num =  rd.nextInt(33);
          num+=1;
          if(list.contains(num)){
              continue;
          }else{
              list.add(num);
          }
        }
        System.out.println(list);
    }

}
