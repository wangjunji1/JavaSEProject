/**
 * 使用变量的时候，有一些注意事项
 * 1.如果创建多个变量，那么变量之间的名称不可以重复
 * 如果使用byte或者short类型的变量，那么右侧的数据值不能超过左侧类型的范围
 * 没有进行赋值的变量，不能直接使用，一定要赋值之后，才能使用
 * 变量使用不能超过作用域的范围
 * 【作用域】：从定义变理的一行开始，一直到直接所属的大括号结束为止
 * 6.可以通过一个语句来创建多个变量，但是一般情况下不推荐这么写。
 */

public class Demo03VariableNotice {
    //类中静态方法，属于类方法
    static  {
        int num1 = 101110;
        System.out.println(num1);
    }

    public static void main(String[] args) {
        int num1 = 10;//创建一个新的变量，名叫num1
        //又创建一个变量名叫变量 int num1 = 20;错误
        int num2 = 20;
        int num3 ;
        int num4 ;//定义一个变量，但是没有进行赋值
        //System.out.println(num4);  直接使用打印输出就是错误的
        // System.out.println(num5); 不能在定义之前使用这个变量
        int num5 = 500;
        System.out.println(num5);
        //方法块
        {
            int num6 = 60;
            System.out.println(num6);
        }

        //int num6;
        //如果超过方式块的围，则变量不能再被使用
        //System.out.println(num6);
        //同时创建三个全都是int类型的变量
        int a,b,c;
        a = 10;
        b = 30;
        c = 40;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //同时创建三个int变量，并且同时各自赋值
        int x=100,y=200,z=300;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
