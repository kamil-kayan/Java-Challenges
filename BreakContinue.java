package Section5_PartA;

public class BreakContinue {
    public static void main(String[] args) {
        int num = 23;
        while (num <= 40) {
            num++;

            if (num < 27) {
                System.out.println("Skipping numbers = " + num);
                continue;
            }
            System.out.println("number = " + num);
            if (num >= 30) {
                System.out.println("breaking at " + num);
                break;
            }
        }
    }
}
