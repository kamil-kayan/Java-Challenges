package Section4Challenges;/*Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers
are the same up to three decimal places. Otherwise, return false.


EXAMPLES OF INPUT/OUTPUT:

* areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

* areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.


TIP: Use paper and pencil.

TIP: Use casting.

NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.*/


public class DecimalPlaces {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.176, 3.175);
        hasEqualSum(23, 7, 30);
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        if ((int) (a * 1000) == (int) (b * 1000)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    /*Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.


EXAMPLES OF INPUT/OUTPUT:

* hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1

* hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2

* hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0


NOTE: The hasEqualSum method  needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.*/

    public static boolean hasEqualSum(int a, int b, int c) {
        if (a + b == c) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }


}
