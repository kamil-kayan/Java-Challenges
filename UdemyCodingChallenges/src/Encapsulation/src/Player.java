/**
 * Encapsulation
 * is The Process of Creating a protective Shield around your
 * instance Variables to avoid it being manipulated.
 * <p>
 * /**
 * You can change your Encapsulated instances without affecting any
 * other code.
 */


public class Player {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public Player(String name, int hitPoints, String weapon) {
        this.name = name;
        //Creating a protective shield;
        if (hitPoints > 0 && hitPoints < 100) {
            this.hitPoints = hitPoints;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints -= damage;
        if (hitPoints < 0) {
            System.out.println(name + " is Knocked out!");
        }
    }

    public int remainingHealth() {
        return hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
