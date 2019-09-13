/**
 * 在给变量进行赋值的时候，如果右侧的表达式中全都是常量，没有任何变量
 * 那么编译器javac将会直接将若干常量表达式计算得到结果
 *
 */
public class Demo13Notice {
    public static void main(String[] args) {
        short num1 = 10+3;
        System.out.println(num1);
        short a = 5;
        short b = 8;
        short c = (short) (a+b);
        short result2 = (short) (5+a+8);

    }

}
