package com.company;

    /*
    *  Narrowing or down Casting is when we convert A Super class into a sub class object
    *  When using Narrowing or Specialization the JVM explicitly asks for casting, its compulsory
    * that the user chooses it as iy leads to spillage of Data. Unsafe.
    *
     */
public class Narrowing {
    String a = "Super class";

    public void display() {
        System.out.println(a);
    }

}
class Narrow extends Narrowing{
    String a = "Sub class";

    public void display2(){
        System.out.println(a);
    }

}

class Demo{
    public static void main(String[] args) {



            /*
            * When using Narrowing the Programmer has 0% functionality, i.e he cant access
            * any methods of any of the classes.
            *
                    //Converting a sub class to a super class;
                Narrow nr = (Narrow) new Narrowing();
                nr.display2(); //Shows an Error.
            *
            * but we can fix this by first Declaring the reference of the super class to refer to
            * its sub class, then convert that Reference using Narrowing
            * */
        Narrowing nr = new Narrow();    //Super class ref that Points to the sub class object.
        Narrow n = (Narrow) nr;         //Narrowing Casting the Super class ref as sub class(Narrow) Type.
        n.display2();
        n.display();    //Now we have access to methods of both super and sub class.


    }
}