package BufferedReader;

import java.io.*;
import java.util.StringTokenizer;

public class LeapYearUsingBR {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Accepting Values from Keyboard;
        System.out.print("Please Enter a Leap year : ");

        //Reading the Inputs from Keyboard;
        String str = br.readLine();

        //Introducing String Tokenizer
        StringTokenizer st = new StringTokenizer(str,",");

        /*
        No need to break the String into Tokens as it is just a single integer Entry;
        But still...
                String s1 = st.nextToken();
        Converting String into the Correct data TYpe;
        */


        int leapYear = Integer.parseInt(st.nextToken());

        //Test and Printing out if its Leap year;
        if (leapYear % 100 == 0 && leapYear % 400 == 0){
            System.out.println(leapYear + " is Leap year");
        }
        if (leapYear % 100 != 0 && leapYear % 4 == 0){
            System.out.println(leapYear + " is Leap Year");
        }
        else {
            System.out.println(leapYear+ " Not a Leap Year");
        }

    }
}
