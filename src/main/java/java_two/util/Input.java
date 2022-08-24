package java_two.util;

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
    public static String getIntAsString(int num){
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
    public static String getDoubleAsString(double num){
        return String.valueOf(Double.valueOf(num));
    }
}
