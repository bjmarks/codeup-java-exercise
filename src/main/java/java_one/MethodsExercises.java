package java_one;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("Addition is " + Addition(2,5));
        System.out.println("Subtraction is " + Subtraction(5,2));
        System.out.println("Multiplication is " + Multiplication(5,5));
        System.out.println("MultiplicationLoop is " + MultiplicationLoop(5,7));
        System.out.println("Division is " + Division(0, 1));
        System.out.println("Modulus is " + Modulus(5, 57));
        System.out.println("Recursion is " + Recursion(5,5));
        System.out.println("getInterval is " + getInteger(1, 10));
        System.out.println("Factorial is " + Factorial(5));
        Reroll(1,6);
        HighLow();
        TextBasedGame();
    }
    public static int Addition(int x, int y) {
        return x + y;
    }
    public static int Subtraction(int x, int y) {
        return x - y;
    }
    public static int Multiplication(int x, int y) {
        return x * y;
    }
    public static int MultiplicationLoop(int x, int y) {
        int z = 0;
        for (int i = 0; i < x; i++) {
            z +=y;
        }
        return z;
    }
    public static int Recursion(int x, int y) {
        if (y > 0) {
            return x + Recursion(x, y - 1);
        } else {
            return 0;
        }
    }
    public static int Division(int x, int y) {
        return x / y;
    }
    public static int Modulus(int x, int y) {
        return x % y;
    }
    public static int getInteger(int min, int max) {
        int track  = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 10: ");
            int userInput = scanner.nextInt();

            if (userInput >= min && userInput <= max) {
                System.out.println("Number is in range");
                System.out.println(userInput);
                track = 1;
            } else {
                System.out.println("Number not in range");
            }
        } while (track == 0);
        return track;
    }
    public static int Factorial(int x) {
        int y = 1;
        for (int i = 1; i <= x; i++){
            y = y * i;
        }
        return y;
    }

    public static void Reroll(int NoD, int DF) {
        if (NoD <= 0){
            System.out.println("can't roll negative dice");
        }
        else {
            for (int i = 1; i <= NoD; i++) {
                System.out.println("roll #" + i + " is #" + Math.round(Math.random() * DF));
            }
        }
    }
    public static void HighLow() {
        int Rand = (int) (Math.round(Math.random()*99) + 1);
        int track = 0;
        do {
            System.out.println((5 - (track)) + " Guesses left");
            Scanner scanner = new Scanner(System.in);
            System.out.println("user to guess the number between 1-100");
            int userInput = scanner.nextInt();
            if (userInput > Rand) {
                System.out.println("Guess lower");
                track++;
            } else if (userInput < Rand) {
                System.out.println("Guess Higher");
                track++;
            } else {
                System.out.println("Guess is Correct");
                track = 5;
            }
        }
        while (track < 5);
    }

    public static void TextBasedGame() {
        int coins = 0;
        int levels = 1;
        int strength = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You Enter a Dungeon and See two Doors which door do you enter");
        System.out.println("Door: 1 OR Door: 2 ?");
        int userInput = scanner.nextInt();
        if (userInput == 1){
            System.out.println("you encounter a lvl 2 devil with 4+ strength");
            System.out.println("Do you fight it? \t \t Yes: 1 \t No: 2");
            userInput = scanner.nextInt();
            if (userInput == 1){
                System.out.println("you fought and beat the devil");
                System.out.println("Do you want the levels or reward? \t \t level: 1 \t reward: 2");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    System.out.println("you Chose level");
                    levels++;
                    System.out.println("your level is now " + levels);
                }
                if (userInput == 2){
                    System.out.println("you Chose reward");
                    coins = coins + 500;
                    strength++;
                    System.out.println("you gained " + 500 + " coins, your current currency is" + coins);
                    System.out.println("your current strength is " + strength);
                }
            }
            if (userInput == 2){
                System.out.println("Devil caught you and killed you die");
                TextBasedGame();
            }
        }
        if (userInput == 2){
            System.out.println("Do you want to look for trouble?: 1");
            System.out.println("Do you want to look for treasure?: 2");
            userInput = scanner.nextInt();
            if (userInput == 1){
                System.out.println("you encounter a lvl 2 devil with 4+ strength");
                System.out.println("Do you fight it? \t \t Yes: 1 \t No: 2");
            }
            if (userInput == 2){
                System.out.println("Do you want to look for trouble?: 1");
                System.out.println("Do you want to look for treasure?: 2");
            }
        }
        else {
            System.out.println("Can't do that");
        }
    }
}

/*
Using what you've learned so far in the Java I module,
we're going to create a classic text-based RPG game.
These types of online role-playing games date back to the 70's and solely rely on a text-based interface.
In this case, we'll be using Java to run this game in our console.
The idea is that your game will prompt the user, who will then input answers through the console (using the Scanner class).
How the game changes depending on their answer is completely up to you!
Below are a list of suggested features to get you started:
Ask if the user is ready to start. If they type in "yes", start the game.
Ask the user for their name. Store this as a variable to personalize the adventure.
A classic RPG will have the hero going through different scenarios and battling their enemies.
Display enemy stats and hero stats. Properties and values can be assigned by you.
For example: Health, Attack Points, etc.
Decide on what actions your hero can take.
Attack (decreases enemyHealth)
Drink potion (adds to heroHealth)
Run? (ends the game)
Keep asking for user input until the enemyHealth reaches 0, then end the game.
Bonuses
Allow the user to specify hero stats and enemy stats.
Automate an enemyAttack after each time the hero takes a turn.
End the game if either heroHealth or enemyHealth drops to 0.
Indicate how many potions your hero starts with. Decrement this number each time 'Use Potion' action is used.
Remember that these are only suggestions. Feel free to get creative and have fun!!
* */
