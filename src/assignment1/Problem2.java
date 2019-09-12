/* Student Name: Colby Janecka,  Lab Section: Unique #16175 */

package assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static String[] problem2(String s){

        String [] words = s.split(" ");                     // split given string into array of words

        String [] dollarWords = new String [words.length];         // create new array to store dollar words
        int dollarWordsIndex = 0;

        for (String word : words) {                                // goes through each word in the input ...

            char [] chars = word.toLowerCase().toCharArray();      //  and creates an array of it

            int wordTotal = 0;
            for(char ch : chars){                                  // breaks that array into a array of chars
                int chInt = ch;
                chInt -= 96;                                       // gets value of character from ascii value
                if((chInt >= 1) && (chInt <= 26)){                 // does nothing for special characters
                    wordTotal += chInt;                            //   but adds value of alphabetic characters
                }
            }

            if(wordTotal == 100) {                                  // adds dollar words to array of results
                dollarWords[dollarWordsIndex] = word;
                dollarWordsIndex += 1;
                System.out.println(word);                           // and prints those to the console
            }

        }
        return(dollarWords);                                        //   as well as returns them.
    }
}
