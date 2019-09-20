package demo03;

public class StringExample {
    public static void main(String[] args) {
        trimString();
    }

    public static void trimString(){
        String myString = " This is  a string that contains withsapce.   ";
        System.out.println(myString);
        System.out.println(myString.trim());
    }
}
