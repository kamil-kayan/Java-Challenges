import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayFromKeyboard {
    public static void main(CreatingStrings[] args) throws IOException {

        //Accepting values from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("How Many subjects are you entering There Marks? :");
        int numOfSubj = Integer.parseInt(br.readLine());

        int total = 0;
        int avg = 0;
        int marks[] = new int[numOfSubj];
        int count =0;
        for (int i = 0; i < numOfSubj; i++){
            count ++;

            System.out.println("Enter the marks of the subject:"+count);
            marks [i] = Integer.parseInt(br.readLine());

            total += marks[i];
        }
        avg = total / numOfSubj;
        System.out.println("The total Marks = "+total);
        System.out.println("The Average marks = "+avg+ "%.");

    }
}
