package Demo01;

/**
 * final关键字代表最终，不可改变的
 * 常见四种用法
 * 可以用来修饰一个类
 * 可以用来修饰一个方法
 * 还可以用来修饰一个局部变量
 * 还可以用来修饰一个成员变量
 */

public class Demo01Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);
        //一旦使用final用来修饰局部变量，那么这个变量就不能进行更改
        final int num2 = 200;
        System.out.println(num2);

        final int num3;
        num3 = 30;

        //对于基本类型来说，不可变说的变量当中的数据不可改变
        //对于引用类型来说，不可变说的变量当地址不可改变
        Student stu1 = new Student("赵丽颖");
        System.out.println(stu1);

        final  Student stu2 = new Student("高圆圆");
        System.out.println(stu2);
        stu2.setName("赵又延");
        System.out.println(stu2.getName());
        System.out.println(stu2);

    }
}
