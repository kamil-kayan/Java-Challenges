package com.company;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private boolean clutchIsIn;
    private int currentGear = 0;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0);
        this.gears.add(neutral);

        for (int i = 0; i <maxGears; i++){
            addGear(i, i*2.3);

        }

    }

    public void addClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if (number > 0 && number < maxGears) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if (newGear >= 0 && newGear < gears.size()) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else {
            System.out.println("Qrrrrrr!");
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Qrrrrrr!");
        }
        return revs * gears.get(currentGear).getRatio();
    }


    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gear, double ratio) {
            this.ratio = ratio;
            this.gearNumber = gear;
        }

        public double driverSpeed(int revs) {
            return revs * (ratio);
        }

        public double getRatio() {
            return this.ratio;
        }

    }
}


























