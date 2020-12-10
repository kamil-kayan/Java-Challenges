public class LeapYearUsingSwitch {
    public static void main(String[] args) {
        isLeapYear(2020);
        getDaysInMonth(2, 202);
    }

    public static boolean isLeapYear(int year) {

        if ((year < 1) || (year > 9999) || (year % 4 != 0)) {
            return false;
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {

        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        }

        switch (month) {

            case 9:
            case 4:
            case 6:
            case 11:
                return 30;
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
            case 8:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else if (!isLeapYear(year)) {
                    return 28;
                } else {
                    return -1;
                }
            default:
                return -1;
        }
    }
}

