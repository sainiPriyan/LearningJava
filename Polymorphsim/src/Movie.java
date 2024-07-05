public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }
     public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
         System.out.println(title+" is a "+ instanceType+" film");
     }

     public static Movie getMovie(String type, String title) {

        return switch(type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
        default -> new Movie(title);
        };
     }
}

class Adventure extends Movie {
    private String title;
    public Adventure(String title) {
        super(title);
        this.title = title;
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"Pleasant Scene","Scary Music","Something Bad Happens");
    }
    public void watchAdventure() {
        System.out.println("Watching an Adventure Movie named "+ title );
    }


}
class Comedy extends Movie {

    private String title;
    public Comedy(String title) {
        super(title);
        this.title = title;
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"Funny","More Funny","Happy Ending");
    }

    public void watchComedy() {
        System.out.println("Watching a Comedy Movie named "+ title );
    }


}
class ScienceFiction extends Movie {
    private String title;
    public ScienceFiction(String title) {
        super(title);
        this.title = title;
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"Bad Aliens","Fighting","Planet Blows UP");
    }
    public void watchSiFi() {
        System.out.println("Watching an SiFi Movie named "+ title );
    }


}