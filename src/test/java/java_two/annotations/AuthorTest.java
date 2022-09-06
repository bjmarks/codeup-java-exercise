package java_two.annotations;

public class AuthorTest {
        @SuppressWarnings({"deprecation", "unchecked"})
    public static void main(String[] args) {
    Author author = new Author("Sandi Metz");
        author.addBook("Practical Object-Oriented Design in Ruby");
        author.addBook("99 Bottles of OOP");
        for (String book: author.getBooks()) {
        System.out.println(book);
    }
        Author author2 = new Author("Sandi Metz");
        author2.addBook("Practical Object-Oriented Design in Ruby");
        author2.addBook("99 Bottles of OOP");
        for (String book: author2.publishedBooks()) {
            System.out.println(book);
        }
    }
}



