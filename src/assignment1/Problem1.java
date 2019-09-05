package assignment1;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) throws IOException {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a number of adjacent digits to multiply: ");
        int digitAmount = inputScanner.nextInt();

        while (digitAmount > 20 || digitAmount < 2){
            System.out.print("Range must be between 2 and 20: ");
            digitAmount = inputScanner.nextInt();
        }

        System.out.print("Enter string of 1000 digits: ");
        String inputString = inputScanner.next();

        while(inputString.length() != 1000){
            System.out.print("Incorrect amount of digits : ");
            inputString = inputScanner.next();
        }
        BigInteger inputNumber = new BigInteger(inputString);

        int num = 0;
        int largest = 0;
        int currentTotal = 1;

        while(inputNumber.intValue() != 0){

            BigInteger currentBigInt = inputNumber;

            currentTotal = 1;

            for(int i = digitAmount; i>0; i--) {
                num = currentBigInt.mod(BigInteger.valueOf(10)).intValue();
                currentTotal *= num;
                currentBigInt = currentBigInt.divide(BigInteger.valueOf(10));
            }

            if(currentTotal > largest){
                largest = currentTotal;
            }

            inputNumber = inputNumber.divide(BigInteger.valueOf(10));
        }

        System.out.println("Largest digit: \n" + largest);
    }
}
