public class Main2 {
    public static void main(String[] args) {


        BankAccount ba = new BankAccount(112324, " Kamil ",
                00, 7893275819L, "iconicallyKamil@gamil.com");

        ba.setBalance(70000);
        ba.setAccountNumber(2345_2674_6483_2356L);
        ba.setPhoneNumber(917893275819L);
        ba.setEmail("iconicallykamil");
        ba.setCustomerName("Kamil");


        System.out.println("Your Account number = " + ba.getAccountNumber());
        System.out.println("Your Name is " + ba.getCustomerName());
        System.out.println("Your Email is " + ba.getEmail());

        ba.withdraw(15000);
        ba.deposit(24000);
        System.out.println(ba.getBalance());
//          System.out.println("Your balance is = " + ba.getFinalBalance());

        //VIP code;
        VipCustomer vip = new VipCustomer("Kamil", 78230450L, "heownsit@me.him");

        System.out.println("Name = " + vip.getName());
        System.out.println("Cash Draining = " + vip.getCreditLimit());
        System.out.println(vip.getEmail());

        //Wall code;

//        Wall wall = new Wall(1.0, -1.25);

//        wall.setHeight(-23);

//        System.out.println("the area = "+ wall.getArea());

    }
}
