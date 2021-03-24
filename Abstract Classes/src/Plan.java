
    /* An Abstract class that calculates the Electricity bill
    * between Domestic plan and Commercial plan.
    *
    * Depending on the type of connection the rates per unit will vary.
    * Since both plans have different rates we use as abstract so that
    * each plan has its own rate.
    * */

abstract class Plan {
    protected double rate;  //accessible only to its Sub classes;

        //Abstract () since rate will change.
    public abstract void getRate();

        //Calculates electricity bill by taking the units;
    public void calcBill(double units){

        System.out.print("Bill amounts for "+units+" units = ");

        System.out.println(rate * units);
    }
}

class DomesticPlan extends Plan{
        //Storing domestic rate as 2.30 per unit
    public void getRate(){
        rate = 2.30;
    }

}

class CommercialPlan extends Plan {
        //Storing Commercial rate as 5.00 per unit
    public void getRate() {
        rate = 5.00;
    }
}

class PlanDemo{
    public static void main(String[] args) {
        Plan pl;    //Super class reference;

        System.out.println("Domestic Plan: ");
        pl = new DomesticPlan();    //using the ref to refer to sb class object
        pl.getRate();
        pl.calcBill(123.7);

        System.out.println("Commercial Plan:");
        pl = new CommercialPlan();  //using the ref to refer to sb class object
        pl.getRate();
        pl.calcBill(123.7);


    }
}