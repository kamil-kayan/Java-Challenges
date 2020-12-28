import java.util.ArrayList;

public class Branch {

    private final String name;
    private ArrayList<Customer> customers;


    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }

     /* New Customers and their transaction amount; */
    public boolean addCustomer(String customerName, double initialAmt) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialAmt));
            return true;
        }
        return false;

    }

    //For new Transaction;
    public boolean addCustomerTransaction(String customerName, double amount) {

        Customer existingCustomer = findCustomer(customerName);

        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            Customer checkCustomer = customers.get(i);
            if (checkCustomer.getName().equals(name)) {
                return checkCustomer;
            }
        }
         /*for (Customer checkCustomer:this.customers) {
        if(checkCustomer.getName.equals(name){
            return checkCustomer;
            }
        }

         return this.customers.stream().filter
                (checkCustomer -> checkCustomer.getName().equals(name)).
                findFirst().orElse(null); */

        return null;
    }
}

