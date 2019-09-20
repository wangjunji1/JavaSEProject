package recipe1_05;

import java.math.BigInteger;

public class JavaDocExample {
    public static BigInteger addNumbers(BigInteger[] nums){
        BigInteger result = new BigInteger("0");
        for (BigInteger num : nums) {
            result = result.add(num);
        }
        return result;
    }

    public static void main(String[] args) {
        BigInteger[] someValues = {BigInteger.ONE,BigInteger.TEN};
        System.out.println(addNumbers(someValues));
    }
}
