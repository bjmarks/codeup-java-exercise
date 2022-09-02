package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    private String que;

    public String getString() {
        return scanner.nextLine();
    }
    public boolean yesNo() {
        String userInput = getString();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    }
    public boolean yesNo(String Que) {
        System.out.println(Que);
        String userInput = getString();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }
    public int getInt(){
        while (true) {
            String userInput = getString();
            try {
                return Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("NaN");
            }
        }
    }
    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt <= min || userInt >= max){
            System.out.println("int is not between" + min + " and " + max);
            userInt = getInt(min, max);
        }
        return userInt;
    }
    public int getInt(int min, int max, String que) {
        int userInt = getInt();
        System.out.println(que);
        if (userInt < min || userInt > max){
            System.out.println("int is not between" + min + " and " + max);
            userInt = getInt(min, max);
        }
        return userInt;
    }
    public String getIntAsString(int num){
        return String.valueOf(Integer.valueOf(num));
    }
    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble <= min || userDouble >= max){
            System.out.println("int is not between" + min + " and " + max);
            userDouble = getDouble(min, max);
        }
        return userDouble;
    }

    public double getDouble() {
        String userInput = getString();
        try {
            return Double.parseDouble(userInput);
        } catch (NumberFormatException e) {
            System.out.println("NaN");
        }
        return getDouble();
    }
    public double getDouble(String Question){
        System.out.println(Question);
        return getDouble();
    }
    public String getDoubleAsString(double num){
        return String.valueOf(Double.valueOf(num));
    }
    public String useDelimiter(String que, String limit ) {
        System.out.println(que);
        String returner = String.valueOf(scanner.useDelimiter(limit));
        return returner;
    }
}

/*
Note these methods will throw a NumberFormatException if the given input cannot be parsed as an int or double.
Your methods on the Input class should handle these exceptions, you can use a try-catch for this.
Use this functionality to create two new methods,
getBinary and getHex that will accept a string that is a number in binary or hexadecimal.
Enter a binary number: 111
Your number is 7
Enter a hexidecimal number: 10
Your number is 16
 */
