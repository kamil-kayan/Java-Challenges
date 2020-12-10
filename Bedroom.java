public class Bedroom {
    private String name;
    private int beds;
    private boolean bathTab = true;
    private int transMirrors;
    private Kitchen kitchen;

    public Bedroom(String name, int beds, boolean bathTab, int transMirrors, Kitchen kitchen) {
        this.name = name;
        this.beds = beds;
        this.bathTab = true;
        this.transMirrors = transMirrors;
        this.kitchen = kitchen;
    }

//            Getter Methods For Bedroom Class

    public String getName() {
        return this.name;
    }

    public int getBeds(int beds) {
        System.out.println("Has " + beds + " beds");
        return beds;
    }

    public boolean isBathTab() {
        return bathTab;
    }

    public int getTransMirrors() {
        return transMirrors;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }
}
