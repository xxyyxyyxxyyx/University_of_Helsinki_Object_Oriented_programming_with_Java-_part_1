public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginningIndex = 0;
        int endIndex = array.length - 1;

        while (beginningIndex <= endIndex) {
            
            int middleIndex = (beginningIndex + endIndex) / 2;
            
            if (array[middleIndex] == searchedValue) {
                return true;
            }
            else{
                if(array[middleIndex]>searchedValue){
                    endIndex = middleIndex;
                    middleIndex = (beginningIndex+endIndex)/2;
                }
                if(array[middleIndex]<searchedValue){
                    beginningIndex = middleIndex+1;
                    middleIndex = (beginningIndex+endIndex)/2;
                }
                
            }

        }
        return false;
    }
}
