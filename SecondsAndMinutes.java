package Section4Challenges;

public class SecondsAndMinutes {

    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(192, 24));
        System.out.println(getDurationString(450, 80));
        System.out.println(getDurationString(450, 25));
        System.out.println(getDurationString(187, 45));
        System.out.println(getDurationString(6023));
        System.out.println(getDurationString(360));
        System.out.println(getDurationString(-350));
        System.out.println(getDurationString(3658));
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(457, 34));
        System.out.println(getDurationString(78, 23));
    }

    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = (minutes / 60); //calculating the HOURS in a given minutes;
        long remainingMinutes = minutes % 60;// For Calculating the remainder in hours and storing them as minutes;

        String hoursString = hours + " h";
        if (hours < 10) {
            hoursString = "0" + hours;
        }

        String minutesString = remainingMinutes + " m";
        if (remainingMinutes < 10) {
            minutesString = " 0" + remainingMinutes;
        }

        String secondsString = seconds + " s";
        if (seconds < 10) {
            secondsString = " 0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString;// return as xxh yy min zz sec;

    }

    public static String getDurationString(long seconds) { //calculates The seconds given and converts them into Minutes
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = (seconds / 60);
        long remainingSeconds = (seconds % 60);

        /* We can use Either this Return:
        return seconds + " seconds into Minutes is equal to "
                + minutes + " Minutes " + remainingSeconds + " seconds";
       */
        //Or This One;

        return getDurationString(minutes, remainingSeconds);


    }

}












