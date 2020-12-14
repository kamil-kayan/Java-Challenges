package com.kamil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImmutabilityOfString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Asking how many Strings?;
        System.out.println("How Many String Elements? ");
        int n = Integer.parseInt(br.readLine());

        //Creating String Type array;
        String str [] = new String[n];

        //Storing the strings;
        for (int i = 0; i < n; i++){
            System.out.print("Enter Strings: ");
            str[i] = br.readLine();
        }
        System.out.print("Enter the String to be searched: ");
        String searched = br.readLine();

        boolean found = false;
        for (int i =0; i < n; i++){
            if(searched.equalsIgnoreCase(str[i])) {
                System.out.println("Found at position: " +(i+1));
                found = true;
            }
        }
        if(!found){
            System.out.println("Not found.");
        }


    }
}
