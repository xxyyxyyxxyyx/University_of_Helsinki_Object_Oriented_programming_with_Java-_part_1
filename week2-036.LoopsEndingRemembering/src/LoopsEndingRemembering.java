
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int input;
        int sum = 0;
        int count = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        while (true) {
            input = reader.nextInt();
            if (input == -1) {
                break;
            } else {
                sum += input;
                count++;
                if (input % 2 == 0) {
                    evenNumbers++;
                } else {
                    oddNumbers++;
                }

            }

        }
        double average = (double) (sum) / count;
        if(count==0){
        System.out.println("Thank you and see you later!");
        }
        else{
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
        }
    }
}
