package BufferedReader;

public class ParsingValues {

    public static void main(String[] args) {

        String numberAsString = "6023";
        System.out.println("Number As String = " +numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("Parsed number into integer ="+ number);

        number += 2;//Adds 2 to 6023 = 6025;
        numberAsString += 2;// THe O/P becomes 60232, it just treat the number
                            //2 as sing
        System.out.println("New number = "+numberAsString);// 60232
        System.out.println("New number = "+number);//6025;

        double num = Double.parseDouble(numberAsString);
        num += 0.45;
        System.out.println("Double format = "+ num);
    }
}
