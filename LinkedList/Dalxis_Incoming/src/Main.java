import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        placesToVisit.add("Wanderla");
        placesToVisit.add("Barbeque Nation");
        placesToVisit.add("Ramoji Film city");
        placesToVisit.add("Snow World");
        placesToVisit.add("Panari");
        placesToVisit.add("Lighthouse");
        placesToVisit.add("Galkonda");


        printList(placesToVisit);

            //Lets Add some places and remove some of them;
        placesToVisit.remove(3);
        printList(placesToVisit);

        sortOrder(placesToVisit,"Turkey");
        sortOrder(placesToVisit,"Denmark");
        sortOrder(placesToVisit,"US");
        sortOrder(placesToVisit,"Greece");
        sortOrder(placesToVisit,"Beijing");
        sortOrder(placesToVisit,"Turkey");
        sortOrder(placesToVisit,"Lighthouse");

        printList(placesToVisit);

        visit(placesToVisit);

    }

        //A Method that prints the list of Places to visit;
    public static void printList(LinkedList<String > linkedList){
            //an Iterator that goes through the list;
        ListIterator<String> i = linkedList.listIterator();
        while (i.hasNext()){
            System.out.println("Now Visiting: "+i.next());
        }
        System.out.println("==================");


    }

        //Lets Sort our List in Alphabetical order;
    public static boolean sortOrder(LinkedList<String> linkedList, String newPlace){
        ListIterator<String> stringListIterator = linkedList.listIterator();

            //Do an iteration as long as the stringListIterator has an item in the next node;
        while (stringListIterator.hasNext()) {

            //Comparison variable:returns a number: i.e 0 if its same, 1 if its greater and -1 if its less;
            int comparison = stringListIterator.next().compareTo(newPlace);
            if (comparison == 0) {
                //do not add
                System.out.println(newPlace + " is already on the list");
                return false;
            } else if (comparison > 0) {
                //Means it should appear before this one;
                stringListIterator.previous();
                stringListIterator.add(newPlace);
                return true;
            } else if (comparison < 1) {
//                return false;
            }
        }
        stringListIterator.add(newPlace);
        System.out.println("==================");

        return true;
    }


        //A method that allows you to revisit the places you've already been
    public  static void visit(LinkedList places) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = places.listIterator();

        if (places.isEmpty()) {
            System.out.println("No places added to the itinerary");
            return;
        } else {
            System.out.println("Now Visiting: " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Holiday Over. Hope it was fun and you enjoyed it!");
                    quit = true;
                    break;
                case 1:
                    if (listIterator.hasNext()) {
                        System.out.println("Now Visiting: " + listIterator.next());
                    } else {
                        System.out.println("Reached The end of the List.");
                    }
                    break;
                case 2:
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now Visiting: " + listIterator.previous());
                    } else {
                        System.out.println("Hold your Horses! We're Just Starting.");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }

    public static void printMenu() {
        System.out.println("Available choice: \n"+"Press");
        System.out.println("0 - to Quit.\n"+
                "1 - go to Next City.\n"+
                "2 - go to Previous City.\n" +
                "3 - print Choices.");

    }


}
