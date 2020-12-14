package com.kamil;

public class Animal {

    private String name;
    private int brain;
    private int size;
    private  int weight;


    public Animal(int brain, int size, int weight, String name) {
        this.brain = brain;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public void eat(){
        System.out.println("Animal.eat was called");
    }
    public void move(int speed){
        System.out.println("Animal is moving at speed "+speed);
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
