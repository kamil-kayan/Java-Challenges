package com.kamil;

public class Fish extends Animal {
    private int gills;
    private boolean swim = true;
    private int fins;

    public Fish(int gills, boolean swim, int fins){
        super(1,7,34,"Kay");
        this.gills = gills;
        this.fins = fins;
        this.swim = swim;
    }
    public void swim(int speed){
        System.out.println("Fish is Swimming");
        super.move(speed);
    }
    public void gills(int gills){
        System.out.println("Fish has "+gills+" gills");
    }


}
