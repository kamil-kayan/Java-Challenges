package Section5_PartA;

public class ForLoop {
    public static void main(String[] args) {

        //               Getting the Interest of 10000 At a certain percentage using For Loop;

        for (int i = 2; i < 9; i++) {
            System.out.println("The interest for 10000 at rate " +
                    i + " % is: " + String.format("% 1f", calcInterest(10000, i)));

            //Calling the calcInterest Method while Looping through rates from 2% - 8%;

        }

        for (int i = 8; i >= 2; i--) {
            System.out.println("The Interest from 10000 at rate " + i + " % is "
                    + calcInterest(10000, i));
        }

    }

    public static double calcInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);

    }

}

