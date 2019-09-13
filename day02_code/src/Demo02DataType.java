/**
 * 强制类型转换
 *  1：特点，代码需要进行特殊的格式处理，不能自动完
 *  2：格式，范围小的类型，范围小的变量名-（范围小的类型） 原来的范围大的数据
 *  注意事项
 *      1.强制类型转换一般不推荐使用同，因为有可能发生精度损失，数据溢出
 *      2、byte/short/char这三种类型都可以发生数据发生数据运算，如“+”
 *      3、byte/short/char这三种类型在运算的时候，都会首先提升成为int类型，然后再计算
 *      4、boolean类型不能发生数据类型转换
 */
public class Demo02DataType {
    public static void main(String[] args) {
        //左边是int类型，右边是long类型，不一样
        //long-->int，不是从小到大的类型
        //不能发生自动类型转换
        //格式：范围小的变量名，=范围小的类型 原来范围小的数据
        int num = (int) 100L;
        System.out.println(num);
        //long 强制转换成int
        int num1 =(int) 600000000000L;
        System.out.println(num1);
        //double --> int 强制类型转换
        int num3 = (int ) 3.99;
        //并不是四舍五入，所有的小数位都会被舍弃
        System.out.println(num3);
        //字符常量发生运算
        char zhifu = 'A';
        //也就是大写字母当做数值来处理
        System.out.println(zhifu+1);
        //计算机的底层会用一个数字（二进制来代表）A就是65
        //一旦char类型进行数学运算，那么字符就会按照一定的规则翻译成一个数字
        //注意！右侧的数值大小不能超过左侧的类型范围
        byte num4 = 40;
        byte num5 = 50;
        //byte+byte = int +int ->int
        int real = num4+num5;
        System.out.println(real);
        short num6 = 60;
        //byte+short -->int + int -->int
        //强制转换short ,注意必须保证逻辑上事实大小来本来就没有超过short范围，否则会发生数据溢出
        short result2 = (short) (num4+num6);
        System.out.println(result2);

    }

}
