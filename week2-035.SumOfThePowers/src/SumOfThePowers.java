
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int input = Integer.parseInt(reader.nextLine());
        int guard = 1;
        int result = 1;
        while(guard<=input){
        int number = (int)(Math.pow(2, input));
        result +=number;
        input--;
        }
        System.out.println("The result is "+result);
    }
}
