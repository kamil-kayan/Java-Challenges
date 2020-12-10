import java.util.ArrayList;

public class GroceryList {

    private final ArrayList<String> groceryList = new ArrayList<>();

        //Getter Method;
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

        //Adding value in array;
    public void addGroceryList(String item){
        groceryList.add(item);
    }
            //Printing the Elements;
    public void printGroceryList(){
        System.out.println("You Have "+groceryList.size()+" items in your Grocery List");

        for (int i = 0; i < groceryList.size(); i++){
            System.out.println(i+1+". "+groceryList.get(i));
        }
    }

            //Replacing Items with new ones;
    public void modifyGroceryItem(String currentItem, String newItem) {

        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }

    }
    private void modifyGroceryItem(int position, String item){
        groceryList.set(position,item);
        System.out.println("Grocery item "+(position)+" has been modified. New item Added: "+item);

    }

            //Removing items From the List;
    public void removeGroceryItem(String newItem){
        int position = findItem(newItem);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        String item = groceryList.get(position);
        groceryList.remove(item);
        System.out.println(item+" Item at has been Removed from the List.");

    }

            //Searching items in the list;
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
       /* boolean exist = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);//Returns the index of the item or -1 if not found;

        if (position >= 0){
            return groceryList.get(position);
        }
        return null;
        */
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);

        //noinspection RedundantIfStatement
        if (position >= 0){
            return true;
        }

        return false;
    }
}