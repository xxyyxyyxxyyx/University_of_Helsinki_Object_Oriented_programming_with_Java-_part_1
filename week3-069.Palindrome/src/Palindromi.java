
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String reversed = reverse(text);
        if (reversed.equals(text)) {
            return true;
        }
        return false;
    }

    public static String reverse(String text) {
        String help = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            help = help + text.charAt(i);
        }
        return help;

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
