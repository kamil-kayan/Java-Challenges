public class LCM {
    public static void main(String[] args) {

    }

    public static int lcm(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        int least = 1;
        int common = 1;

        //18 = 18, 36, 54;
        // 12 = 24, 36, 48..;
        // 36 = 36, 72, 108..
        // 36 appears first in both 12 and 36 hence the least common multiplier
        while (least <= a) {
            for (least = 1; least <= a; least++) {
                common = least * a;
                return common;
            }

        }

        return 1;
    }
}
