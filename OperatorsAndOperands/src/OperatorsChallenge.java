import java.util.Scanner;

/*
1. Create a double variable value 20;
2. Create a second variable with value 80;
3. Add them both and Multiply by 100;
4. use The Reminder operator
5. Create a Boolean Variable if the remainder in #4 is true,or False if not
6. Output the Boolean
7. write if-then statement "Got a remainder" if no.5 is not true
 */
public class OperatorsChallenge {
    public static void main(String[] args) {
        double firstD = 20.00;
        double secondD = 80.00;
        double total = (secondD + firstD) * 100;
        System.out.println(total);

        double remainder = total % 40.00d;
        System.out.println("The Remainder ");


        boolean isRemainder = (remainder == 0) ? true : false;
        System.out.println("There's No Remainder");

        if (remainder % 2 == 1){
            System.out.println("There's remainder");

        }
        else {
            System.out.println("There's Remainder");
        }


                        /*If Else*/

        boolean gameOver = true;
        int score = 800;
        int levelCompeleted = 5;
        int bonus = 100;

        if (gameOver==true){
            int finalScore = (score * levelCompeleted)+bonus;
            System.out.println("Your Final Score is "+ finalScore);
        }

                /*Second Challenge*/

        boolean gameOver2 = true;
        int secondScore = 700;
        int levelCompeletedd;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Level You completed : ");
        levelCompeletedd = in.nextInt();
        int secondBonus = 200;

        int finalscore = bonus + (secondScore * levelCompeletedd);

        if (finalscore >= 5000 && finalscore <=7000){
            System.out.println("Your Final Score is greater than 5000 but less than 7000");
        } else if (finalscore == 1000 ){
            System.out.println("Your Final Score is " + finalscore +" Yeeeeeeeyyyyy");
        }
        else if( finalscore >= 7200) {
            System.out.println("Your Final Score is greater than 7200");
        }
        else{
            System.out.println("Your Final Score is less than 5000");
        }


    }

}
