public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Equity Bank");

        if (bank.addNewBranch("Garissa")){
            System.out.println("Garissa Branch created.");
        }
        bank.addCustomer("Garissa","Kamil",57863.45);
        bank.addCustomer("Garissa","Hibo",10245.23);
        bank.addCustomer("Garissa","Maya",23465.90);

        bank.addNewBranch("Nairobi");
        bank.addCustomer("Nairobi","Deckz",10245.23);
        bank.addCustomer("Nairobi","Tuney",23465.90);
        bank.addCustomer("Nairobi","JayB",17863.45);
        bank.addCustomerTransaction("Nairobi","Deckz",10245.23);


        bank.addNewBranch("Kilimanjaro");
        bank.addCustomer("Kilimanjaro ","JayB",17863.45);
        bank.addCustomer("Kilimanjaro","Fauz",17863.45);
        bank.addCustomer("Kilimanjaro","Abdallah",17863.45);

        bank.listCustomers("Garissa",false);
        bank.listCustomers("Nairobi",true);
        bank.listCustomers("Kilimanjaro",false);




        if (!bank.addCustomer("Nairobi","JayB",56789)){
            System.out.println("Customer JayB already Exists,");
        }

    }

}
