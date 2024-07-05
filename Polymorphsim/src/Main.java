import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//            Movie theMovie = new Adventure("Star Wars");
//            theMovie.watchMovie();
//
//            Movie anotherMovie = new Comedy("LOL");
//            anotherMovie.watchMovie();

//        Movie theMovie = Movie.getMovie("SciFi","Star Wars");
//        theMovie.watchMovie();

        Scanner scanner  = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a type (A for adventure, C for comedy," +
                    " S for science fiction, Q for quiting)");
            String type = scanner.nextLine();

            if ("Qq".contains(type)) break;

            System.out.println("Enter Movie title");
            String title = scanner.nextLine();

            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();

        }



    }
}
