/**
 * 另一种循环控制语句，是continue关键字
 * 一旦执行，立刻跳过当前次循环剩余内容，马上开始下一次循环
 */
public class Demo15Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==4){
                continue;
            }
            System.out.println(String.format("第%d循环",i));
        }
    }
}
