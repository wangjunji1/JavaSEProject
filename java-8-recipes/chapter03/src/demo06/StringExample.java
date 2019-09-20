package demo06;

public class StringExample {
    public static void main(String[] args) {
        StringsToNumbers();
        StringsToNumbersParseInt();
    }

    public static void StringsToNumbers(){
        String one = "1";
        String two = "2";
        int rsult = Integer.valueOf(one)+Integer.valueOf(two);
        System.out.println(rsult);
    }

    public static void StringsToNumbersParseInt(){
        String one = "1";
        String two = "2";
        int rsult = Integer.parseInt(one)+Integer.parseInt(two);
        System.out.println(rsult);
    }

}
