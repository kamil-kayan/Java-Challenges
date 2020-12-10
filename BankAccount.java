public class BankAccount {

    VipCustomer anzali = new VipCustomer() {
        anzali.setMyn("Anzal")("Hussein");
    }
    private long accountNumber;
    private String customerName;
    private int balance;
    private long phoneNumber;
    private String email;

    public BankAccount() {
        System.out.println("Empty Constructor Called");
    }

    public BankAccount(long accountNumber, String customerName, int balance,
                       long phoneNumber, String email) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void deposit(int deposit) {

        System.out.println("Balance was " + balance);
        balance += deposit;
        System.out.println("Deposited " + deposit + " new balance = " + balance);
    }

    public void withdraw(int withdraw) {
        if (balance - withdraw > 0) {
            this.balance -= withdraw;
            System.out.println("Withdrawn: " + withdraw +
                    " balance is now = " + this.balance);
        }
        System.out.println("Not enough balance. Only " +
                this.balance + " is available");

    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}


//    private int deposit;
//    private int withdraw;

  /*  private long newDepositBalance;
    private long finalBalance;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return withdraw - balance;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getDeposit() {
        return balance + deposit;

    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public void getWithdrawal(int withdrawal) {
        if (balance > withdrawal) {
            return balance - withdrawal;
        }
        return -1;
    }*/

//    public void setNewDepositBalance(long newDepositBalance){
//        this.newDepositBalance = newDepositBalance;
//    }
//    public void setNewWithdrawBalance(long newWithdrawBalance){
//        this.newWithdrawBalance = newWithdrawBalance;
//    }


  /*  public long getNewDepositBalance() {
        return balance + deposit;
    }

    public long getFinalBalance() {
        if (balance > withdraw) {
            return (balance - withdraw) + deposit;
        }
        return 0;
    }*/
//}
