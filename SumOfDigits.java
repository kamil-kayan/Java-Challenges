package Section5_PartA;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(8));
    }

    private static int sumDigits(int number) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your desired number: ");
        number = in.nextInt();

        if (number < 10) {
            System.out.println("Invalid");
            return -1;
        }
        int remainder;
        int sum = 0;
        System.out.print("The sum of digits of the number " + number + " is ");
        while (number > 0) {
            remainder = number % 10;
            sum += remainder;
            number /= 10;
        }
        System.out.println(" are " + sum);

        return sum;
    }
}