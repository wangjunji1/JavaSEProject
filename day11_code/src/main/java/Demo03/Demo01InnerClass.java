package Demo03;

/**
 * 如果一个事物内部包含 另一个事物，那么这就是一个类部包含一个类
 * 例如：身体和心脏的关系，又如：汽车和发动机的关系
 * 分类
 *  成员内部类
 *  局部内部类(包含匿名内部类)
 *  成员内部类的定义的格式：
 *
 */
public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();
        System.out.println("======================");
        Body.Heart heart = new Body().new Heart();
        heart.heart();
    }
}
