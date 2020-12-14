package BufferedReader;


//import jdk.internal.org.jline.utils.InputStreamReader;

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
//import java.nio.Buffer;

public class BufferdReader {
    public static void main(String[] args) throws IOException {


        //Parsing String Into Integer;
        String ch = "2";
        int k = Integer.parseInt(ch);
        System.out.println(k);
        k = k + 1;
        ch = ch + 2;
        System.out.println(k);
        System.out.println("This is String form " + ch);

        //Reading A String of Sentences;
        BufferedReader kami = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Enter a Your Passcode");
        //Accepting The String Kami from the Keyboard;
        String m = kami.readLine();
        System.out.println("Hello "+m + " Your Private Jet is ready");

        //Reading a single Character
        BufferedReader Anzal = new BufferedReader(new InputStreamReader(System.in));
        char n = (char)Anzal.read();
        System.out.println("Enter a character of the Country you want to visit");
        System.out.println("You've Entered "+n);


        //Accepting an Integer Value from Keyboard;


        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your fevourite number");
        String age = a.readLine();
        //We first accept it as a String by using readLine();

        int num = Integer.parseInt(age);//then Convert it into An Integer;
        System.out.println(num);

        //we can combine the above statement as :
        System.out.println("Again");
        int fev = Integer.parseInt(a.readLine());
        System.out.println("Your Fevourite number is "+fev);


        //Accepting Float values from Keyboard;
        java.io.BufferedReader f = new java.io.BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Decimal Value");
        float fl =Float.parseFloat( f.readLine());
        System.out.println(fl);

        //Accepting Double From Keyboard;
        java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader (System.in));
        System.out.println("Enter a Double Value");
        double d = Double.parseDouble(br.readLine());
        System.out.println(d);


        //Accepting Byte values From Keyboard
        java.io.BufferedReader by = new java.io.BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Byte Value");
        byte byt = Byte.parseByte(by.readLine());
        System.out.println(byt);

 /*       // Accepting Other Types of Data Types;

//        Boolean;
        boolean b = Boolean.parseBoolean(br.readLine());

        //Short;
        short sh = Short.parseShort(br.readLine());

        //
        */

    }
}
