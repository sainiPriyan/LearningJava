public class NextMain {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A","Jaw");
        movie.watchMovie();

        Adventure jaw = (Adventure) Movie.getMovie("A","Jaw");
       /* The method getMovie provides a Movie, but we defined jaw as Adventure and even-though
        it will return an Adventure type Movie, it will still cause a compile time error.
        To solve this problem we can cast it to Adventure, if we are sure that it will
        return Adventure. */
        jaw.watchMovie();

        Adventure jaw2 = (Adventure) Movie.getMovie("A","Jaw2");
        /* But if it returns another type instead the one that we cast it into, we will be
        able to compile it, but we will get a runtime exception */
        jaw2.watchMovie();


        Object comedy = Movie.getMovie("C","Airplane");
        Movie comedyMovie = (Comedy)comedy;
        comedyMovie.watchMovie();

        var airplane = Movie.getMovie("C","Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Plane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S","Star wars");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        }
        else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        }

        else if (unknownObject instanceof ScienceFiction sifi) {
            sifi.watchSiFi();
        }


    }


}
