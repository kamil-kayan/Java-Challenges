public class Vehicle {
     private String name;
     private String engine;
     private int horsepower;
     private int wheels;
     private int year;
     private int currentVelocity;
     private int currentDirection;


    Vehicle(){
        this(" ",0);
    }
    Vehicle(String n, int y){
        this("","",0,0,0);
    }
    public Vehicle(String name, String engine, int horsepower,
                   int wheels, int year){
        this.name = name;
        this.engine = engine;
        this.horsepower = horsepower;
        this.wheels = wheels;
        this.year = year;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle steering at "+currentDirection+" degrees.");
    }
    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle Moving at "+currentVelocity+" in direction "+currentDirection);
    }

    public void topSpeed(int topSpeed){
        System.out.println(name+"'s Highest Speed was "+topSpeed+"km/h");
    }

    public void stop(){
        this.currentVelocity = 0;
    }

    public int getCurrentVelocity() {
        System.out.println("Vehicle moving at "+currentVelocity+" at direction "+getCurrentDirection());
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void getName(){
        this.name = name;
    }
}
