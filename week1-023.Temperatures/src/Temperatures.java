
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Input a floating point number");
            double point = Double.parseDouble(reader.nextLine());
            if (point >= -30 && point <= 40) {
                Graph.addNumber(point);
            }
            
        }

    }
}
