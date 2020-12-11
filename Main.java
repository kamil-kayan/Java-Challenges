import java.util.*;

public class Main {
    public static void main(String[] args) {


        String ins[] = new String[4];
        ins[0] = "Smokie";
        ins[1] = "Scout";
        ins[2] = "iMazik";
        ins[3] = "Daljit";
        System.out.print("The Ins Team are: ");

        for (int i = 0; i < 4; i++) {

            System.out.print(ins[i]+", ");

            if (i == 3){
                System.out.println(ins[i]+".");
            }
        }
        System.out.println("");

        int rollNum[] = {45, 6023, 123, 58};
        int tot = 0;

        System.out.print("My roll Numbers in my Secular studies were: ");
        for (int i = 0; i < 4; i++) {
            tot += rollNum[i];
            System.out.print(rollNum[i] + ", ");
            if (i == 3) {

                System.out.println(rollNum[i] + ".");
            }
        }
        System.out.println("The total number = "+ tot);



    }
}
