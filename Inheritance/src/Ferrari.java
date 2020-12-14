public class Ferrari extends Car {
    String color;
    boolean convertible = true;
    private int roadServiceMonths;

    //    public Ferrari(String color, boolean convertible, int roadServiceMonths) {
//        this.color = color;
//        this.convertible = convertible;
//        this.roadServiceMonths = roadServiceMonths;
//    }
    public Ferrari() {
        this("", true);
    }

    public Ferrari(String color, boolean b) {
        this("", true, 1);
    }

    public Ferrari(String color, boolean convertible, int roadServiceMonths) {
        super("Pandora", 1, true);
        this.color = color;
        this.convertible = convertible;
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            setCurrentGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            setCurrentGear(1);
        } else if (newVelocity > 10 && newVelocity <= 25) {
            setCurrentGear(2);
        } else if (newVelocity > 25 && newVelocity <= 40) {
            setCurrentGear(3);
        } else if (newVelocity > 40 && newVelocity <= 50) {
            move(rate,getCurrentDirection());
            setCurrentGear(4);
        } else if (newVelocity > 50 && newVelocity <= 65) {
            setCurrentGear(5);
        } else if (newVelocity >= 65) {
            setCurrentGear(6);
        }
    }

}
