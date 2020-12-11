

import java.util.Scanner;

public class StringMutability {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many Strings?");
        int n = sc.nextInt();
        sc.nextLine();

        String[] str = new String[n];

        //Accepting the strings;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a String");
            str[i] = sc.nextLine();
        }

        //Accepting String to be searched;
        boolean found = false;//to stop if found;

        System.out.println("Enter String to be searched");
        String searched = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if(searched.equalsIgnoreCase(str[i])){
                System.out.println("Found at position: "+(i+1));
                found = true;
            }
        }
        if(!found){
            System.out.println("Not Found in Any Position!");
        }
    }
}
