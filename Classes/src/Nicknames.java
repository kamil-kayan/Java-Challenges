public class Nicknames {
    private final String primary;
    private String highSchool;
    private final String estate;

    //Default Constructor.
    Nicknames(){
        this.primary = "Buuqay";
        this.highSchool = "Deka";
        this.estate = "Galti";
        System.out.println("HighSchool was: " + highSchool);
    }
    //Parameterized Constructor
    Nicknames(String primary, String estate) {
        this.primary = primary;
        this.estate = estate;
    }
    void setDetails() {
        System.out.println("Primary was " + primary);

        System.out.println("around my Estate was: "+estate);
    }
}
class NicknamesTest {
    public static void main(String[] args) {
        //Using Default Constructor;
        System.out.println("Kamil's nanes in :");
        Nicknames kamil = new Nicknames();
        kamil.setDetails();

        //Using Parameterized Constructor;
        System.out.println("Abdullahi's nanes in :");

        Nicknames abdalla = new Nicknames("oyoow","Nunez");
        abdalla.setDetails();

        System.out.println("Najib Ol's nanes in :");
        Nicknames najib = new Nicknames("Ollow","Ollow");
        najib.setDetails();

        Nicknames balabulu = new Nicknames();
        balabulu.setDetails();
    }



}
