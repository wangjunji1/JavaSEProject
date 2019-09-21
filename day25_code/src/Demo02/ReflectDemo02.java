package Demo02;


import domain.Person;

import java.io.FileFilter;
import java.lang.reflect.Field;

/**
 * class对象功能：
 * 获取功能
 * 获取成员变量们
 *      Field[] getFields[]
 *      Field getFields(String name)
 *      Filed[] getDeclearFileds
 *      Field getDeclearfiled
 * 获取构造方法们
 *      constructor<?>[] getConstructors()
 *
 */
public class ReflectDemo02 {

    private static Object o;

    public static void main(String[] args) {
        Class personCls ;
        try {
            personCls = Class.forName("domain.Person");
            Field[] fields = personCls.getFields();
            System.out.println("------------------------------------");
            for (int i = fields.length - 1; i >= 0; i--) {
                System.out.println(fields[i]);
            }
            System.out.println("------------------------------------");

            Field field = personCls.getField("a");
            System.out.println(field);
            Person p = new  Person();
            o = field.get(p);
            System.out.println(o);
            field.set(p,"张三");
            o = field.get(p);
            System.out.println(o);
            Field[] declaredFields = personCls.getDeclaredFields();
            System.out.println("------------------------------------");
            for (Field declaredField : declaredFields) {
                System.out.println(declaredField);
            }
            System.out.println("------------------------------------");
            Field d = personCls.getDeclaredField("d");
            d.setAccessible(true);
            Object o1 = d.get(p);
            o= d.get(p);
            System.out.println(o);
            d.set(p,"wangjunji");
            System.out.println(d.get(p));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
