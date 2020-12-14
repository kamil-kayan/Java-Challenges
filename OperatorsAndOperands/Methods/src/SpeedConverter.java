import com.sun.source.tree.BreakTree;

import java.util.Enumeration;

            /*1. Write a method called toMilesPerHour that has 1 parameter of type double with the
             name kilometersPerHour.
            This method needs to return the rounded value of the calculation of type long.

        If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to
        indicate an invalid value.

        Otherwise, if it is positive, calculate the value of miles per hour, round it and return it.
         For conversion and rounding, check the notes in the text below.

        Examples of input/output:
        * toMilesPerHour(1.5); → should return value 1
        * toMilesPerHour(10.25); → should return value 6
        * toMilesPerHour(-5.6); → should return value -1
        * toMilesPerHour(25.42); → should return value 16
        * toMilesPerHour(75.114); → should return value 47


        2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.

        This method should not return anything (void) and it needs to calculate milesPerHour from
        the kilometersPerHour parameter.

        Then it needs to print a message in the format "XX km/h = YY mi/h".

        XX represents the original value kilometersPerHour.
        YY represents the rounded milesPerHour from the kilometersPerHour parameter.

        If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".

        NOTE: 1 mile per hour is 1.609 kilometers per hour

        */
public class SpeedConverter {
     public static void main(String[] args) {
         toMilesPerHour(1.5);//return 1
         toMilesPerHour(10.25);//return 6;
         toMilesPerHour(-5.6);//return -1;
         toMilesPerHour(25.42);//return 16;
         toMilesPerHour(75.114);//return 47;

         printConversion(1.5);//return 1;
         printConversion(10.25);//return 6'
         printConversion(-5.6);//return -1;
         printConversion(25.42);//return 16;
         printConversion(75.114);//return 47;
     }

      public static long toMilesPerHour(double kilometerPerHour) {

        if ( kilometerPerHour < 0) {
            System.out.println(kilometerPerHour + " km/h into miles Per Hour is Invalid");

            return -1;
        }
//          System.out.println(
//                  kilometerPerHour + "km/h into miles per Hour is "+"m/h"
//          );
        return Math.round(kilometerPerHour / 1.609);
      }

      public static void printConversion(double kilometerPerHour){

         if (kilometerPerHour < 0){
             System.out.println(kilometerPerHour + " km/h into miles Per Hour is Invalid");
         }
         long toMilesPerHour= Math.round(kilometerPerHour * 1.609);
          System.out.println( kilometerPerHour + "m/h into kilometers Per Hour is " + toMilesPerHour+ "km/h");

      }


}
