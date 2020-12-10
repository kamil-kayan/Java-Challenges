package Section5_PartA;

public class SumOf3And5 {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;//For adding The numbers found thats divisible by both 3 and 5;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum = sum + i;
                System.out.println("The numbers divisible by both 3 and 5 are " + i);
                if (count == 5) {
                    System.out.println("Breaking the For Loop");
                    break;
                }
            }
        }
        System.out.println("Sum = " + sum);
    }
//            System.out.println("The sum of those numbers is " + sum);
}
