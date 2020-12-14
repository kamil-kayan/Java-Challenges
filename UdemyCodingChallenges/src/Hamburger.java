import java.util.Scanner;

public class Hamburger {
    private String bread;
    private String meat;
    private int lettuce;
    private int tomato;
    private int olives;
    private int carrots;

    //Default Constructors;
    public Hamburger(String bread, String meat) {
        this("", "", 1, 1, 1, 1);
    }

    //Main Constructor;
    public Hamburger(String bread, String meat, int lettuce, int
            tomato, int olives, int carrots) {
        this.meat = meat;
        this.bread = bread;
        this.lettuce = 20;
        this.tomato = 10;
        this.olives = 20;
        this.carrots = 10;
    }


    public int burgerPrice() {
        int burger = 90;
        System.out.println("How Many Burgers do you need?");
        Scanner sc = new Scanner(System.in);
        int howMany = sc.nextInt();

        if (howMany == 1) {
            burger = 90;
            System.out.print("The Price of one burger is = " + burger);
            return 0;
        } else {
            int tot = (burger * howMany);
            System.out.print("The Price of " + howMany + " burgers is = " + tot);
            return tot;
        }
    }


    //Additions and total Price;
    public int totalPrice() {
        int total = burgerPrice();
        int additions = 0;
        switch (additions) {
            case 1:
                this.lettuce = 0;
        }
        return 0;


    }

    //GETTERS For Super Instances;

    public int getBurgerPrice() {
        return burgerPrice();
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getTomato() {
        return tomato;
    }

    public int getOlives() {
        return olives;
    }
}
