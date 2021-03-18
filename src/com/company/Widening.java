package com.company;

/* When we convert asub class to a Super class its known as Generalization
* or Widening as we are making it more General.
* Using Generalizaton provides the programmer a 50% functionality.
* i.e one can only access the super class methods, unless he overrides it.
* but now he/she can only access the sub class methods. Hence 50%.  */


public class Widening {
    String wide = "Super class Variable";

    public void show(){
        System.out.println("Super class Method ");
    }
    public void display(){
        System.out.println("2nd Super Class Method.");
    }

}

class Wide extends Widening {
    String wide = "sub class Variable";

    public void show2(){
        System.out.println("sub class Method ");
    }
    public void display(){
        System.out.println("2nd sub Class Method.");
    }

}
class WideningMain {
    public static void main(String[] args) {
        Widening wn = new Wide();
        wn.show();  //super class Method (50% unless we override it.)
      // wn.show2();//Not Accessible.

            //Lets Call the sub class method that overrode.
        wn.display();


    }
}