public class MainAnimal {
    public static void main(String[] args) {

            //No Casting needed when both are of the same Class types;
        Animal animals = new Animal();
        animals.roam();

        Canine can  = new Canine();
        can.hunt();

            /*
               Converting a Class type into another different Class Type.
               Conversion of a sub class into a super Class (Generalization / Widening)
               only 50% functionality is available to the Programmer.
               One Cannot access the sub class methods,only the Super class, Unless you override it
               then The sub class Methods are available and not the Super class. 50%.

               */
        Animal cheetah = (Animal) new Canine();
        cheetah.roam(); //It's supposed to call it's sub class but calls the super.

//        cheetah.hunt();   Sub class method hunt() in canine is not available. 50%.

        Canine dog = new Dog();  //Super class Canine and the Dog object are not of the same type;

        dog.eat();  //Canine type that References the Dog object and calls its eat() method
        dog.makeNoise();    //Dog class method;
        dog.hunt();

        dog = (Canine) new Wolf();   //References the Wolf object and calls its eat() method;
        dog.eat();  //Wolf class method
        dog.hunt();

            /* *
             * Now what we did was DownCasting(Specialization). We were More specific.
             * Specialization is when we convert A super class into a sub class.
             * Making it more and more specific, 'Narrowing' it down.
             * On the other Hand, Generalization is when we're converting a sub class into a super class,
             * making it more general and widening it.
             * When doing Specialization the JVM doesn't do it implicit converting aas it
             * more unsafe, it's done explicitly.
             *
             * */
                //Specialization Explicit Casting




    }
}
