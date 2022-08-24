package java_two.grocery;

import java_two.util.Input;

import java.util.ArrayList;
import java.util.Collections;


// public class GroceryList {
//    private static Input input = new Input();
//    public static void groceries() {
//        while (true) {
//            String result = gui.message("add item to Grocery list");
//            if (result.equals("done")) {break;}
//            String quantiy = gui.message("how many?");
//            console.log(result + ": " + quantiy);
//        }
//    }
//
//    public static void main(String[] args) {
//        if(!input.yesNo("Would you like to create a Grocery list")){
//            System.out.println("bye");
//            return;
//        }
//        groceries();
//        System.out.println("done");
//    }
//}
public class GroceryList {
        public static final int PRODUCE = 1;
        public static final int MEATZ = 2;

        private static Input input = new Input();

        public static void main(String[] args) {
            // A user should be prompted if they would like to create a grocery list.
            if(input.yesNo("Would you like to create a grocery list? (y/n) ") == false) {
                System.out.println("Bye");
                return;
            }

            // ask user to keep inputting items until they are done
            ArrayList<GroceryItem> groceries = getGroceryListFromUser();

            // if we got here, then user is done inputting items
            printGroceryList(groceries);

            System.out.println("Done");
        }
        private static ArrayList<GroceryItem> getGroceryListFromUser() {
            ArrayList<GroceryItem> groceries = new ArrayList<>();

            // keep asking user to input items until he/she says done
            while(true) {
                printGroceryCategories();

                int categoryNum = input.getInt(1, 2, "Enter the number of the category: ");

                System.out.print("Enter the name of the item: ");
                String itemName = input.getString();

                int itemQty = input.getInt(0, 10000, "Enter the quantity of the item: ");

                // now that we have the 3 pieces of info for item, make the item
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
            System.out.println("2. Meatz");

        }

        private static void printGroceryList(ArrayList<GroceryItem> groceries) {
            // 1. for each category
            printGroceryListByCategory(PRODUCE, groceries);
            printGroceryListByCategory(MEATZ, groceries);
        }

        private static void printGroceryListByCategory(int category, ArrayList<GroceryItem> groceries) {
            // 2. fetch the grocery items for that category
            ArrayList<GroceryItem> categoryItems = new ArrayList<>();

            for(GroceryItem groceryItem : groceries) {
                if(groceryItem.getCategoryNum() == category) {
                    categoryItems.add(groceryItem);
                }
            }
            // at this point, categoryItems has the grocery items for the given category

            // 3. sort them alphabetically
            Collections.sort(categoryItems);

            // 4. print them w quantity
            if(category == PRODUCE) {
                System.out.println("PRODUCE:");
            } else {
                System.out.println("MEATZ:");
            }
            System.out.println(categoryItems);
        }


    }
/*
*
*
*
* Grocery List App

Create a grocery list command line application. You will use your input class from previous exercises.

A user should be prompted if they would like to create a grocery list.
If they pick yes, they will be prompted if they would like to enter a new item.
If the users picks yes, they should be given the following three prompts:
Given an ordered list of grocery categories to choose from, select the category.
Enter the name of the item.
Enter how many of the item.
The user will then be given the choice to finalize the list or add an item.
Once the user finalizes the list, they will be presented with a complete list organized alphabetically and grouped by a category, and including quantity.
As a bonus, allow users to filter the results by only one category of items at a time.
For a super gold star bonus, allow users to edit the list items.
Consider before coding how the data should be organized. Using ArrayLists and HashMaps will be helpful.

This is a new bit of syntax that shows us how Java defines generics, which let us specify a type for another container class to hold. We won't go into too much detail on generics, but the short explanation is that they allow us make sure all our operations are type-safe, without having to create separate classes for an ArrayList of Integers, an ArrayList of Doubles, an ArrayList of Booleans, and so on. Instead, we define one generic class. ↩

Because collection elements must be objects, not primitive types, Java provides us with "wrapper" classes around the primitive types that essentially turn them into objects. The Integer class you see above is one example, and there are similar classes for the other primitive types.

Usually you won't have to worry about the details of converting back and forth between, for example, an int or an Integer as Java takes care of this for us through a process known as autoboxing and unboxing.

When you use a primitive type with one of Java's collection classes, just be sure to use the class (Integer), and not the primtive type (int). *
*
*
*/