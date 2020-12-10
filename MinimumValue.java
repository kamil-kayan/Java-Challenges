//import java.util.Arrays;
import java.util.Scanner;

public class MinimumValue {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many Elements? :");
        int count = sc.nextInt();
        sc.nextLine();

        int returnedArr[] = readInteger(count);

        int returnedMin = findMin(returnedArr);

        System.out.println("Min value = " + returnedMin);

    }

    public static int[] readInteger(int count) {

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number at "+i);
            int number = sc.nextInt();
            array[i] = number;
        }
        return array;
    }


    public static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < array.length) {
            int values = array[i];

            if (values < min) {
                min = values;
            }
            i++;
        }

        return min;
    }
}
