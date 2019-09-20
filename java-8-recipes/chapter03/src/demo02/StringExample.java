package demo02;

public class StringExample {
    public static void main(String[] args) {
        compareString();
    }

    public static void compareString(){
        String one = "one";
        String two = "two";
        String var1 = "one";
        String var2 = "Two";
        String pieceone = "o";
        String piecetwo = "ne";
        if(one.equals(var1)){
            System.out.println("String one equals var1 using equals");
        }
        if(one.equals(two)){
            System.out.println("String one equals two using equals");
        }

        String sentence = "Java 8 is great";
        String matchStr = "great";
        for (int i = 0; i < sentence.length() - 1; i++) {
            if(sentence.regionMatches(i,matchStr,0,matchStr.length())){
                System.out.println("The sentence: "+sentence+ "matches"+matchStr+ "being at index"+ i);
            }

        }

    }
}
