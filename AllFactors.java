public class AllFactors {
    public static void main(String[] args) {
        printFactor(6);
        printFactor(9);
        printFactor(10);
    }

    public static void printFactor(int a) {
        if (a < 0) {
            System.out.println("invalid");
        }
        int factor = 1;
        while (factor <= a) {
            if (a % factor == 0) {
                System.out.print("The Number factor of " + a + " is " + factor + ", ");
                System.out.println(" ");
//            }
            }
            factor++;
        }
    }
}
