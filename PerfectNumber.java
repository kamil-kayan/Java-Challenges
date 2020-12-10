public class PerfectNumber {
    public static void main(String[] args) {
        isPerfectNumber(8);
        isPerfectNumber(6);
    }

    public static boolean isPerfectNumber(int a) {
        if (a < 0) {
            System.out.println("-1");
            return false;
        }
        int sum = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {

                sum = sum + i;
            }
            if (a == sum) {
                System.out.println(sum);
                return true;
            }
        }
        return false;
    }
}

//    public static boolean isPerfectNumber(int number) {
//        if (number < 1) {
//            return false;
//        }
//        int sum = 0;
//        for (int i = 1; i < number; i++) {
//            if (number % i == 0) {
//
//                sum += i;
//
//            }
//        }
//        if (number == sum) {
//            System.out.println(sum);
//            return true;
//        }
//        return false;
//    }

