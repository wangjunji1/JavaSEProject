/**
 * 对于byte/short/char三种类型来说，如果右侧赋值没有超过赋值
 * 那么javac 编辑器将会自动隐藏含为我们补上byte short char
 * 如果没有超过左侧的范围，编译器补上强转
 * 如果右侧超过左侧范那么编译器报错
 */
public class Demo12Notice {
    public static void main(String[] args) {
        //右侧定实是一个int数字，但是没有超过左侧的范围，就是正确的
        // int -> byte 不是自动类型转换
        byte num1 = 10;
        byte num2 = (byte) 128;

        char zifu = '骥';
        System.out.println(zifu+0);
        char zifu1 = 39589;
        System.out.println(zifu1);
    }
}
