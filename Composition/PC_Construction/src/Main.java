public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220", "Hp", 230, dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Dell", 29, new Resolution(23, 22));
        Motherboard motherboard = new Motherboard("Bj-200", "Acer", 4, 6, "v2.23");

        PC thePC = new PC(motherboard, theMonitor, theCase);
        thePC.powerUp();
        thePC.progLoader();//calling progLoader form PC class'


    }
}
