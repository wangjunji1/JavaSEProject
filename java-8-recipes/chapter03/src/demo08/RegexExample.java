package demo08;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        finaMatches();
        patternAndMatches();
    }

    public static void finaMatches(){
        String str = "Here is a long String...let's find a match";
        boolean result = str.matches("Here is a long String...let's find a match");
        System.out.println(result);

        result = str.matches("Here is a long String");
        System.out.println(result);
        str = "true";
        result = str.matches("[Tt]rue");
        System.out.println(result);
        result = str.matches("[Tt]rue|[Ff]alse");
        System.out.println(result);
        str = "I love Java 8!";
        result = str.matches("I love Java [0-9]!");
        System.out.println(result);
        str = "I love Java 7!";
        result = str.matches("I love Java [0-9]!");
        System.out.println(result);
        result = str.matches("I love.*[0-9]!");
        System.out.println(result);
        str = "I love Jython 2.5.4!";
        result = str.matches("I love .*[ 0-9]!");

        System.out.println(result);

    }

    public static void patternAndMatches(){
        String str = "I love Java 8!";
        boolean result ;
        Pattern pattern = Pattern.compile("I love Java [0-9]!");
        Matcher matcher = pattern.matcher(str);
        result = matcher.matches();
        System.out.println(result);
    }
}
