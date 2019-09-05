/* Student Name: Colby Janecka,  Lab Section: Unique #16175 */

package assignment1;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) throws IOException {
        Scanner inputScanner = new Scanner(System.in);                          // Creates scanner for getting inputs

        System.out.print("Enter a number of adjacent digits to multiply: ");
        int digitAmount = inputScanner.nextInt();                              // Gets number of adjacent digits

        while (digitAmount > 20 || digitAmount < 2){                            // confirms that 2<=n<=20
            System.out.print("Range must be between 2 and 20: ");
            digitAmount = inputScanner.nextInt();
        }

        System.out.print("Enter string of 1000 digits: ");
        String inputString = inputScanner.next();                               // Gets string of 1000 digits

        while(inputString.length() != 1000){                                    // Confirms that s.length() = 1000
            System.out.print("Incorrect amount of digits : ");
            inputString = inputScanner.next();
        }
        BigInteger inputNumber = new BigInteger(inputString);                   // Creates BigInteger from input string

        int num = 0;
        int largest = 0;
        int currentTotal = 1;

        while(inputNumber.intValue() != 0){                                     // loop that runs till end of #

            BigInteger currentBigInt = inputNumber;

            currentTotal = 1;

            for(int i = digitAmount; i>0; i--) {                                // loop that runs n times
                num = currentBigInt.mod(BigInteger.valueOf(10)).intValue();     //   and multiplies n adjacent numbers
                currentTotal *= num;
                currentBigInt = currentBigInt.divide(BigInteger.valueOf(10));
            }

            if(currentTotal > largest){                                         // largest product is replaced
                largest = currentTotal;                                         //    if needed
            }

            inputNumber = inputNumber.divide(BigInteger.valueOf(10));           // truncate last digit off BigInteger
        }

        System.out.println("Largest digit: \n" + largest);                      // print and return result
    }
}
