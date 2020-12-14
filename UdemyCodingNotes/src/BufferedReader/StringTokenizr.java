package BufferedReader;

import java.io.*;
import java.util.StringTokenizer;
public class StringTokenizr {

    //String Tokenizer can Break down String entered in the S.O.P into Tokens;

    public static void main(String[] args) throws IOException {

        //Accepting data from Keyboard;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Receiving Several Inputs in one Line;
        System.out.println("Please Enter your name, age, salary: ");

        //Accepting the Inputs from Keyboard as a String;
        String str = br.readLine();

        //Introducing StringTokenizer and dividing string str into tokens using
        // "," delimeter;
        StringTokenizer st = new StringTokenizer(str,",");

        //Accepting 3 Tokens, first one = name, 2nd = age, 3rd = Salary;
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();

        //Trimming the tokens i.e removing Spaces in before and after;
        s1 = s1.trim();
        s2 = s2.trim();
        s3 = s3.trim();

        //Storing the corresponding data types with the tokens;
        String name = s1;
        int age = Integer.parseInt(s2);
        double salary = Double.parseDouble(s3);

        //Displaying The Entire Data;
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Salary = " + salary);

    }
}
