package Section4Challenges;

public class MinutesIntoYears {
    public static void main(String[] args) {
        printEqual(23, 23, 23);

        printYearsAndDays(1200823);

        isCatPlaying(true, 52);
        isCatPlaying(true, 45);
        isCatPlaying(false, 27);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        long years = (minutes / 525_600);
        long remainingDays = minutes % 525600;
        long days = (remainingDays / 1440);
        System.out.println(minutes + " minutes into years is "
                + years + " years " + days + " days.");
    }

    // Equality Printer

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a == b || b == c || c == a) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }

    // Cat Playing

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((summer) && (temperature >= 25) && (temperature <= 45)) {
            System.out.println("true");
            return true;
        } else if ((!summer) && ((temperature >= 25) && (temperature <= 35))) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}

