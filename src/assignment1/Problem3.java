/* Student Name: Colby Janecka,  Lab Section: Unique #16175 */

package assignment1;
import java.util.Scanner;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class Problem3 {

    public static String problem3(String s){

        MaxentTagger tagger = new MaxentTagger("taggers/english-left3words-distsim.tagger");
                                                                        // Generate new tagger from stanford library
        String taggedInput = tagger.tagString(s).trim();                // tag and trim string provided

        System.out.println(taggedInput);                                // print string to console
        return(taggedInput);                                            //     and return it


    }

}
