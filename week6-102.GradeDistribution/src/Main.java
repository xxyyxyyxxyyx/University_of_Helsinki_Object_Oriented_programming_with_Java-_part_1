import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    
       public static void main(String[] args) {
           Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
         
        // Your program should use only one Scanner object, i.e., it is allowed to call
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        GradeDistribution distribution = new GradeDistribution();
 
        System.out.println("Type exam scores, -1 completes: ");
        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku == -1) {
                break;
            }
 
            distribution.addAScore(luku);
        }
 
        distribution.tulosta();
       }
           
//        Scanner in = new Scanner(System.in);
//        ArrayList<Integer> scores = new ArrayList<Integer>();
//        
//        inputScores(in,scores);
//        gradeDistribution(scores);
//        acceptance(scores);
        
    
    
    public static void inputScores(Scanner scanner,ArrayList<Integer> score){
        System.out.println("Type exam scores, -1 completes: ");
        while(true){
           int input = scanner.nextInt();
           if (input==-1) break;
           if(input>=0 && input<=60){
           score.add(input);
           }
        }
        
    }
    
    public static void gradeDistribution(ArrayList<Integer> scores){
        System.out.println("Grade distribution: ");
        System.out.print("5: ");
        gradeToStars(50,60,scores);
        System.out.print("4: ");
        gradeToStars(45,49,scores);
        System.out.print("3: ");
        gradeToStars(40,44,scores);
        System.out.print("2: ");
        gradeToStars(35,39,scores);
        System.out.print("1: ");
        gradeToStars(30,34,scores);
        System.out.print("0: ");
        gradeToStars(0,29,scores);
       
    }
    
    public static void gradeToStars(int lower,int upper,ArrayList<Integer> scores){
         ArrayList<Integer> total = new ArrayList<Integer>();
        for(int score : scores){
             if (score >= lower && score <= upper) {
                 total.add(score);
        } 
            }
        for(int i=0;i<total.size();i++){
            System.out.print("*");
        }
        System.out.println();
    }
    
    public static void acceptance(ArrayList<Integer> score){
        ArrayList<Integer> accepted = new ArrayList<Integer>();
        for(int scores : score){
            if(scores>29){
                accepted.add(scores);
            }
        }
        
        double acceptedNumber = accepted.size();
        double allScores = score.size();
        
        System.out.println("Acceptance percentage: "+100*(acceptedNumber/allScores));
    }
}
