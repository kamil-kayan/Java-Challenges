public class PrinterMain {
    public static void main(String[] args) {
        Printer p = new Printer(58, true);
        System.out.println("initial Page count = " + p.getNumOfPages());
        int pagesPrinted = p.printPages(22);

        System.out.println("Pages Printed = " + pagesPrinted);
        System.out.println("Additional pages = " + p.printPages(85));

        Printer prt = new Printer(89, false);
        System.out.println("Initial page count = " + prt.getNumOfPages());
        System.out.println(" " + prt.getNumOfPages());

        System.out.println("Added print pages = " + prt.printPages(88));


    }
}
