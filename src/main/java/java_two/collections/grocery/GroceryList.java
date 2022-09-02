package java_two.collections.grocery;
import util.Input;
import java.util.ArrayList;
import java.util.Collections;

public class GroceryList {
        public static final int PRODUCE = 1;
        public static final int MEATS = 2;
        private static final Input input = new Input();
        public static void main(String[] args) {
            if(!input.yesNo("Would you like to create a grocery list? (y/n) ")) {
                System.out.println("Bye");
                return;
            }
            else {
                ArrayList<GroceryItem> groceries = getGroceryListFromUser();
                printGroceryList(groceries);
                System.out.println("Done");
            }
        }
//        public static void groceries() {
//        while (true) {
//            String result = gui.message("add item to Grocery list");
//            if (result.equals("done")) {break;}
//            String quantiy = gui.message("how many?");
//            console.log(result + ": " + quantiy);
//                      }
//         }
        private static ArrayList<GroceryItem> getGroceryListFromUser() {
            ArrayList<GroceryItem> groceries = new ArrayList<>();
            while(true) {
                printGroceryCategories();
                int categoryNum = input.getInt(1, 2, "Enter the number of the category: ");
                System.out.print("Enter the name of the item: ");
                String itemName = input.getString();

                int itemQty = input.getInt(0, 10000, "Enter the quantity of the item: ");
                GroceryItem item = new GroceryItem(itemName, categoryNum, itemQty);
                groceries.add(item);
                if(!input.yesNo("Would you like to add another grocery item? (y/n) ")) {
                    return groceries;
                }
            }
        }
        private static void printGroceryCategories() {
            System.out.println("Grocery Categories:");
            System.out.println("1. Produce");
            System.out.println("2. Meats");
        }
        private static void printGroceryList(ArrayList<GroceryItem> groceries) {
            printGroceryListByCategory(PRODUCE, groceries);
            printGroceryListByCategory(MEATS, groceries);
        }
        private static void printGroceryListByCategory(int category, ArrayList<GroceryItem> groceries) {
            ArrayList<GroceryItem> categoryItems = new ArrayList<>();
            for(GroceryItem groceryItem : groceries) {
                if(groceryItem.getCategoryNum() == category) {
                    categoryItems.add(groceryItem);
                }
            }
            Collections.sort(categoryItems);
            if(category == PRODUCE) {
                System.out.println("PRODUCE:");
            } else {
                System.out.println("MEATS:");
            }
            System.out.println(categoryItems);
        }
    }