import java.io.IOException;
import java.util.Scanner;
//import java.util.Scanner;
//import java.util.StringTokenizer;

public class TenNumSum {
    public static void main(String[] args) throws IOException {

        int addition = 0;
        Scanner sc = new Scanner(System.in);

        int counter = 0;

        //While(true);
        while (counter < 10) {
            int order = counter + 1;
            System.out.print("Enter number # " + order + ": ");

            boolean hasInt = sc.hasNextInt();

            if (hasInt) {
                int num = sc.nextInt();
                counter++;
                addition += num;
//                if (counter == 10) {
//                    break;
//                }
            } else {
                System.out.println("Not a Number!");
            }
            sc.nextLine();

        }
        sc.close();
        System.out.println("The sum of The 10 numbers are = " + addition);
    }
/*
                //Using BufferedReader Input Stream;

         int sum = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter 10 Numbers: ");

        int count = 1;

        while (count <= 10){

            int a = Integer.parseInt(br.readLine());
            sum += a;
            count ++;
        }
       System.out.println(sum); */
}
