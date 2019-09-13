/**
 * 自增运算符：++
 * 自减运算符：--
 * 基本含义：让一个变量变成数字1，或者让一个变量降一个数字1
 * 使用格式：写在变量名称之前，或者写到变量名称这后，例如++num,也可以num++;
 * 使用方式：
 *      1.单独使用的时候，前++和后++没有区别，也就是++num和num++;是完全一样的
 *      在混合的时候，有重大区别，
 *          A：如果是前++，那么变量立马+1然后拿着结果进行使用 【先加后用】
 *          B:如果是后++，那么首先使用变量本来的数据【然后再让变量+1】 【先用先加】
  */
public class Demo06Operator {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        ++num;
        System.out.println(num);
        System.out.println(num++);
        System.out.println(++num);
        //打印操作混合使用
        int num2=10;
        System.out.println(++num2); //11
        System.out.println(num2);
        System.out.println("=====================");
        System.out.println(num2++); //打印11
        System.out.println(num2); //打印13
        //赋值操作混合
        int num4 = 10;
        int result1 = --num4;
        System.out.println(result1); //打印9

        int num5 = 10;
        int result2 = num5--;
        System.out.println(num5);
        System.out.println(result2);

        int x = 10;
        int y = 20;
        int result3 = ++x+y--;//打印结果11+20=31
        System.out.println(result3);


    }
}
