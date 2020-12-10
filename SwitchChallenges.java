public class SwitchChallenges {
    public static void main(String[] args) {
        isLeapYear(2021);
        getDaysInMonth(2, 2022);
    }

    public static boolean isLeapYear(int year) {
        if ((year < 0) && (year > 9999)) {
            return false;
        }
        if (year % 400 == 0) {
            System.out.println("Leap Year");
            return true;
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Leap Year");
            return true;
        }
        return false;
    }


    public static int getDaysInMonth(int month, int year) {

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {

            return -1;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;

            case 2:
                if (isLeapYear(year)) {
                    System.out.println("29");
                    return 29;
                } else {
                    System.out.println("28");
                    return 28;
                }
            default:
                System.out.println("Not a Month of the year");
                break;
        }
        return -1;
    }
}
