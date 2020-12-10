import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        System.out.print("Enter 10 numbers: ");

        int sum = 0;
        int count = 0;
        while (count < 10) {
            count++;
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
//            System.out.println(a);
            System.out.println("The Sum of the 10 numbers = " + a);

        }

    }

//
//            boolean hasInt = sc.hasNextInt();
//
//            if (hasInt){
//                sum = sum + a;
//            }
//            else{
//                System.out.println("Invalid Values");
//            }
}
