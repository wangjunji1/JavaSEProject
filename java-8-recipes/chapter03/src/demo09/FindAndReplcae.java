package demo09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAndReplcae {
    public static void main(String[] args) {
        findAndReplaceWithPatterns();
    }
    public static void findAndReplaceWithPatterns(){
        String str = "I love java 8,It is my favorite languae.java "+
                "8th version of this great programming language.";
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher);
        System.out.println(str);
        System.out.println(matcher.matches());
        System.out.println(matcher.replaceAll("7"));
    }
}
