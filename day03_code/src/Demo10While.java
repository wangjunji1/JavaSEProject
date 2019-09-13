/**
 * while 循环有一个标准格式，还有一个扩展格式
 * 标准格式：
 *  while(条件判断){
 *     循环条件
 *  }
 *
 *  扩展格式：
 *      初始化语句
 *    while(条件判断){
 *        循环体
 *        进步语句
 *    }
 */
public class Demo10While {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("我错啦"+i);
        }

        int i = 1;
        while (i<10){
            System.out.println("我错了"+i);
            i++;
        }
    }
}
