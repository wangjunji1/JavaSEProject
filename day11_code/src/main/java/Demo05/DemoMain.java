package Demo05;

/**
 如果接口的实现类（或者是父类的子类）只需要使用唯一的一次，
 那么这种情况下，就可以省略掉该类的定义，而改为使用匿名内部类
 匿名定义格式
 接品称
 */

public class DemoMain {
    public static void main(String[] args) {
        MyInterface objA = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类的实现了方法！1111~A");
            }

            @Override
            public void method2() {
                System.out.println("匿名内疗类的实现了方法！222~B");
            }
        };

        objA.method1();
        objA.method2();
        System.out.println("=================================");
    }
}
