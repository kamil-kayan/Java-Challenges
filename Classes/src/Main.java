
class Kamil {

    String nickname;
    String talent;

    void marathon() {
        System.out.println("Movie Quiz! Huh, Do your Best against me!!");
    }
}
class Demo {
    public static void main(String[] args) {
        //Creating a new k object'
        Kamil k = new Kamil();

        //initializing the Instance Variables;
        k.nickname = "Buuqay";
        k.talent = "Am A CODER Bruuuh!!";

        System.out.println("Has code = " + k.hashCode());
        System.out.println("Nickname? : " + k.nickname);
        System.out.println("Talent? : " + k.talent);

        k.marathon();

        //Calling Nickname Class Using Access
        // Specifiers and Constructors;




    }
}




