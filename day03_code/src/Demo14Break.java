/**
 * break关键字的用法常见有两种
 * 可以使用在switch语句当中，一旦执行，整个Switch语句立即结束。
 * 还可以用在循环语句当中，一旦执行，整个循环语句立该结束，打断循环
 * 关于循环的选择，有一个小建议
 * 凡是次数确定的场景使用for,否则都用while
 */

public class Demo14Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==4){
                System.out.println("跳出循环");
                break;
            }
            System.out.println("Hello"+i);
        }
    }
}
