
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
         while(true){
             System.out.print("name: ");
             String name = in.nextLine();
             if(name.isEmpty()){
                 break;
             }
             System.out.print("studentNumber: ");
             String number = in.nextLine();
             list.add(new Student(name,number));
             
         }
        
        for(Student students: list){
            System.out.println(students);
        }
        
        System.out.println("Give search term: ");
        String search = in.nextLine();
        System.out.println("Result: ");
        for(Student students : list){
          if (students.getName().contains(search)) {
               System.out.println(students);
            }
        
        }
    }
}