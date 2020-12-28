import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Kamil", 23);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setAge(25);

        System.out.println("" +
                "Name: " + customer.getName() + "\n Age: ");

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i =0; i < intList.size(); i++){
            System.out.println((i)+" = "+intList.get(i));
        }

        intList.add(1,2);
        for (int i =0; i < intList.size(); i++){
            System.out.println((i)+" = "+intList.get(i));
        }

    }

}
