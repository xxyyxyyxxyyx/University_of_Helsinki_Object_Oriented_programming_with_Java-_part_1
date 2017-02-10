
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String input = reader.nextLine();
        System.out.println("Length of the first part: ");
        int length = reader.nextInt();
        System.out.println("Result: "+input.substring(0,length));
    }
}
