public class Car extends Vehicle{
    String model;
    private int gear;
    private int currentGear;
    private boolean isManual = false;

    public Car(){
        this("",1,false);
    }

    public Car(String model, int gear, boolean isManual){
        super("","",1,1,1);
        this.model = model;
        this.gear = gear;
        this.isManual = false;
        this.currentGear = 1;
    }

    public void drive(int speed){
        super.getName();
        System.out.print(" Moving at speed "+speed);
    }

    public void setModel(String model){

        System.out.print("This ");
        super.getName();
        System.out.println(" is a "
        +model);
    }

    public String getModel() {
        return model;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
        System.out.println("Has "+ gear+" gears");
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        System.out.println("Change setCurrent Gear(): changed to "+currentGear+" gear");
        this.currentGear = currentGear;
    }

}
