/**
 * do while 循环的标准格式
 * do{
 *     循环体
 * }while(判断语句)
 *
 * 初始化语句
 * do{
 *     循环体;
 *     步进语句
 * }while(条件语句)
 */
public class Demo11DoWhile {
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.println("请原谅我吧"+i);
            i++;
        }while (i<10);

    }
}
