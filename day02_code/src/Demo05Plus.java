/**
 * 四则运算当中加号“+” 有常用的三种方法
 * 1.对数值来说就是加法
 * 2.对于char类型，在计算之前，char 会被提升为int,然后再计算
 * char 类型字符，和int 类型数字，之前的对照关系表，AscII,Unicode
 * 对于string类型，首字母大写，并不是关键字，来说，加号代表字符串连接操作
 * 任何数据类型和字符串进行连接的时候，结果都会变成字符串
 */
public class Demo05Plus {
    public static void main(String[] args) {
        //字符串类型的变量的基本使用
        //数据类型 变量名称=数据值。
        String str1 = "Hello";
        System.out.println(str1);
        System.out.println(str1+" world!");
        String str2 = "java";
        System.out.println(str2+20);
        //优先级问题
        //从左向右依次计算
        System.out.println(20+30+"java");
    }
}
