package BufferedReader;

import java.io.*;
import java.util.StringTokenizer;

public class Fibonacci {

    public static void main(String[] args) throws IOException{

        //Getting input from Keyboard;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the Range of Fibonacci: ");

        //Accepting the String and converting it into integer;
        int range = Integer.parseInt(br.readLine());
        /*
        The O/P should be 0,1,1,2,3,5,8,13,21,34,55....
        let the first two numbers be, f1 and f2 and the next series is always
        the addition of previous numbers hence f = f1 + f2;
        */


        long f1 = 0;
        System.out.print(f1);
        long f2 = 1;
        System.out.print(", "+f2);

        long f = f1 + f2;
        System.out.print(", " +f);
        int i = 0;

        while (i < range){
            f1 = f2;
            f2 = f;
            f = f1 + f2;

            System.out.print(", "+f);
            i++;
        }



    }

}
