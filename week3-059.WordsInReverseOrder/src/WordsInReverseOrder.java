import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String input;
        while(true){
            System.out.println("Type a word: ");
            input = reader.nextLine();
            if(input.equals("")){
            break;
            }
            else{
            words.add(input);
            }
        }
        Collections.reverse(words);
        System.out.println("You typed the following words: ");
        for(String word:words){
            System.out.println(word);
        }
        
    }
}
