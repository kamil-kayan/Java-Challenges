import java.lang.*;

public class CommandLine {
    public static void main(String[] args) {
        int n = args.length;

        System.out.println("The args are ");
        for (int i = 0; i < n; i++){
            System.out.println(args[i]);
        }
        String s1 = args[0];
        String s2 = args[1];

        double num1 = Double.parseDouble(s1);
        double num2 = Double.parseDouble(s2);

        double sum = num1 + num2;
        System.out.println("The Sum of "+num1+" and "+num2+ " is = "+sum);
    }
}
