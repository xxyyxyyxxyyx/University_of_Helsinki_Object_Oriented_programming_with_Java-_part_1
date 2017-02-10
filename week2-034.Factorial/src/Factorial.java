import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int input = Integer.parseInt(reader.nextLine());
         
        int factorial = 1;
        while(input>0){
        factorial *= input;
        input--;
        }
        System.out.println("Factorial is "+factorial);
    }
}
