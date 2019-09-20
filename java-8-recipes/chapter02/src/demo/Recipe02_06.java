package demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Recipe02_06 {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate yearStart = LocalDate.parse("01/01/2014",formatter);
        System.out.println("Beginning of year "+yearStart);
    }

}
