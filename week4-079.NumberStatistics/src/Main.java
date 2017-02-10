import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     NumberStatistics stats = new NumberStatistics();
     NumberStatistics evenstats = new NumberStatistics();
     NumberStatistics oddstats = new NumberStatistics();
        System.out.println("Type numbers: ");
        int input = in.nextInt();
        while(!(input==-1)){
            stats.addNumber(input);
            if(input%2==0){
                evenstats.addNumber(input);
            }
            else{
                oddstats.addNumber(input);
            }
            input = in.nextInt();
        }
        System.out.println("sum: "+stats.sum());
        System.out.println("sum of even: "+evenstats.sum());
        System.out.println("sum of odd: "+oddstats.sum());
        
       
    }
}
