
import java.util.Arrays;
import java.util.Scanner;

 class SortedArray {
     public static Scanner sc = new Scanner(System.in);

     public static void main(String[] args) {
         System.out.print("How many Elements to sort? ");
         int n = sc.nextInt();
         System.out.println();

         int[] sorted = sortArray(getIntegers(n));

         printArray(sorted);

     }

     //Methods For accepting, sorting and displaying the array;

     public static int[] getIntegers(int n) {
         int[] arr = new int[n];

         System.out.println("Enter " + n + " number of Values: ");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }

//         System.out.println("Displaying Sorted array:");
//         sortArray(arr);
         return arr;
     }

     //Displaying Array
     public static void printArray(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
             System.out.println("Element at " + i + " is " + arr[i]);
         }
     }


     public static int[] sortArray(int[] arr) {

         //Copying the Array;
//         int[] sortedArray = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            sortedArray[i] = arr[i];
//        }
//             //Another way of Copying the Array

         int[] sortedArray = Arrays.copyOf(arr, arr.length);


         //Sorting the array;
         int temp;
         boolean isSorted = true;
         while (isSorted) {
             isSorted = false;
             for (int i = 0; i < sortedArray.length - 1; i++) {
                 if (arr[i] < arr[i + 1]) {
                     temp = arr[i];
                     arr[i] = arr[i + 1];
                     arr[i + 1] = temp;

                     isSorted = true;
                 }
             }

         }

         return sortedArray;
     }
 }


