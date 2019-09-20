package demo05;

public class StringExample {
    public static void main(String[] args) {
        concatExample();
        concatOperatorExample();
        stringBufferExample();
    }

    public static void concatExample() {
        String one = "Hello";
        String two = "Java8";
        String result = one.concat(two);
        System.out.println(result);
    }

    public static void concatOperatorExample(){
        String one = "Hello ";
        String two = "java8";
        String result = one + "" + two;
        System.out.println(result);
    }

    public static void stringBufferExample(){
        String one = "Hello";
        String two = "java8";
        StringBuilder result = new StringBuilder();
        result.append(one).append(two);
        System.out.println(result);
    }
}
