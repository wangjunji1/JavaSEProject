/**
 * switch语句使用的注意事项：
 *  1，多个case后面的数值不可重复
 *  2.switch后面的小括号当中只能是下列数据类型：
 *      基本数据类型： byte/short、char int
 *      引用数据类型，string 字符串， enum枚举
 *   3.switch句格式可以很灵活，前后顺序可以颠倒，而且Break还可以省略
 *   匹配一个case 就从哪一个位置向下执行，直接遇到break或整体结束为止
 */
public class Demo08SwitchNotice {
    public static void main(String[] args) {
        int num = 2;
        switch (num ){
            case 1:
                System.out.println("你好");
            case 2:
                System.out.println("我好");
            case 3:
                System.out.println("大家好");
             default:
                 System.out.println("你好，我也好！");
                 break;
        }
    }
}
