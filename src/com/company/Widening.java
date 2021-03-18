package com.company;

/* When we convert asub class to a Super class its known as Generalization
* or Widening as we are making it more General.
* Using Generalizaton provides the programmer a 50% functionality.
* i.e one can only access the super class methods, unless he overrides it.
* but now he/she can only access the sub class methods. Hence 50%.  */


public class Widening {
    String wide ;

    public void getWide(){
        System.out.println("Super class Variable");
    }

    public void show(){
        System.out.println("Super class Method ");
    }
    public void display(){
        System.out.println("2nd Super Class Method.");
    }

}

class Wide extends Widening {
    String wide;

    public void getWide2(){
        System.out.println("Super class Variable");
    }

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

      /*
         wn.show2();//Not Accessible.
         wn.getWide2(); Sub class instance variables and methods not accessible;
       */
        wn.getWide();//Superclass instance variable.

            //Lets Call the sub class method that overrode.
        wn.display();

            /* Now to overcome this and give the Programmer a 100% functionality,
            * we have to declare the super class reference ro refer to a sub class class
            * object then cast the reference of the super class using Narrowing.
            * */
        Widening widening = new Wide(); //Super class reference of type Sub class(Wide);
        Wide wide = (Wide) widening;    //Using Narrowing we cast the Super class ref as class Wide's Type
            //Now we can access all Methods and instance Variables;
        wide.show2();   //Sub class Method
        wide.show();    //Super class Method
        wide.display();
        wide.getWide();
        wide.getWide2();



    }
}