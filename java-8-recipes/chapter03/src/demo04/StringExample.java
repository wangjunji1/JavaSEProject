package demo04;

import java.util.Locale;

public class StringExample {
    public static void main(String[] args) {
        changeCase();
    }

    public static void changeCase(){
        String str = "This String will change case.";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.toLowerCase(Locale.ITALIAN));
        System.out.println(str.toUpperCase(new Locale("it","US")));
        System.out.println(str.toLowerCase(new Locale("fr","CA")));
    }
}
