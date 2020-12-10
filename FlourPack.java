public class FlourPack {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            System.out.println("false");
            return false;
        }
        int expectedKilos = bigCount * 5;
        int sum = smallCount + expectedKilos;
        if (sum < goal) {
            System.out.println("false");
            return false;
        }
        System.out.println("true");
        return true;
    }
}
