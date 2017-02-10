
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int input = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int input2 = Integer.parseInt(reader.nextLine());
        while(input<=input2){
            System.out.println(input);
            input++;
        }

    }
}
