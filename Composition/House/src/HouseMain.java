public class HouseMain {
    public static void main(String[] args) {
        DinningRoom dinningRoom = new DinningRoom(2, 3);

        Kitchen kitchen = new Kitchen(2, true, dinningRoom);
        Bedroom bedroom = new Bedroom("Cami's Bedroom", 2, true, 3, kitchen);

        GuestRoom guestRoom = new GuestRoom();
        House house = new House(bedroom, guestRoom, kitchen);
        dinningRoom.hour(10);
    }
}
