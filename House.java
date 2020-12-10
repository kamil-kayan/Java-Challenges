public class House {
    private Bedroom bedroom;
    private GuestRoom guestRoom;
    private Kitchen kitchen;


    public House(Bedroom bedroom, GuestRoom guestRoom, Kitchen kitchen) {
        this.bedroom = bedroom;
        this.guestRoom = guestRoom;
        this.kitchen = kitchen;
    }


    public GuestRoom getGuestRoom() {
        return guestRoom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }
}
