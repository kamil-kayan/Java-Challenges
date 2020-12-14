package com.kamil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String: ");
        String str = br.readLine();
//Storing a Copy of the original;
        String temp = str;

        java.lang.StringBuffer sb = new java.lang.StringBuffer(str);
//reversing the string;
        sb.reverse();
//convert back into string;
        str = sb.toString();
//compare the original with the reversed String;
        if (temp.equalsIgnoreCase(str)) {
            System.out.println(temp + " Is Palindrome.");
        } else {
            System.out.println(temp + " Is Not Palindrome.");
        }

    }
}
