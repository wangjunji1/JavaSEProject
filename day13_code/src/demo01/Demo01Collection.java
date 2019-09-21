package demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * java.util.Collection接口
 * 所有单列集合的最顶层的接口，里边定义了所有单列集合共性的方法
 *
 */

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> coll1 = new ArrayList<>();
        Collection<String> coll = new HashSet<>();
        System.out.println(coll);
        System.out.println(coll1);
        boolean b1 = coll.add("张三");
        
    }

}
