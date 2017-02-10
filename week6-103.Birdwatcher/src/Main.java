
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bird newBird = new Bird();

        while (true) {

            System.out.print(" ? ");
            String input = in.nextLine();
            

            if (input.contains("Add")) {

                newBird.addBird(in);

            }
            if (input.contains("Statistics")) {
                newBird.statistics();
            }

            if (input.contains("Observation")) {
                newBird.observation(in);
            }
            
            if(input.contains("Show")){
                newBird.show(in);
            }
            if(input.contains("Quit")){
                break;
            }
           
        }

    }

}
