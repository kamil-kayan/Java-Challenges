package Section5_PartA;

public class FirstLastDigitSum {
    public static void main(String[] args) {

        sumFirstAndLastDigit(566787);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(235);
        sumFirstAndLastDigit(11);
        sumFirstAndLastDigit(12);
        sumFirstAndLastDigit(234567890);
        sumFirstAndLastDigit(121);


    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        if (number < 10) {
            int sum = number + number;
            System.out.println(sum);
            return sum;
        }

        if (number == 0) {
            System.out.println(number);
            return 0;
        }

        int lastDigit = number % 10;

        while (number >= 10) {
            number /= 10;
        }

        int firstDigit = number;
        int sum = firstDigit + (lastDigit);

        System.out.println(sum);
        return 1;

    }

    /*ALTERNATIVE CODE

    *
    public class Section5Challenges.FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int lastNumber = number % 10;
        int sum = 0;
        int firstNumber = number;
        if (firstNumber < 0) {
            return -1;
        } else if (firstNumber == 0) {
            return firstNumber;
        }
        while (firstNumber >= 10) {
            firstNumber /=   10;

        }
        return sum = lastNumber + firstNumber;
        }

    */

}