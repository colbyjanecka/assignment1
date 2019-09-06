/* Student Name: Colby Janecka,  Lab Section: Unique #16175 */

package assignment1;
import java.util.Scanner;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class Problem3 {

    public static void main(String[] args){

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a sentence to have its part-of-speech tagged: ");
        String userInput = inputScanner.nextLine();

        MaxentTagger tagger = new MaxentTagger("taggers/english-left3words-distsim.tagger");

        String taggedInput = tagger.tagString(userInput);

        System.out.println(taggedInput);


    }

}
