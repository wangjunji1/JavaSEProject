package recipe1_02;

class StaticDemo{
    public static boolean  oneValueForAllObjects = false;
}
public class StaticFiledsExamples {


    public static void main(String[] args) {
        StaticDemo sd1 = new StaticDemo();
        StaticDemo sd2 = new StaticDemo();
        System.out.println(sd1.oneValueForAllObjects);
        System.out.println(sd2.oneValueForAllObjects);
        sd1.oneValueForAllObjects=true;
        System.out.println(sd1.oneValueForAllObjects);
        System.out.println(sd2.oneValueForAllObjects);
    }
}
