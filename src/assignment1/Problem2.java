/* Student Name: Colby Janecka,  Lab Section: Unique #16175 */

package assignment1;
import java.util.Scanner;

public class Problem2 {
    public static void main(String args[]){

        Scanner inputScanner = new Scanner(System.in);                          // Creates scanner for getting inputs

        System.out.print("Enter sentence to check for $1.00 words! : ");
        String s = inputScanner.nextLine();

        String [] words = s.split(" ");

        for (String word : words) {

            char [] chars = word.toLowerCase().toCharArray();

            int wordTotal = 0;
            for(char ch : chars){
                int chInt = ch;
                chInt -= 96;
                if(chInt > 1 | chInt < 26){
                    wordTotal += chInt;
                }
                System.out.println(ch + " is worth " + chInt);
            }
            System.out.println(word + " is worth " + wordTotal);

        }
    }
}
