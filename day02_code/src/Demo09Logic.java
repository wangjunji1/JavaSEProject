/**
 * 与 并且 && 全都是true 才是true ,否则就是false
 * 或  或者 || 到少是一个true 就是true,全部是false 才是false
 * 非（取反） 本是true变成false本来是false，变成true
 * 与 && || 具有短路效果，如果根据左边已经可以判断得到最终结果，那么右边的代码将不再执行
 * 从而节省一定的性能
 * 注意事项：
 *      逻辑运算只能用于boolean值
 *      与或需要左右各自有一个boolean 值 ，但是取反只要唯一的一个boolean 值即可
 *      与或两种运逄，如果有多个条件，可以连接写
 *      两个条件，条件A&& 条件B
 *
 */
public class Demo09Logic {
    public static void main(String[] args) {
        System.out.println(true&&false); //true
        System.out.println(3<4&& 10>5);//true
        System.out.println("===================");
        System.out.println(true||false); //true
        System.out.println(true||true);
        System.out.println(false||false);
        System.out.println(true);
        System.out.println(!true);

        int a = 10;
        //短路，之前提false则使用后面的
        System.out.println(3>4 && ++a<100);
        System.out.println(a);
        System.out.println("========================");

        int b = 20;
        //短路，之前是true,后面的就不运逄
        System.out.println(2<4 ||++b<100);
        System.out.println(b);

    }

}
