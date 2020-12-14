package ExampleNotes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromePhrases {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Phrase: ");

        String str = br.readLine();
        str = str.replace(" ", "");

        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
            System.out.println(reverse);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != reverse.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println(str+" Is PALINDROME");
        }
        else{
              System.out.println(str+" Is Not PALINDROME");
        }
    }
}
