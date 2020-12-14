public class Additional {
    private int lettuce;
    private int tomato;
    private int carrots;
    private int olives;

    //Default constructor;
    public Additional() {
        this(1, 1, 1, 1);
    }

    public Additional(int lettuce, int tomato, int carrots, int olives) {
        this.lettuce = 20;
        this.tomato = 10;
        this.carrots = 10;
        this.olives = 20;
    }
}
