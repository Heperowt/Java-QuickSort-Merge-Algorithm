package demo;



public class MergeUtility {

    public static int[] merge(int[] arr1 , int[] arr2) {
        int[] mergedArr=new int[arr1.length+arr2.length];//Create biggest possible array(consider there is no same number in arr1 and arr2)
        int i=0 , j=0 , k=0 ; //these will be indexes...

      
        // Comparing numbers and merge them to mergedArr : 
        while ((i < arr1.length) && (j < arr2.length)) {
            if (arr1[i] < arr2[j]) {
                mergedArr[k++]= arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                mergedArr[k++]= arr2[j++];
            } else {
                // If numbers being compared are equal , add one of them : 
                mergedArr[k++] = arr1[i++];
                j++;
            }
        }
        
       

        // maybe arr1 and arr2 had big numbers so they may have numbers remaining that have not added to mergedArr yet : 
        while (i < arr1.length) {
            mergedArr[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArr[k++] = arr2[j++];
        }
        
        


        // delete unused parts of our mergedArr : 
        int[] result = new int[k];
        int x = 0; // Counter
        for (int value : mergedArr) {
            if (x >= k) break;
            result[x] = value;
            x++;
        }

        return result;
        
    }
}
