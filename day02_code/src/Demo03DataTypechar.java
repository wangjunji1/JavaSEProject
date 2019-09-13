/**
 * 数字和字符对照关系表（编码表）
 * AscII码表： American stadard code for informatin interchange 美国信息交换标准代码
 * Unicode码表：万国码，也是数字和符号的对照关系，开头部0-127和ASCII完全一样，但从128开如包含更多的字符
 *  48->'0'
 *  65->'A'
 *  97->'a'
 */
public class Demo03DataTypechar {
    public static void main(String[] args) {
        char zhifu='A';
        System.out.println(zhifu+0);

        char zhifu2 = 'A'; //底层其实保存是65数字
        char zhifu3 = 'c';
        //左侧是int 类型，右边是char类型
        //char --->int 确实是从小到大
        //发生了自动类型转换
        int num3 = zhifu3;

        System.out.println(num3);
        char zhifu4 = '骥';
        System.out.println(zhifu4+0);
    }
}
