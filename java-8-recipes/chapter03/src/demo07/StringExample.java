package demo07;

public class StringExample {
    public static void main(String[] args) {
        breakToChars();
    }

    public static void breakToChars(){
        String str = "Break down int chars";
        System.out.println(str);
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }

        for (int i = 0; i < str.length() - 1; i++) {
            System.out.println(str.charAt(i));
        }
    }
}
