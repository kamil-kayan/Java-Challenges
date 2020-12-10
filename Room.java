public class Room {
    private int roomNums;
    private Bedroom bedroom;
    private GuestRoom guestRoom;
    private DinningRoom dinningRoom;

    public Room(int roomNums, Bedroom bedroom, GuestRoom gustRoom, DinningRoom dinningRoom) {
        this.roomNums = roomNums;
        this.bedroom = bedroom;
        this.guestRoom = gustRoom;
        this.dinningRoom = dinningRoom;
    }

    public int getRoomNums() {
        return roomNums;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public DinningRoom getDinningRoom() {
        return dinningRoom;
    }

    public GuestRoom getGuestRoom() {
        return guestRoom;
    }
}
