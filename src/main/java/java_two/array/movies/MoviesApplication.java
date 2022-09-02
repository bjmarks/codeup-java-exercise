package java_two.array.movies;

import util.Input;

public class MoviesApplication {
    public static final int INVALID_CHOICE = -1;
    public static final int EXIT_CHOICE = 0;
    private static Movie [] movies;
    public static void main(String[] args) {
        movies = MoviesArray.findAll();
        doChoice(6);
        Input input = new Input();
        // loop until the user says he/she does not wish to continue
        int choice = INVALID_CHOICE;
        while(choice != EXIT_CHOICE) {
            printMenu();
            choice = input.getInt(-1, 7);
            doChoice(choice);
        }
    }
    private static void printMenu() {
        System.out.print("""
                What would you like to do?
                                
                0 - exit
                1 - view all movies
                2 - view movies in the musical category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category
                6 - view movies in the animated category
                Enter your choice: """);
    }
    private static void doChoice(int choice) {
        // TODO: call your functions based on whatever the user's choice is
        switch(choice) {
            case 1:
                printMoviesByCatagories("all");
                break;
            case 2:
                // TODO: view movies in the musical category
                printMoviesByCatagories("musical");
                break;
            case 3:
                // TODO: view movies in the drama category
                printMoviesByCatagories("drama");
                break;
            case 4:
                // TODO: view movies in the horror category
                printMoviesByCatagories("horror");
                break;
            case 5:
                // TODO: view movies in the scifi category
                printMoviesByCatagories("scifi");
                break;
            case 6:
                // TODO: view movies in the anime category
                printMoviesByCatagories("animated");
                break;
            default:
                break;
        }
    }

    private static void printMoviesByCatagories(String catagories) {
        for (Movie movie : movies){
            if(movie.getCategory().equals(catagories) || catagories.equals("all")){
                System.out.println(movie);
            }
        }
    }
}
