
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
       // Here you can test binary search
        int[] array = {  2, 9 };
        Scanner reader = new Scanner(System.in);

        System.out.print("Values of the array: " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
        
        if(result==true){
                System.out.println("Value "+searchedValue+" is in the array");
        }
        else{
            System.out.println("Value "+searchedValue+" is not in the array");
        }
    }
}
