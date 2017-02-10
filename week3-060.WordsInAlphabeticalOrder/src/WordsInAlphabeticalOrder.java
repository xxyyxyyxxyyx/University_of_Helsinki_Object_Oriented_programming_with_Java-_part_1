
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String input;
        while(true){
            System.out.println("Type a word: ");
            input = reader.nextLine();
            
            if(input.isEmpty()){
                break;
            }
            words.add(input);
        }
        Collections.sort(words);
        System.out.println("You typed the following words: ");
        for(String word:words){
            System.out.println(word);
        }
    }
}
