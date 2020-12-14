public class PlayerMain {
    public static void main(String[] args) {


        Player player = new Player("Cami", 89, "Arrow");

        System.out.println("Health = " + player.getHitPoints());
        player.loseHealth(10);
        System.out.println(player.getName() + "'s Remaining health = " + player.remainingHealth());

        player.loseHealth(100);
        System.out.println(player.getName() + "'s Remaining health = " + player.remainingHealth());

    }
}
