package Demo02;

import domain.Person;
import domain.Student;

public class ReflectDemo01 {
    /**
     * 获取获取class对象的方式
     * 1.Class.forName("全类名")：将字节码文件加载到内存，返回class对象
     * 2.类名.class通过类名的属性class获取
     * 3.对象.getClass（）:getClass方法在object类中定义着
     */
    public static void main(String[] args) throws ClassNotFoundException {
        //Class.forName全类名
        Class cls = Class.forName("domain.Person");
        System.out.println(cls);
        //类名.class
        Class cls1 = Person.class;
        System.out.println(cls1);
        //对象.getclass
        Person p = new Person();
        Class<? extends Person> personClass = p.getClass();
        System.out.println(cls == cls1);
        System.out.println(cls == personClass);
        Class c = Student.class;
        System.out.println(c == cls1);
    }
}
