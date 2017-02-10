
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int in;
        int guess =1;
        while (true) {
            System.out.println("Guess a number: ");
            in = reader.nextInt();

            if (in > numberDrawn) {
                System.out.println("The number is lesser, guess made: "+guess);
            } else if (in < numberDrawn) {
                System.out.println("The number is greater, guess made: "+guess);
            } else {
                System.out.println("Congratulations, your guess is correct");
                break;
            }
            guess++;
        }
        

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
