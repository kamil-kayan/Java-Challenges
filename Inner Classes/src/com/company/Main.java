package com.company;

public class Main {

    public static void main(String[] args) {
            //For us to Access the inner Gear class member we first create an
            //object to it's outer class then use the reference to create a new innerclass object;
        GearBox ferrari = new GearBox(6);
        GearBox.Gear gear = ferrari.addGear(2,23);

/*      GearBox ferrari = new GearBox(6);
        GearBox.Gear first = ferrari.new Gear(3,2.3);   //if its not Private u can access the inner class;
        GearBox.Gear second = new GearBox.Gear(2,3.3);//Error
        GearBox.Gear third = ferrari.new GearBox.Gear();//Also an error
        GearBox.Gear fourth = new Gear();//
        first.driverSpeed(123);*/


        ferrari.addClutch(true);
        ferrari.changeGear(1);
        ferrari.addClutch(false);
        System.out.println("Wheel Speed"+ferrari.wheelSpeed(2300));
        ferrari.changeGear(3);
        System.out.println("Wheel Speed"+ferrari.wheelSpeed(4000));
        ferrari.addClutch(true);    //Added A clutch, Starts making that annoying sound
        ferrari.addGear(5,23.8);
        System.out.println("Wheel Speed"+ferrari.wheelSpeed(4000));


    }
}
