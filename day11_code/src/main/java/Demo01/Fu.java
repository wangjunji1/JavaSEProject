package Demo01;

/**
 * 当final 关键字用来修饰一个方法的时候，这个方法就是终终方法，也就是不能覆盖重写
 * 格式：
 *      修饰符 final 返回值类型 方法名称（参数列表）{
 *          方法体
 *      }
 *      注意事项
 *      对于类，对于方法来说，abstract关键字，和final 关键字不能同时使用，因为矛盾
 */
public abstract class Fu {
    public final void method(){
        System.out.println("父类方法执行！");
    }
    public abstract void methodAbs();

}
