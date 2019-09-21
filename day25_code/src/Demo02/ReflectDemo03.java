package Demo02;

import domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo03 {
    /**
     * class对象功能：
     *  获取功能
     *  获取成员变量们
     *  Field[] getFields()
     *  Field getField(String name)
     *  Field  getDeclareFields()
     *
     */
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
       Class cls = Person.class;
        Constructor constructor = cls.getConstructor();
        //创建对象
        //创建对象
        Object perosn = constructor.newInstance();
        Constructor constructor1 = cls.getConstructor(String.class,int.class);
        Object wangjunji = constructor1.newInstance("wangjunji", 100);
        System.out.println(wangjunji);
        System.out.println(perosn);
    }
}
