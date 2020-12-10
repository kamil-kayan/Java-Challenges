public class SharedDigits {
    public static void main(String[] args) {
        hasSharedDigits(57, 87);
    }

    public static boolean hasSharedDigits(int k, int m) {
        if ((k < 10 || k > 99) || (m < 10 || m > 99)) {
            return false;
        }

        int lastDigitK = k % 10;
        int firstDigitK = k / 10;

        int fistDigitM = m / 10;
        int lastDigitM = m % 10;

        if ((lastDigitK == lastDigitM) || (lastDigitK == fistDigitM)
                || (firstDigitK == lastDigitM || firstDigitK == fistDigitM)) {
            System.out.println("true");
            return true;
        }
        return false;
    }
}




