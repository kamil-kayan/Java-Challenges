import java.util.Scanner;

public class MethodChallenges {
    public static void main(String[] args) {
        int num ;
        checkNumber(7);
        checkNumber(0);
        checkNumber(-45);

    }

        public static void checkNumber(int num){
//        Scanner in = new Scanner(System.in);
//        num =  in.nextInt();
            if (num > 0){
                System.out.println("Positive Number.");
            } else if (num == 0){
                System.out.println("Zero.");
            }
            else if ( num < 0){
                System.out.println("Negative Number.");
            }
            else{
                System.out.println("Invalid, please enter a number.");
            }

        }


    }




