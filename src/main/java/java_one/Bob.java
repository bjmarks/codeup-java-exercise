package java_one;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's up?\n");
        String input = scanner.next();
        if (input.endsWith("?")){
            System.out.print("Sure");
        }
        else if(input.endsWith("!")){
            System.out.print("Whoa, chill out!");
        } else if (input.endsWith(".")) {
            System.out.print("Fine be that way!");
        }
        else{
            System.out.print("Whatever");
        }
    }
}
