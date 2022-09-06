package java_two.annotations;

import java_two.person.Person;
import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private final List<String> books;
    public Author(String name) {
        super(name);
        books = new ArrayList<>();
    }
    /**
     * @deprecated Use publishedBooks instead
     */
    @Deprecated
    public List<String> getBooks() {
        return books;
    }
    public List<String> publishedBooks() {
        return books;
    }
    public void addBook(String book) {
        books.add(book);
    }
    public String sortName() {
        return String.format("%s", getName());
    }
}
/*
It explains how to compile and execute the application for this exercise.
Verify that you get around 4 warnings and 1 error when you try to compile the project. Use the command explained in the README file. Do not forget to cleanup the out folder before a new compilation. The output might look like the following output depending of your Java version:

src/Author.java:31: error: method does not override or implement a method from a supertype
  @Override
  ^
Note: src/Main.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Note: src/Author.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error
Create a new branch named easy_fix.
Fix the error and commit.
Fix the warnings by using the annotation @SuppressWarnings.
Compile the application.
Run the application using the command explained in the README file.
Commit again.
Checkout master.
Create a new branch named better_fix.
Fix the error and commit again.
Fix the error without using the annotation @SuppressWarnings.
Compile the application.
Run the application.
Commit your final fix.
Push your 2 branches to GitHub.




















# Annotations exercise

# Installation

1. Fork this repository.
1. Clone your fork using IntelliJ.

## Configuration

IntelliJ compiles and executes our code from the terminal without our direct intervention. For this
exercise we will not use it, because it would *hide* the warnings that we want to fix. For this
exercise we will use the *terminal* instead.

### Compilation

To compile we will use the Java Compiler `javac`. `javac` generates the byte code used by the Java
Virtual Machine by creating files with the extension `.class`. Those `.class` files are the ones
executed by the JVM.

You will need to run the following command several times for the exercises in this lesson.

```
javac -d out/ src/*
```

In the previous command, the option `-d` specifies the directory where the `.class` files are going
to be saved, `out` for this example. `src/*` tells the compiler to compile all the `.java` files in
the `src` directory.

Sometimes the compiler produces unrelated error messages when there are existing `.class` files in
the output directory. In order to avoid this issue, it is very recommended to cleanup the `out`
directory before compiling.

```
rm out/*.class
```

### Execution

In order to execute a Java class you will use the `java` command as follows.

```
java -cp out/ Main
```

The option `-cp` tells Java where to look for the class to be executed, in this case the `out`
folder, which is where our `.class` files are. `Main` is the name of the class with the `main`
method.

## Finally

1. Follow the instructions in the curriculum.
1. Enjoy!

 */