public class SpeedTest {
    public static void main(String[] args) {
        toMilesPerHour(1.5);
        toMilesPerHour(10.25);
        toMilesPerHour(-5.6);
        toMilesPerHour(25.42);
        toMilesPerHour(75.114);

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }


    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0){
            // System.out.println ("Invalid");
            return -1;
        }
        return (long) Math.round(kilometersPerHour / 1.609);
    }
    public static void printConversion (double kilometersPerHour){
        if (kilometersPerHour < 0 ){
            System.out.println ("Invalid Value");
        }
        long milesPerHour = Math.round (kilometersPerHour * 1.609);
        System.out.println (kilometersPerHour +" km/h = "+ milesPerHour + " mi/h");
    }

}
