package demo;



public class SortUtility {

    
    public static void quickSort(int[] array, int start, int end) {
        
        // Base case :
        if (start >= end) return;

        
        
        // Partition the array and place the pivot in its correct index :
        int indexOfPivot = partition(array , start , end);

        
        
        // Recursively sort elements before and after the pivot :
        quickSort(array , start , indexOfPivot-1); // Left
        quickSort(array , indexOfPivot+1 , end);   // Right
    }


    
    private static int partition(int[] array , int start , int end) {
        int pivot = array[end]; // Last element is pivot. now we are trying to find its index...
        int i = start-1;      // i statrs from one left of array. 

   
        
        
        // set the right and left side of pivot :
        for (int j = start ; j < end ; j++) {
            if (array[j] <= pivot) {
                i++;  

                //Swap
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;

        
        
        // Place the pivot in its correct index :
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}