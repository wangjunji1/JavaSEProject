/**
 * 定义一个方法的格式：
 *  public staitc void 方法名称(){
 *      方法体
 *  }
 *
 *  方法名称的命名规则和变量一样，使用小驼峰
 *  方法体：也就是大括号当中可以包含任意条语句
 *  注意事项：
 *      方法定义的先后顺序无所谓
 *      方法的定义不能产生嵌套包含 关系
 *      方法定义好了之后，不会执行，如果要想执行，如果要想执行，定下进行方法的周
 *      如何调用方法，格式
 *
 *    方法名称（）：
 */
public class Demo11Method {
    public static void main(String[] args) {
//        farmer();
//        seller();
//        cooker();
//        me();

    processMan();

    }

    public static  void processMan(){
        farmer();
        seller();
        cooker();
        me();
    }
    //农民伯伯
    public static void farmer(){
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("施肥");
        System.out.println("除虫");
        System.out.println("收割");
    }

    //小商贩
    public static void seller(){
        System.out.println("运输到农贸市场");
        System.out.println("抬高价络");
        System.out.println("吆喝");
        System.out.println("卖给厨子");
    }

    //厨子
    public static void  cooker(){
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("半盘");
    }

    //我
    public static void me(){
        System.out.println("吃");
    }
}
