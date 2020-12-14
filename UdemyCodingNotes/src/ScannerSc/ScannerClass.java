package ScannerSc;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) throws IOException {

        for (int i = 1; i <= 3; i++) {//All our Ages(Moha, Deka, Kamil and Badri).
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Year of Birth: ");

            boolean hasNextInt = sc.hasNextInt();
            if (hasNextInt) {
                int yearOfBirth = sc.nextInt();
                int age = 2020 - yearOfBirth;
                sc.nextLine();

                if (age >= 0 && age <= 100) {
                    System.out.println("Enter Your Name: ");
                    String name = sc.nextLine();
                    System.out.println(name + " You're " + age + " years old.");
                } else {
                    System.out.println("Invalid Year of birth");
                    break;
                }
            } else {
                System.out.println("Not an Integer");
            }
        }

//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter Year of Birth: ");
//        int yearOfBirth = Integer.parseInt(br.readLine());
//        int age = (2020 - yearOfBirth);
//
//        System.out.println("Enter your Name: ");
//        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
//        String magac = br2.readLine();
//        System.out.println(magac+ " You're "+age+" years old.");
//    }

    }
}
