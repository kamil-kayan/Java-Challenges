package com.company;

    /** Abstract Classes are classes that contain Methods with No body.
     * When we want to use the same Method to perform different tasks and
     * operations depending on the Object that's calling it, we use
     * Abstract Methods. Then implements those methods on  it's Sub classes.
     *
     * */

abstract class FirstAbs {

            //Creating an abstract Method;
        abstract void calculate(double a);
    }


            //Square class that calculates the square of a given no. Using the
            //Abstract calculate() method.
class Square extends FirstAbs{

        //Calculates the square of k;
    public void calculate(double a){
        System.out.println("Square = "+(a * a));
    }

}

        //SquareRoot class calling the Same calculate() but this time it calculates the
        // Square root
class SquareRoot extends FirstAbs{

    public void calculate(double a){
        System.out.println("Square Root = "+(Math.sqrt(a)));
    }

}

        //Cube Class;
class Cube extends FirstAbs{
    public void calculate(double k ){
        System.out.println("Cube = "+(k*k*k));
    }
}


 class Main {

    public static void main(String[] args) {
        FirstAbs firstAbs;  //Ref of the Super Class;
        firstAbs = new Square();    //now points to it's Square sub class;
        firstAbs.calculate(23); //Square's Calculate() method;

        firstAbs = new SquareRoot();
        firstAbs.calculate(6023);   //SquareRoot's Calculate() method;

        firstAbs = new Cube();
        firstAbs.calculate(7);

    }
}
