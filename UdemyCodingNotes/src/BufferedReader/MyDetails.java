package BufferedReader;

import java.io.*;

public class MyDetails {
    public static void main(String[] args) throws IOException {

        //Creating Buffered Object;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        //Accepting String value;
        System.out.print("Enter Your Name ");
        String name = br.readLine();

        //Accepting Double value;
        System.out.print("High School Roll number? ");
        double roll = Double.parseDouble(br.readLine());

        //Accepting Char value
        System.out.print("KCSE Result? ");
        char grade = br.readLine().charAt(0);

        //Accepting Integer value;
        System.out.print("Your Age? ");
        int age = Integer.parseInt(br.readLine());

        //Printing all the Statements;
        System.out.println("Your Name is "+name);
        System.out.println("You're "+age+" Years Old");
        System.out.println("Your High School roll Number was "+roll);
        System.out.println("Your KCSE Result was "+grade+"-");

    }
}
