public class MethodOverloading {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(15,4);
        calcFeetAndInchesToCentimeters(11);
        calcFeetAndInchesToCentimeters(18, 0);
        calcFeetAndInchesToCentimeters(27);
        calcFeetAndInchesToCentimeters(8);
        calcFeetAndInchesToCentimeters(7);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {

            //Changing Feet int Inches first;
            double firstInches = feet * 12;
            System.out.println(feet + " feet into inches is " + firstInches);

            //Adding the total inches together then converting them all at once;
            double secondInches = (firstInches + inches);
            double toCentimeters = secondInches * 2.54;//this is in CM now;

            System.out.println(feet + " feet and " + inches
                    + " inches to centimeters is " + toCentimeters +
                    " centimeters");
            return toCentimeters;//returns in centimeters;
        }
        else {
            return -1;
        }

    }

    //creating another overload Method with one parameter(inches);
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if ((inches >= 0) && (inches <= 12)) {
            double feet = inches / 12;//converting feet into inches;
            System.out.println(inches + " inches to feet is " + feet + " feet");
        } else {
            return -1;
        }
        return calcFeetAndInchesToCentimeters(inches);//calling the overloaded Method;
    }
}
