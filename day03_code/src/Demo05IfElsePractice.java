public class Demo05IfElsePractice {
    public static void main(String[] args) {
        int socre = 80;
        if(socre >90 && socre<=100){
            System.out.println("优");
        }else if(socre >=80 && socre <=90){
            System.out.println("良");
        }else if(socre >=60 && socre <=80 ){
            System.out.println("及格");
        }else if(socre <=60){
            System.out.println("不及格");
        }else{
            System.out.println("数据错误");
        }
    }
}
