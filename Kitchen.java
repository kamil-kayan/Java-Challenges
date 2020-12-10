public class Kitchen {
    private int fridges;
    private boolean utensilDraws = true;
    private DinningRoom dinningRoom;

    public Kitchen(int fridges, boolean utensilDraws, DinningRoom dinningRoom) {
        this.fridges = fridges;
        this.utensilDraws = utensilDraws;
        this.dinningRoom = dinningRoom;
    }
}

