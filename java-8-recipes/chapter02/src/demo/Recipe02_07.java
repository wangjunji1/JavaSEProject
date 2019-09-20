package demo;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.time.LocalDate;
import java.time.LocalTime;

public class Recipe02_07 {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        LocalDate datePlustDays = myDate.plusDays(15);
        System.out.println("Today plus 15 Days"+datePlustDays);
        LocalDate datePlusWeekes = myDate.plusWeeks(8);
        System.out.println("Today plus 8 weeks"+datePlusWeekes);
        LocalTime myTimePlusHours = myTime.plusHours(5);
        LocalTime timeMinusMin = myTime.minusMinutes(30);
        System.out.println("Time Plus 5 Hours"+myTimePlusHours);
        System.out.println("Time Minus 30 Minuste"+timeMinusMin);
    }
}
