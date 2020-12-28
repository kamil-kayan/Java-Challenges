import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String n, double initialAmount) {
        this.name = n;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);

    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }


}
