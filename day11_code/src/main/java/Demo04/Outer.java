package Demo04;

/**
 * 如果一个类是定义在一个方法，那么这就是一个局部内部类
 * 局部，只有当前所属的方法才能，出了这个方法就不能用了
 * 定义格式
 *      修饰符 class 外部类名称
 *          修饰符 返回值类型 外部类方法名称（参数列表）{
 *              class 局部内部类名称{
 *
 *              }
 *          }
 */

/**
 * 小节一下类的权限修饰符
 *      public > protected > (default) >private
 *      定义一个类的时候，权限修饰符规则
 *      外部类 public /default
 *      成员内部类： public / protected / default / private
 *      局部内部类 ：什么都不写
 */

public class Outer {
    public void mehtodOuter(){
        class Inner{
            int num = 10;
            public void methodInner(){
                System.out.println(num);
            }
        }
    }

    Demo03.Outer.Inner inner = new Demo03.Outer.Inner();
}
