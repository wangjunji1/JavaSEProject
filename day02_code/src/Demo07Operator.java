/**
 *赋值运算符分为：
 *  基本运算符，就是一个符号“=”，代表将右侧的数据交给左侧的变量
 *  int a = 30;
 *  复合赋值运算符
 *      += a+=3 相当于 a=a+3
 *      -= a-=3 相当于 a=a-3;
 *      *= a*=3 相当于 a=a*3;
 *      /= d/=6 相当于 d=d/6
 *      %= d%=7 相当于 d=d%7
 *   注意事项：
 *      只有变量才能使用赋值运算符，常量不能进行赋值
 *      复合赋值运算符其中隐含了一个强制类型转换
 */
public class Demo07Operator {
    public static void main(String[] args) {
        int a = 10;
        //按照公式进行翻译
        //a=a+5;
        a=a+5;
        System.out.println(a);


    }
}
