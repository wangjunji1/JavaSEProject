package demo;

import java.util.ArrayList;
import java.util.List;

public class Recip02_08 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        for(int x = 0;x<10;x++){
            myList.add("Test:"+x);
        }
        myList.stream().forEach((value)-> System.out.println(value));

    }
}
