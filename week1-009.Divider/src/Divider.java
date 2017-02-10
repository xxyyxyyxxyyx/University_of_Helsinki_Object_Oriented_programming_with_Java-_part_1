
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: ");
        double firstNumber = Double.parseDouble(reader.nextLine());
        System.out.println("Type another number: ");
        double secondNumber = Double.parseDouble(reader.nextLine());
        double result = firstNumber/secondNumber;
        System.out.println("Division: "+firstNumber+" / "+secondNumber+" = "+result);
    }
}
