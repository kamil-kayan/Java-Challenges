package Section5_PartA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromePhrases {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a phrase: ");//try nurses run, race car,

        //Accepting Inputs as String;
        String str = br.readLine();
        str = str.replace(" ", "");


        //Reversing (str) string char by char starting from the last char;
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
            System.out.println(reverse);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i);
            if ((str.charAt(i)) != (reverse.charAt(i))) isPalindrome = false;
        }

        if (isPalindrome) {
            System.out.println(str + " Is Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
}
