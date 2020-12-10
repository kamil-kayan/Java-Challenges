public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(345670);
        numberToWords(1203);
        numberToWords(100);
        numberToWords(001);
        System.out.println(reverse(-121));
        System.out.println(getDigitsCount(134567800));

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        }

        int remainder;

        int cuseeb = reverse(number);

        int ze = getDigitsCount(number) - getDigitsCount(cuseeb);


        while (cuseeb > 0) {

            remainder = cuseeb % 10;

            /**Getting the last Digit and giving it its
             * corresponding word, i.e 0 will return
             * "ZERO" 1 will return "ONE"...*/
            switch (remainder) {
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
            }
            cuseeb = cuseeb / 10;
        }
        if (ze != 0) {
            for (int i = 0; i < ze; i++) {
                System.out.println("Zero");
            }
        }

    }

    /**
     * This Logic works but the numbers are Reversed i.e
     * 23 gives The O/P as "THREE TWO"
     */
    public static int reverse(int number) {
        if (number < 0) {
            int temp;
            int sum = 0;
            int num = number;
            while (num > 0) {
                temp = num % 10;
                sum = (sum * 10) + temp;//Reversing the int number first;
                num /= 10;
            }

            return num;

        }
        int temp;
        int sum = 0;
        while (number > 0) {
            temp = number % 10;
            sum = (sum * 10) + temp;//Reversing the int number first;
            number /= 10;
        }
//        System.out.println(sum);
        return sum;
    }

    /**
     * Writing another method that counts how many digits are there
     */

    public static int getDigitsCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        int remainder;
        while (number > 0) {
            remainder = number % 10;
            count += 1;
            number /= 10;
        }
        return count;
    }


}
