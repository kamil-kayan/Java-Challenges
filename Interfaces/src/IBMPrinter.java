import java.io.FileReader;
import java.io.LineNumberReader;

/** Suppose we have a printer interface that prints texts sent to it
 *Since not every printer has the same specifications we use an interface
 * then implement it to its corresponding printer, be it Epson, IBM printer.
 *
 * */

interface Printer {
    void printIt(String text);
    void disconnect();
}


    //IBM Implementation class;
public class IBMPrinter implements Printer {

    public void printIt(String text){
        System.out.println(text);
    }
    public void disconnect(){
        System.out.println("Disconnected from IBM Printer.");
    }

}

class EpsonPrinter implements Printer {

    public void printIt(String text){
        System.out.println(text);
    }
    public void disconnect(){
        System.out.println("Disconnected from Epson Printer.");
    }

}

class Printing{
    public static void main(String[] args) throws Exception{
        /*  Since at the time of Writing the Main, we don't know the Name of the
            implementation class we use fileReader to read data from a file that's stored
            the name of the class.
            then LineNumberReader to read it line by line from that file.
         */

            //Lets assume the file name is "Kamil.txt";
 /*       FileReader fr = new FileReader("Kamil.txt");

        LineNumberReader lnr = new LineNumberReader(fr);

            //Store the name in a string;
        String printerName = lnr.readLine();

            //Store the printerName in object c(ClassName);
        Class c = Class.forName(printerName);

            //Create an object (of the Class in c) of type Printer Interface;
        Printer pr = (Printer) c.newInstance();

            //now Access the Methods to print and to disconnect;
        pr.printIt("Printing in Progress.");
        pr.disconnect();
        */

        Printer pr;     //Interface Reference;

        pr = new EpsonPrinter();    //Pointing t a sub class object;

            //Calling the methods printIt() and telling what to print;
        pr.printIt("Epson Printer at Work");
        pr.disconnect();

        pr = new IBMPrinter();
        pr.printIt("IBM Printer Printing now");
        pr.disconnect();

    }

}
