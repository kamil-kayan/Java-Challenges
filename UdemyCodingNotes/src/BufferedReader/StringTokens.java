package BufferedReader;



import java.util.StringTokenizer;
import java.io.*;
public class StringTokens {

    public static void main(String[] args) throws IOException {

        //Accepting Values From Keyboard;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please Enter Two Values [Separated by commas]:");

        String str = br.readLine();

        //Introducing StringTokenizer and breaking String str into Tokens;
        StringTokenizer st = new StringTokenizer(str, ",");

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        //Converting The values into their corresponding data types;
        int firstVal = Integer.parseInt(s1);
        double secondVal = Double.parseDouble(s2);

          //Another way of wrinting the above statements:
       /*  int firstVal = Integer.parseInt(st.nextToken());
        double secondVal = Double.parseDouble(st.nextToken()); */

        long sum = (long) (firstVal + secondVal);

        System.out.println("The Sum of the Values " + firstVal + " and " + secondVal
                + " = " + sum);
        System.out.println("Subtraction = "+(firstVal-secondVal));
        System.out.println("Multiplication = "+(firstVal * secondVal));
        System.out.println("Division = "+(firstVal/secondVal));

    }
}
