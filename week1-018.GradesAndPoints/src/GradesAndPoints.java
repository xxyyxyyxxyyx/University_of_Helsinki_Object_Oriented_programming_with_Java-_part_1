
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60] : ");
        int score = Integer.parseInt(reader.nextLine());
        if (score >= 50 && score <= 60) {
            System.out.println("Grade: " + 5);
        } else if (score >= 45 && score <= 49) {
            System.out.println("Grade: " + 4);
        }
        else if (score >= 40 && score <= 44) {
            System.out.println("Grade: " + 3);
        }
        else if (score >= 35 && score <= 39) {
            System.out.println("Grade: " + 2);
        }
        else if (score >= 30 && score <= 34) {
            System.out.println("Grade: " + 1);
        }
        else{
            System.out.println("Grade: failed");
        }
    }
}
