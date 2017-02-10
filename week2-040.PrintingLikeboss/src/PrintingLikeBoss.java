
public class PrintingLikeBoss {

 
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while(i<amount){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
     int i = 1;
     while(i<=size){
         printWhitespaces(size-i);
          printStars(i);
         i++;
     
     }   
    }

    public static void xmasTree(int height) {
       int i = 1;
      
       while(i<=height){
           printWhitespaces(height-i);
           printStars(i+(i-1));
           i++;
          
       }
       for(int j=0;j<2;j++){
           printWhitespaces(height-2);
           printStars(3);
           
       }
    }

    public static void main(String[] args) {
        xmasTree(16);
        
    }
}
