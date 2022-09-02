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
 */