package Section5_PartA;

public class PrimeNumber {
    public static void main(String[] args) {
        isPrimer(75);
        isPrimer(89);
        isPrimer(23);
        isPrimer(1);

        int count = 0;
        for (int i = 20; i < 100; i++) {
            if (isPrimer(i)) {
                count++;
                System.out.println(i + " true");
            }
            if (count == 10) {
                System.out.println("Exiting for Loop");
                break;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrimer(int n) {
        if (n < 1) return false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n + " is Not A prime Number");
                return false;
            }
        }
        return true;
    }
}



