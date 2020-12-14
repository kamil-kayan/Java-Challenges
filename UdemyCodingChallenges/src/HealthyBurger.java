public class HealthyBurger extends Hamburger {
    private String bread;
    private Additional additional;


    public HealthyBurger() {
        super("", "", 1, 1, 1, 1);
        this.bread = "Brown Bread";
        this.additional = additional;
    }

    //Pricing Method;
    public int healthyBPrice(int howMany) {
        int burgerPrice = 70 * howMany;
        return burgerPrice;
    }


    //Getters
    @Override
    public String getBread() {
        return bread;
    }

    public Additional getAdditional() {
        return additional;
    }
}
