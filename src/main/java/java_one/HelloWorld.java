package java_one;

public class HelloWorld {
    public static void main(String[] args) {
        // first lesson
        System.out.println("Hello World");
        System.out.print("Hello ");
        System.out.print("World!");
        // next lesson
        int myFavoriteNumber = 69;
        System.out.println(myFavoriteNumber);
        String myString = "My favorite Number is ";
        System.out.println(myString);
        double myNumber = 3.14;
        System.out.println(myNumber);
        System.out.print("\t" + myFavoriteNumber);
        System.out.print("\n" + myString + "\n");
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);
//        int class;
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";
//        x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;

    }
}
/*
Bonus

Build the project from the command line:

Open a terminal and navigate to your project.
Change directories into the src directory. You should see your HelloWorld.java file here.
Run the following command to compile your Java file

javac HelloWorld.java
View the contents of the directory again. You should now see a file named HelloWorld.class (this is the compiled Java bytecode).
Run your program with the following command

java HelloWorld
This process is part of what IntelliJ does when we press the "Run" button.
This can start to get very complex very quickly as we start to introduce multiple
Java files, multiple packages, and external libraries. For the rest of the course,
we will be using IntelliJ to compile and run our applications, but it is good to have an idea of what is going on behind the scenes.
 */