package com.kamil;

public class Dog extends Animal {

    private boolean fetch = true;
    private int legs;
    private int tail;
    private int teeth;

    public Dog(int legs, int teeth, int size, int weight, String name, int tail) {
        super(1, size, weight, name);
        this.legs = legs;
        this.teeth = teeth;
        this.tail = tail;
    }
    private void chew(){
        System.out.println("Chew method was called");
    }

    @Override
    public void eat() {
        System.out.println("Dogs Chew its Food.");
//        super.eat();
    }
    public void walk(){
        System.out.println("Dogs is Walking");
        super.move(7);//Executes The Super Move() even though we overrode it.
    }
    public void run(){
        System.out.println("Dog is Running");
        move(15);
    }

    public void moveLegs(){
        System.out.println("Moving Legs.");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog is Moving");
        moveLegs();
        super.move(speed);
    }
}
