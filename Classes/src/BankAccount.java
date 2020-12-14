public class BankAccount {
    private long number;
    private String customerName;
    private int balance;
    private long customerPhone;
    private String email;

    //Using Constructor to set Values to our fields;

    BankAccount() {
        this.balance = getBalance();
        this.customerPhone = getCustomerPhone();
        this.email = getEmail();
        this.number = getNumber();

    }
    BankAccount(String customerName, long number, int balance,
                long customerPhone, String email) {
        this.number = number;
        this.customerName = customerName;
        this.balance = balance;
        this.customerPhone = customerPhone;
        this.email = email;
    }

    //We can also call a constructor inside another constructor using empty constructor
   /* public BankAccount(){
        this(1234,"Narj",56000,12345678L,
                "narjdimpy@gmail.com");
    }*/


    public void withdraw(int withdraw) {
        if (this.balance - withdraw > 0) {
            System.out.println("Balance was: " + this.balance + " ");
            this.balance -= withdraw;
            System.out.println("Withdrawn: " + withdraw + " new Balance = " + this.balance);
        } else {
            System.out.println("Not enough cash. only " + balance + " is available.");
        }
    }

    public void deposit(int deposit) {
        System.out.print("You had: " + balance + " ");
        this.balance += deposit;
        System.out.println("Deposited: " + deposit + " new Balance = " + this.balance);
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String cn) {
        this.customerName = cn;
        this.getNumber();
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int blnc) {
        this.balance = blnc;
    }

    public long getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
