/**
 * 比较运算符：
 *  大于： >
 *  小于： <
 *  大于等于： >=
 *  小于等于： <=
 *  相等： == 两个等号连写才是相等，一个等号代表是赋值
 *  不相等： !=
 *  注意事项:
 *      比较运算符的结果一定是一个boolean 值，成立是true,不成立是false
 *      如果进行多次判断，不能连着写
 *      数学当中的写法，例如：1《x<3
 *      程序中不允许连带
 *
 */
public class Demo08Operator {
    public static void main(String[] args) {
        System.out.println(10>5);
        int num1 = 10;
        int mum3 = 20;
        System.out.println(num1 < mum3);
        // 错误写法，编译报错，不能连着写System.out.println(1<x<3);;
    }
}
