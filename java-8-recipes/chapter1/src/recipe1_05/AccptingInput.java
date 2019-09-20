package recipe1_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AccptingInput {
    public static void main(String[] args) {
        BufferedReader readIn = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String numberAsString = "";
        long nubmerAsLong = 0;
        boolean numberIsVaild = false;
        do{
            System.out.println("please enter a number:");
            try {
                numberAsString = readIn.readLine();
                System.out.println("You entered "+numberAsString);
            } catch (IOException e) {
                System.out.println(e);
            }

            try {
                nubmerAsLong = Long.parseLong(readIn.readLine());
                numberIsVaild = true;
            } catch (IOException e) {
                e.printStackTrace();
            }


        }while (numberIsVaild == false);

    }
}
