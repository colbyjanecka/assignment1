/* Student Name: Colby Janecka,  Lab Section: Unique #16175 */

package assignment1;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){

        Scanner inputScanner = new Scanner(System.in);                          // Creates scanner for getting inputs

        System.out.print("Enter sentence less than 10^6 characters to check for $1.00 words! : ");
        String s = inputScanner.nextLine();

        if(s.length() >= 10000000) {
            System.out.print("Sentence must be less than 10^6 characters : ");
            s = inputScanner.nextLine();
        }


        String [] words = s.split(" ");
        String [] dollarWords = null;

        for (String word : words) {

            char [] chars = word.toLowerCase().toCharArray();

            int wordTotal = 0;
            for(char ch : chars){
                int chInt = ch;
                chInt -= 96;
                if((chInt > 1) && (chInt < 26)){
                    wordTotal += chInt;
                }
            }
            if(wordTotal == 100)
                System.out.println(word);

        }
    }
}
