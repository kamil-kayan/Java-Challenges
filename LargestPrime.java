public class LargestPrime {
    public static void main(String[] args) {
        getLargestPrime(45);
    }

    public static void getLargestPrime(int number) {
        if (number < 0) {
            return;
        }
        int firstPrime;
        int i = 2;


        for (; i < number; i++) {
            for (firstPrime = 2; firstPrime < number; firstPrime++) {
                if (i * firstPrime == number) {
//                    System.err.println(i);
//                    if (i > firstPrime) {
//                        System.out.println("The Largest prime = " + i);
                    if (firstPrime > i) {
                        System.out.println(firstPrime);
                    }
                }
            }
        }
    }
}

