public class Main {
    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();
        sc.setFirstNumber(23);
        sc.setSecondNumber(0);

        System.out.println("Addition = " + sc.getAdditionResult());
        System.out.println("Multiplication = " + sc.getMultiplicationResult());

        System.out.println("Division = " + sc.getDivisionResult());

        Person myn = new Person();
        myn.setFirstName("Anzal");
        myn.setLastName("Hussein");
        myn.setAge(220);

        System.out.println(myn.getFullName());

        System.out.println(myn.getFirstName() + " " + myn.getLastName() + " is "
                + myn.getAge() + " years old.");

    }

}
