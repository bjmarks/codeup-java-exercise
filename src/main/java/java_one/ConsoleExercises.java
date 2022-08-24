package java_one;

import java.util.Date;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s.", pi);
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String nextInt = scanner.next();
        System.out.printf("You entered: %s \n", nextInt);
        Date now = new Date();
        System.out.println(now);
        System.out.println();
        scanner.nextLine();
        System.out.print("enter three words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("Your first word is %s\n second word is %s \n and third word is %s \n",firstWord,secondWord,thirdWord);
        scanner.nextLine();
        System.out.println("Please enter the length and width: ");
        String width = scanner.nextLine();
        int number1 = parseInt(width);
        String height = scanner.nextLine();
        int number2 = parseInt(height);
        int total = number1 * number2;
        System.out.printf("The perimeter: %d \n", total);
    }
}

//        In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.
//        The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
//        scanner.useDelimiter("\n");
//        How does this change the way your program operates?
//        Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.