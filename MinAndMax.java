import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        int max = 0;
//        int min = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

//        boolean first = true;

        while (true) {
            System.out.println("Enter a number");

            boolean hasNextInt = sc.hasNextInt();

            if (hasNextInt) {

//                int num = sc.nextInt();

//                if (first) {
//                    first = false;
//                    min = num;
//                    max = num;
//                }
                int num = sc.nextInt();
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
                sc.nextLine();
            } else {
                break;
            }
        }
        System.out.println("min = " + min + " max = " + max);
        sc.close();
    }

}

