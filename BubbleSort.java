import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
    public static void main(CreatingStrings[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the amount of numbers to be displayed: ");
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int num[] = new int[n];

        //For Accepting Integer Elements into the Array;
        for (int i = 0; i < n; i++) {
            count++;
            System.out.println("Enter number " + count + ": ");
            num[i] = Integer.parseInt(br.readLine());

        }

        //Using Bubble Sort technique to sort the values;
        int limit = n - 1;

        boolean flag = false;//If true swapping is done;
        int temp = 0; //

        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit - 1; j++) {
                if (num[j] > num[j + 1]) {
                    flag = true;//true, swapping is done.

                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }

            if (!flag)//no swapping so come out.
                break;
            else flag = false;//passing the original true value;
        }
        System.out.println("The Sorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
    }
}
