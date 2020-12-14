import jdk.net.ExtendedSocketOptions;

import java.util.Scanner;

public class Methods {
//    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 100;
//        int levelCompleted = 5;
//        int bonus = 58;
//
//        calcScore(gameOver, score, levelCompleted, bonus);
//
//       /* score = 2000;
//        levelCompleted = 8;
//        bonus = 200;*/
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please Enter your Level: ");
//        levelCompleted = in.nextInt();
//
//        calcScore(true, 6023, levelCompleted, 230);
//
//
//    }

//    public static int calcScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        if (gameOver) {
//            int finalScore = (score * levelCompleted) + bonus;
//            finalScore += 100;
//            System.out.println("Your Final Score is " + finalScore);
//
//            return finalScore;
//        }
//        return -1;
//
//    }

                    /* METHOD CHALLENGE */


    public static void main(String[]args) {


        int highScore = calcHighScorePosition(1500);
        displayHighScorePosition("Kamil", highScore);

        highScore = calcHighScorePosition(900);
        displayHighScorePosition("Mahera", highScore);

        highScore = calcHighScorePosition(300);
        displayHighScorePosition("Anzal", highScore);

        highScore = calcHighScorePosition(50);
        displayHighScorePosition("Amish", highScore);


//
//        String name;
//        int position;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please Enter Your Name ");
//        name =in.nextLine();
//        displayHighScorePosition(name,7);
//        calcHighScorePosition(900);


    }


    public static void displayHighScorePosition(String name, int position){
        System.out.println(name +", You have Managed to get in position: "
                +position);
    }

        public  static int calcHighScorePosition(int score){

            if (score > 1000){

                return 1;

            } else if (score >= 500 && score < 1000){

                return 2;
            } else if(score > 100 && score < 500) {
                return 3;
            }
            else {
                return  4;
            }
        }


}

