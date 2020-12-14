package com.kamil;

import java.io.IOError;
import java.io.IOException;

public class StringClassMethods {

    public static void main(String[] args) throws IOException {
        //Ways of Declaring a String;
        String s = "Kamil Ina abdirahman";
//        String ss = new String("EsCamilla");

        //Using The CommandLine(CMD);
//        int n = args.length;
//        int num1 = 0;
//        int num2 = 0;
////        for (int i = 0; i < n; i++) {
//            System.out.println("The values passed in the Command Line are: " + args[i]);
//            if (n > 2) {
//                System.out.println("please enter valid values.");
//            }
//            num1 = Integer.parseInt(args[i]);
//            num2 = Integer.parseInt(args[i++]);
//        }
//        System.out.println("The sum = " + num1 + num2);

        //String Class Methods;
        //(1)Concatenation;
        String k = "Kamil ";
        String k1 = "Es";
        String k2 = "Camila.";



        String k3 = k.concat(k1);
        String k4 = k3.concat(k2);
        System.out.println("The Whole String = "+k4);

        //(2)Length, CharAt(), int Compare;
        int l = k4.length();
        char c = k4.charAt(8);
        int compare = k.compareTo(k2);//Which ever letter comes first is regarded lesser;
        int comp = k2.compareToIgnoreCase(k);//Doesn't take into consideration which letter comes first or last;

        boolean b = k4.equalsIgnoreCase(k4);//Checks if two Strings are Same;
        boolean startsWith = k.startsWith("b");//Checks if it Starts with the apparent value;
        boolean endsWith = k.endsWith(k3);
        int indexOf = k.indexOf(s);
        int lastIndexOf = k3.lastIndexOf(k);

        //replaces the whole String with the chosen one;
        String replace = k4.replace(k2,k);
        String substring = k4.substring(5,11);//Returns strings from starting index to finish;
        String toUpperCase = k4.toUpperCase();//toLowerCase also changes the string to LowerCases;



        System.out.println("Length :"+l+"\t Char At(8)= "+c+"\t"+"Comparing K3 to K4:"+compare);
        System.out.println("The real Comparing method of k3 to k4: "+comp);
        System.out.println("Boolean Equals: "+b);
        System.out.println("StartsWith: "+startsWith+"\t Ends With :"+endsWith);
        System.out.println("Index of 'Kamil': "+indexOf+"\t Last Index of :"+lastIndexOf);
        System.out.println("Replaced: "+replace);
        System.out.println("Substring from 5-11: "+substring);
        System.out.println("To Upper Case: "+toUpperCase);

        //Using getChar Method;
        String str = "Havertz is Joining Chelsea Next Month, and also Onana and Riguillion are joining him.";
        char arr[] = new char[68];
        int n = str.length();
        System.out.println(n);

        str.getChars(0,26, arr,0);
        System.out.print("using GetChars: ");
        System.out.println(arr);

        //Using String Split delimiter;
        String[] j = str.split(" ");
        for (int i =0; i< n; i++) {
            System.out.println(j[i]);
        }


    }
}
