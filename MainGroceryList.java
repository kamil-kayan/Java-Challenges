import java.util.ArrayList;
import java.util.Scanner;

public class MainGroceryList {
    private static Scanner sc = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            //Switch case to select which method to carry out as per choice;
            switch (choice) {
                case 0:
                    printInstruction();
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }

    public static void printInstruction() {
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print Choice Options");
        System.out.println("\t 1 - To Print the list in Grocery Items");
        System.out.println("\t 2 - To add items to th List");
        System.out.println("\t 3 - To modify the items in the list");
        System.out.println("\t 4 - To remove items in the list");
        System.out.println("\t 5 - To search for items in the list");
        System.out.println("\t 6 - To quit the application");

    }

    // Methods for grocery List: addItem, Modify, remove;
    public static void addItem() {
        System.out.print("Please Enter items To be Added to the Grocery List: ");
        groceryList.addGroceryList(sc.nextLine());

    }

    public static void modifyItem() {
        System.out.print("Please enter Item Name: ");
        String itemNo = sc.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = sc.nextLine();

        groceryList.modifyGroceryItem(itemNo, newItem);

    }

    public static void removeItem() {
        System.out.print("Please enter Item Name: ");
        String itemName = sc.nextLine();
        groceryList.removeGroceryItem(itemName);

    }

    public static void searchForItem() {
        System.out.print("Enter item To search: ");
        String searching = sc.nextLine();
        if (groceryList.onFile(searching) ) {
            System.out.println(searching + " Found in the Grocery List.");
        } else {
            System.out.println(searching + " Not found in the Grocery List.");
        }
    }

        //This Method copies The array into another array;
    public static void processArray(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> newArray2 = new ArrayList<>(groceryList.getGroceryList()) ;

        String [] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

}
