/* Student Name: Colby Janecka,  Lab Section: Unique #16175 */

package assignment1;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem1 {

    public static int problem1(int n, String s){

        BigInteger inputNumber = new BigInteger(s);                             // make input names reader-friendly
        int digitAmount = n;
        int num;
        int largest = 0;
        int currentTotal;

        while(inputNumber.intValue() != 0){                                     // loop that runs till end of #

            BigInteger currentBigInt = inputNumber;

            currentTotal = 1;

            for(int i = digitAmount; i>0; i--) {                                // loop that runs n times
                num = currentBigInt.mod(BigInteger.valueOf(10)).intValue();     //   and multiplies n adjacent numbers
                if(num != 0) {
                    currentTotal *= num;
                    currentBigInt = currentBigInt.divide(BigInteger.valueOf(10));
                } else {
                    i = 0;
                }

            }

            if(currentTotal > largest){                                         // largest product is replaced
                largest = currentTotal;                                         //    if needed
            }

            inputNumber = inputNumber.divide(BigInteger.valueOf(10));           // truncate last digit off BigInteger
        }
        System.out.println(largest);
        return(largest);
    }
}
