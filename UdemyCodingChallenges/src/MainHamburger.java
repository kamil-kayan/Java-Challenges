public class MainHamburger {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Italian", "Turkey");
        hamburger.burgerPrice();
        Additional additional = new Additional();

        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.healthyBPrice(23);

        DeluxeBurger deluxeBurger = new DeluxeBurger(3, 5);
        deluxeBurger.deluxePrice();

    }


}
