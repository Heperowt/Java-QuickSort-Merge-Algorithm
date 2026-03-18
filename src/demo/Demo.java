package demo;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Define two arrays with a max numbers 50 :
        int[] arr1 = new int[50];
        int[] arr2 = new int[50];
        int size1 = 0 , size2 = 0;

        
        
        //Recive inputs and check if entered -1 or reached max size of 50 :
        System.out.println("Enter numbers for the first array (type -1 to stop):");
        while (true) {
            int input = scanner.nextInt();
            if ((input == -1) || (size1 >= 50)) break;
            arr1[size1++] = input;
        }

        
        
        System.out.println("Enter numbers for the second array (type -1 to stop):");
        while (true) {
            int input = scanner.nextInt();
            if ((input == -1) || (size2 >= 50)) break; 
            arr2[size2++] = input;
        }


        
        //Fix array sizes
        int[] fixedArray1 = new int[size1];
        for (int i = 0 ; i < size1 ; i++) {
            fixedArray1[i] = arr1[i];
        }

        int[] fixedArray2 = new int[size2];
        for (int i = 0 ; i < size2 ; i++) {
            fixedArray2[i] = arr2[i];
        }


        
        // Sort and merge : 
        SortUtility.quickSort(fixedArray1 , 0, fixedArray1.length - 1);
        SortUtility.quickSort(fixedArray2 , 0, fixedArray2.length - 1);

        int[] mergedArray = MergeUtility.merge(fixedArray1 , fixedArray2);

        

        
        // Print the resault :
        System.out.println("Merged and sorted form of two arrays you entered :");
        for (int value: mergedArray) {
            System.out.print(value + " ");
        }
    }
}
