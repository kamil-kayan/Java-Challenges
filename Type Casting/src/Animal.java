    //Achieving Polymorphism using type casting;

public class Animal {   //Super Animal class
    private String habitat;
    private  String food;
    private String name;
    private int hungerLevel;
    private boolean hasLegs;

    public Animal(){
        this("","","",1,false);
    }

            //initializing the instance Variables;
    public Animal(String habitat, String food, String name, int hungerLevel, boolean hasLegs) {
        this.habitat = habitat;
        this.food = food;
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.hasLegs = hasLegs;
    }

    public void makeNoise(){
        System.out.println("Fpehewewednjsdas");
    }

    public void roam(){
        System.out.println("ayoooo lets just roam around man");
    }
    public void eat(){
        System.out.println("Animal is Eating");
    }
    public void sleep(){
        System.out.println("Animal is Sleeping");
    }
    public void a(){
        System.out.println("Fpehewewednjsdas");
    }
}

        //Canine Class;
class Canine extends Animal{
    private boolean isDomestic;
    private int speed;
    private int canineSize;

    public Canine() {
      this(true,1,1);
    }

    public Canine( boolean isDomestic, int speed, int canineSize) {
        super("","","",1,true);
        this.speed = speed;
        this.canineSize = canineSize;
    }

    //Specific Method for Moving as they Move differently from other animals;
    public void roam(int speed){
        System.out.println("This Canine is Moving at "+speed);
    }

    public void hunt(){
        System.out.println("We Hunt in Packs!");
    }

}

    //Dog class;
class Dog extends Canine{
    private String breed;

    public Dog() {
        this(true,10,12,"");

    }

    public Dog(boolean isDomestic, int speed, int canineSize, String breed) {
        super(isDomestic, speed, canineSize);
        this.breed = breed;
    }

        //A Dog barks, so it has its own Noise sound;
        //Overrides makeNoise() in Animal class;
    public void makeNoise(){
        System.out.println("WUUF WUUF WUUF!!");
    }

        //It also needs its own eat() method.
    public void eat(){
        System.out.println("Dogs Chew their Food.");
    }

}

    //Wolf class;
class Wolf extends Canine{
    private boolean isAlfa;
    private String type;

    public Wolf() {
        this(false,58,24,true,"White Wolf");

    }

    public Wolf(boolean isDomestic, int speed, int canineSize, boolean isAlfa, String type) {
        super(isDomestic, speed, canineSize);
        this.isAlfa = isAlfa;
        this.type = type;
    }

             //A Wolf howls, so it has its own Noise sound;
        public void makeNoise(){
            System.out.println("UUUUUUUUUUuuuu!");
        }

            //A Wolf has a different eating style than Most Canines;
        public void eat(){
            System.out.println("Wolves Hunt as A pack!");
        }

}