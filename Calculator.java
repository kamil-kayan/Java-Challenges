import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        inputSumAndAvg();
    }

    public static void inputSumAndAvg() {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 0;

        while (true) {

            boolean hasInt = sc.hasNextInt();

            if (hasInt) {
                int num = sc.nextInt();
                sum += num;

                sc.nextLine();
            } else {
                break;
            }
            count++;
        }
        average = sum / count;
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}

