package demo02;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatDouble {
    public static void main(String[] args) {
        formatDouble(3.14);
    }

    public static void formatDouble(double myDouble){
        NumberFormat numberFormat = new DecimalFormat("##.0000");
        String result = numberFormat.format(myDouble);
        System.out.println(result);
        NumberFormat format = NumberFormat.getInstance();
        String result2 = format.format(83.404);
        System.out.println(result2);
        result = NumberFormat.getInstance(Locale.ITALIAN).format(83.404);
        System.out.println(result);

        try {
            Number num = format.parse("75");
            System.out.println(num);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
