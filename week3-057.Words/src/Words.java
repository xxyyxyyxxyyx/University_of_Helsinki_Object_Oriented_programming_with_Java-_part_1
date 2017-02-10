import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Type a word");
        String input = reader.nextLine();
        while(!input.equals("")){
               words.add(input);
                System.out.println("Type a word");
                input = reader.nextLine();
        }
        for(String word : words){
            System.out.println(word);
        }
    }
}
