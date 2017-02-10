
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for(int i=0;i<array.length;i++){
                
                for(int j=0;j<array[i];j++){
                    System.out.print("*");
                }
                
                //printArray(array[i]);
                System.out.println();
        }
    }
    
//    public static void printArray(int number){
//        for(int i=0;i<number;i++){
//            System.out.print("*");
//        }
    }

