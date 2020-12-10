public class SumOfEvenDigits {
    public static void main(String[] args) {
        getEvenDigitSum(789486);
        getEvenDigitSum(123456789);
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            System.out.println("Negative");
            return -1;
        }
        int sum = 0;
        int rem;

        int og = number;

        while (number > 0) {
            rem = number % 10;
            if (rem % 2 == 0) {
                sum = sum + rem;
            }
            number = number / 10;

        }
        System.out.println("The sum of Even Digits in " + og + " = " + sum);
        return 1;
    }

}
