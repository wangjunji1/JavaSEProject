/**
 * 变量：程序运行期间，内容可以发生改变的量
 * 创建一个变量并且使用的格式
 * 数据类型 变量名称 //创建一个变量
 * 变量名称=数据值 //赋值，将右边的数据值，赋值交给左边的变量
 * 一步到位的格式
 * 变量名称=数据值
 */
public class Demo02Variable {
    public static void main(String[] args) {
        //创建一个变量
        //格式 变量类型 变量名称
        int num1;
        //向变量中存入一个数据
        num1 = 10;
        //当打印输出变量名称的时候,显示出来的是变量的内容
        System.out.println(num1);
        //改变变量当中本来的数字，变成新的数字
        num1 = 20;
        System.out.println(num1);
        //使用一步到位的格式定义变量
        //格式： 数据类型 变量名称=数据值
        int num2 = 25;
        System.out.println(num2);
        num2 = 35;
        System.out.println(num2);
        System.out.println("==================================");
        byte num3 = 30;//注意：右侧数值的范围不能超过左侧数据类型的取值范围
        System.out.println(num3);
        //注意　Byte.MAX_VALUE
        //注意： Byte.MIN_VALUE
        byte num4 = 40;
        short num5 = 50;
        System.out.println(num5);
        long num6 = 30000000000L;
        System.out.println(num6);
        float num7 = 2.5F;
        double num8 = 1.2;
        char zifui = '中';
        System.out.println(zifui);
        boolean var1 = true;
        System.out.println(var1);
        var1 =false;
        System.out.println(var1);
        boolean var2 = var1;
        System.out.println(var2);
    }
}
