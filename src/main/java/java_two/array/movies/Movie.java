package java_two.array.movies;

public class Movie {
    private String name;
    private String Category;
    //constructor
    public Movie(String name, String category) {
        this.name = name;
        Category = category;
    }
    //toString
    @Override
    public String toString() {
        return Category + "\t---\t" + name;
    }
    //accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
