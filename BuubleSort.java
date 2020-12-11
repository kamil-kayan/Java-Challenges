//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class BuubleSort {
    public static void main(CreatingStrings[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        System.out.println("How Many elements? :");
        int n = sc.nextInt();//Accepting n number of elements;

        int count = 1;//My personal count;
        int[] arr = new int[n];//Creating a new array;
        for (int i = 0; i < n; i++){

            System.out.println("enter number :"+count);
             arr[i] = sc.nextInt();//accepting array values;

             count ++;
        }
        //Using Bubble sort;


        boolean flag = false;
        int temp;//For Swapping the Values;

        for (int i = 0; i < n -1; i++){
            for(int j =0; j < n -1 ; j++){
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    flag = true;//Swapping is done;'

                }
            }
            if (!flag) break;
//            else flag = true;
        }
        System.out.println("The sorted Values are: ");
        for(int i =0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
