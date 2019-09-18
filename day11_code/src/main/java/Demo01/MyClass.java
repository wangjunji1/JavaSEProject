package Demo01;

/**
 * 当final关键字来修饰一个类的进式
 * 格式：
 *      public final class 类名称{
 *
 *      }
 *  含义：当前这个类不能有任保子类（太监类）
 *  注意：一个类如果是final的，那么其中所有成员方法都无法进行覆盖重写
 */

public final class MyClass {
    public void method(){
        System.out.println("我是太监类");
    }
}
