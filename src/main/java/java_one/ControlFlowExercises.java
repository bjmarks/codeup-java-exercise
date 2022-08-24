package java_one;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while(i <= 15) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\n do-while: ");
        i = 2;
        do {
            System.out.print(i + " ");
            i = (int) Math.pow(i, 2);
        }while (i <= 1000000);
        System.out.print("\n for loop: ");
        for (i = 2; i < 1000000; i = (int) Math.pow(i, 2)){
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for (i = 1; i <= 100; i++){
            System.out.print("\n" + i + ".");
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.print("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.print("Fizz");
            }
            else if(i % 5 == 0){
                System.out.print("Buzz");
            }
        }
        System.out.print("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to go up to?");
        String table = scanner.next();
        System.out.printf("%s \n Here is your table! \n", table);
        int num = parseInt(table);
        for (i = 1; i <= num; i++) {
            System.out.printf("%s\t%s\t%s\n", i, Math.pow(i,2), Math.pow(i,3));
        }
        System.out.print("\n");
        System.out.print("What number was your grade (0-100)?\n");
        String grade = scanner.next();
        int range = parseInt(grade);
        if (range <= 50){
            System.out.print("your letter grade is F-");
        }
        else if(range <= 55){
            System.out.print("your letter grade is F");
        }
        else if (range <= 59){
            System.out.print("your letter grade is F+");
        }
        else if (range <= 64){
            System.out.print("your letter grade is D-");
        }
        else if (range <= 69){
            System.out.print("your letter grade is D");
        }
        else if (range <= 72){
            System.out.print("your letter grade is C-");
        }
        else if (range <= 75){
            System.out.print("your letter grade is C");
        }
        else if (range <= 79){
            System.out.print("your letter grade is C+");
        }
        else if (range <= 82){
            System.out.print("your letter grade is B-");
        }
        else if (range <= 85){
            System.out.print("your letter grade is B");
        }
        else if (range <= 89){
            System.out.print("your letter grade is B+");
        }
        else if (range <= 92){
            System.out.print("your letter grade is A-");
        }
        else if (range <= 96){
            System.out.print("your letter grade is A");
        }
        else if (range <= 99){
            System.out.print("your letter grade is A+");
        }
        else if (range == 100){
            System.out.print("your letter grade is A++");
        }
    }
}
