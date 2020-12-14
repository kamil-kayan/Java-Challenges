import java.util.Scanner;

public class DeluxeBurger extends Hamburger {
    private int drinks;
    private int chips;

    public DeluxeBurger(int drinks, int chips) {
        super("", "");
        this.drinks = 50;
        this.chips = 40;
    }


    //Deluxe Price;
    public void deluxePrice() {
        int deluxe = 120;

        System.out.println("How Many Burgers do you need?");
        Scanner sc = new Scanner(System.in);
        int howMany = sc.nextInt();
        if (howMany == 1) {
            System.out.println("The price of a single Deluxe burger is " + deluxe);
        } else {
            int tot = howMany * deluxe;
            System.out.println("Price of " + howMany + " Deluxe burgers is " + tot);
        }
        totalPrice();
    }

    //Drinks and chips price;
    public int drinkPrice() {
        int price = 50 * this.drinks;
        return price;
    }

    public int chipsPrice() {
        int price = 40 * this.chips;
        return price;
    }

    //total deluxe Burger Price;
    public int totalPrice() {
        int deluxeTot = getChips() + drinkPrice();
        System.out.println("Total Deluxe Price = " + deluxeTot);
        return deluxeTot;

    }

    public int getChipsPrice() {
        return chipsPrice();
    }


    public int getDrinks() {
        return drinks;
    }

    public int getChips() {
        return chips;
    }
}
