//使用三元运算符和标准的if-else语句分别实现，两个数据当中的最大值
public class Demo06Max {
    public static void main(String[] args) {
        int a = 105;
        int b = 20;
        //首先使用三元运算符
        int max = a>b?a:b;
        System.out.println("最大值".concat(String.valueOf(max)));
        //今天 使用if 语句
        if(a>b){
            max = a;
        }else{
            max = b;
        }
        System.out.println("最大值"+max);
    }
}
