public class VipCustomer {

    private String name;
    private long creditLimit;
    private String email;
    private String myn;


    public VipCustomer() {
        this("Default name", 456700, "Default email");
    }

    public VipCustomer(String name, long creditLimit) {
        this(name, creditLimit, "kamil@me.com");
    }

    public VipCustomer(String name, long creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setMyn(String myn) {
        this.myn = myn;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
