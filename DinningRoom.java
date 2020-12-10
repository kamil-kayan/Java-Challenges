public class DinningRoom {
    private int dinningTables;
    private int fridge;
//    private int dinningHours;

    public DinningRoom(int dinningTables, int fridge) {
        this.dinningTables = dinningTables;
        this.fridge = fridge;
//        this.dinningHours = dinningHours;
    }

    public void hour(int time) {
        dinningHours(time);
    }

    private void dinningHours(int time) {
        if (time > 24) {
            System.out.println("Which universe Are you From??");
        } else if (time > 6 && time <= 11) {
            System.out.println("Breakfast Time!!!");
        } else if (time < 16 && time <= 12) {
            System.out.println("It's Lunch Time, Hurry Up!!");
        } else if (time > 23) {
            System.out.println("Dinner Time Kids!!");
        }
    }

}
