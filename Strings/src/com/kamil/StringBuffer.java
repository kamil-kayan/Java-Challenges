package com.kamil;
import java.lang.*;

public class StringBuffer {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        //Ways of Creating A StringBuffer;
        java.lang.StringBuffer sb = new java.lang.StringBuffer("Galtiano ");
        sb.append("Kamil");//for Adding a string,
        System.out.println("First String = "+sb);
        sb.append("ow");
        sb.insert(9, "Ina");//adding a string at a given index.
        sb.insert(12, " Abdirahman ");
        System.out.println("New String = "+sb);
        sb.append(23);

        sb.delete(0, 8);
        System.out.println("Deleted = "+sb);
        sb.reverse();
        System.out.println("Reversed = "+sb);

        java.lang.StringBuffer strB = new java.lang.StringBuffer(58);
        strB.append("Hyderabad");
        strB.insert(9," Secunderabad");
        strB.indexOf("bad");
        strB.lastIndexOf("bad");
        System.out.println(strB);

        strB.substring(0, 6);
        System.out.println("Substring: " + strB);
        strB.reverse();
        System.out.println("Reversed: "+strB);

        java.lang.StringBuffer sbr = new java.lang.StringBuffer("Garissa");
        System.out.println(sbr);
        sbr.replace(0,9,"Mumbai");
        System.out.println(sbr);


    }
}
