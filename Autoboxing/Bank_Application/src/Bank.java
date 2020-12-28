import java.util.ArrayList;

public class Bank {
    private String name;
    ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addNewBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch br = findBranch(branchName);
        if (br != null) {
            return br.addCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch checkBranch = branches.get(i);
            if (checkBranch.getName().equals(branchName)) {
                return checkBranch;
            }
        }
        return null;
    }

    public void listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for " + branch.getName()+" branch:");

             //List of Customers that are in this Branch;
            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer [" + (i+1) + "]: "+ branchCustomer.getName() );

                    //If They want to see the transaction i.e showTransaction is set true;
                if (showTransactions){
                    System.out.print("Transactions: \n");

                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++){
                        System.out.println("["+(j+1)+"] Amount "+transactions.get(j));
                    }
                }
            }

        }
        else {
            System.out.println(branchName+ " branch was Not Found!");
        }
    }
}




