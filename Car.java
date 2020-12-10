public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car() {
        this("", 4);
    }

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    //Methods for Accelerate, stop and StartEngine;
    public void startEngine() {
        System.out.println("Engine is ON.");
    }

    public void accelerate(int speed) {
        if (speed < 0) {
            stop();
        } else {
            System.out.println(getName() + " Moving at: " + speed + "Km/h");
        }
    }

    public void stop() {
        System.out.println(getName() + " Halted.");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    //Setter Methods;

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
//Ferrari Class;

class Ferrari extends Car {
    private String model;
    private String color;
    private boolean convertible;

    public Ferrari(String model, String color, boolean convertible) {
        super("", 1);
        this.model = model;
        this.convertible = true;
        this.color = color;
    }

    @Override
    public void accelerate(int speed) {
        if (speed < 0) {
            stop();
        } else {
            System.out.println("Ferrari at: " + speed + " super Speed Baby");
        }
    }

    //Overridden Super Car Class stop() Method;
    public void stop() {
        System.out.println(getClass().getName() + " Hit the Brakes!!");
    }

    //GETTER and SETTER Methods.

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}

//Porsche Class;


class Porsche extends Car {
    private String model;
    private String color;

    public Porsche() {
        this("", "");
    }

    public Porsche(String model, String color) {
        super("", 1);
        this.model = model;
        this.color = color;
    }

    public void startEngine() {
        System.out.println("Porsche Starting Baby!!!");
    }

    public void accelerate(int speed) {
        System.out.println(getClass().getName() + " Moving at " + speed);
    }

    public String staahp() {
        return " Porsche Hitting the Breaks";
    }

    //Getter Methods;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}

//Lamborghini Class.

class Lamborghini extends Car {
    private String color;

    public Lamborghini() {
        this("");
    }

    public Lamborghini(String color) {
        super("", 1);
        this.color = color;
    }

    //Overridden Super Car Class stop() Method;
    public void stop() {
        System.out.println("You hit the Lambo Breaks!!!");
    }

    public String getColor() {
        return color;
    }
}

class MainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Taxi");

        Ferrari ferrari = new Ferrari("Portofino", "Red", true);
        ferrari.stop();
        ferrari.setName("Portofino");
        ferrari.accelerate(-23);

        Porsche porsche = new Porsche();
        porsche.startEngine();
        porsche.staahp();
        porsche.accelerate(45);

        Lamborghini lambo = new Lamborghini();
        lambo.setName("Lambo");
        lambo.accelerate(23);
        lambo.stop();
    }
}