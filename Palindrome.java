package Section5_PartA;

public class Palindrome {
    public static void main(String[] args) {
        isPalindrome(232);
        isPalindrome(199991);
    }

    private static boolean isPalindrome(int num) {

        if (num < 0) {
            num = num * (-1);
            System.out.println("Number is " + num);
        }

        int sum = 0;
        int r;
        int temp = num;

        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }

        if (temp == sum) {
            System.out.println(temp + " is Palindrome " + sum);
            return true;
        }

        System.out.println(temp + " is not the same as " + sum);
        return false;
    }

}

