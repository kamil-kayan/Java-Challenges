public class Main {

    /*Operators are nothing but symbols that perform an operation.

    They're Mainly three Types of operators
    1. Arithmetic operators i.e +,-,*,/,%
    2. Logical operators i.e
        i.Logical AND &&
        ii.Logical OR ||
        iii.Logical NOT !
    3. Relation Operators i.e <=,<,>=,>,!=, ==
     */

    /*          Arithmetic Operators
        Performs Arithmetic Operations on the Conditions Used upon.
     */

    public static void main(String[]args){

        int math = 98;
        int english = 80;
        int science = 92;
        int socialStudies = 82;
        int kiswahili = 78;

            //Additional Operator
        int totalMarks = (math + english + science+ socialStudies +
                kiswahili);

        System.out.println("Students Final Score is, " + totalMarks);

            //Division Operator
        double avarageMarks = (totalMarks/5) ;
        System.out.println("Students Final Avarage is, " + avarageMarks);


        avarageMarks = avarageMarks + 5;
        System.out.println("result 91 + 5 = " + avarageMarks);

        //you can also write the above avarageMarks line like this; tp avoid repetition
        avarageMarks +=5;//result was 91, 91 + 5 = 96;
        System.out.println("result 91 + 5 = " + avarageMarks);

        avarageMarks -=10;//we can do the same with -: which is gonna be 91;
        System.out.println("result 91 - 10 = " + avarageMarks);

        avarageMarks *= 5; //Multiplication 91 * 5 = 455;
        System.out.println("result 86 * 5 = " + avarageMarks);

        avarageMarks /= 5;// Back to 91
        System.out.println("result 86 / 5 = " + avarageMarks);
        avarageMarks = 56;


        /*      RELATIONAL OPERATOR
        They include <,>, <=, >=, ==, !=
         */


        if (avarageMarks >= 90){
             System.out.println("Excelent, You've got an A+.");
         }
         /*
                      LOGICAL OPERATORS
         They Check the comparison between two Statements
         Less than or Equals to operator (<=)
        */

         //The AND Operator
         else if (avarageMarks < 90 && avarageMarks >= 80){
             System.out.println("Great Job, You've Got an A.");
        }

         else if (avarageMarks < 80 && avarageMarks > 75){
             System.out.println("Great Job, You've Got a B+.");
         }

         //The OR Operator
         if (avarageMarks <= 75 || avarageMarks == 50 ){
             System.out.println("This is Average, Pull Up Your Socks");
         }
         else {
             System.out.println("Work Harder, You're below avarage.");
         }


         //How we can represent boolean conditions
         boolean score = true;

         if (score){ //Checks if the condition returns true
             System.out.println("This is true");
         }

        //The !(not Operator) checks for if the condition returns False and can be written like this
         boolean score2 = false;
         if (!score2){
             System.out.println("This Is checking for False Value ");
         }



         /*
        TERNARY OPERATOR
        This Operator acts on three Statements and is also called Conditional Operator
        The two Symbols used in this is ? and :

        Its Syntax is ;
            variable = expression1 ? expression2 : expression3;
            This Means if exp1 is true then Store it in exp2 if not then exp3
        */
        int k = 23;
        int m = 22;
        int older = (k < m )? k: m;

/*
       boolean isOlder = true;
        if (isOlder == false? true: false)

           System.out.println("Kamil Is Older Than Mahera");

            else {
            System.out.println("Mahera Is Older Than Kamil");
*/




                boolean maheraLove = false;
                if (!maheraLove) {
                    System.out.println("You still have Feelings for Ayan");
                }
                else{
                    System.out.print("You Dont Have Feelings For Mahera");
                }
                boolean maheraNoFeelings = maheraLove ? false : true;
                boolean maheraYesFeelings = maheraLove ? true : false;

        }


    }



