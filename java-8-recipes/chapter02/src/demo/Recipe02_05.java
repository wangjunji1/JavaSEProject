package demo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Recipe02_05 {
    static LocalDate localDate = LocalDate.now();
    static LocalTime localTime = LocalTime.now();

    public static void main(String[] args) {
        System.out.println("Local date is "+localDate);
        System.out.println("Local Time is "+localTime);
    }
}
