public class StringMethods {
    public static void main(String[] args) {

        String birthDate = "25/04/2005";
        int startingIndex = birthDate.indexOf("2005"); //returns index from where '2005' in birthDate is starting
        System.out.println("Starting Index = "+ startingIndex);
        System.out.println("Birth year = "+birthDate.substring(startingIndex)); // returns substring of string birthDate starting froms starting index

        System.out.println("Birth Month = "+birthDate.substring(3,5)); // (starting index, ending index)

        String newDate = String.join("/","25","04","2005");
        System.out.println("New Date = "+newDate);

        String newDate2 = "25";
        newDate2 = newDate2.concat("/");
        newDate2 = newDate2.concat("04");
        newDate2 = newDate2.concat("/");
        newDate2 = newDate2.concat("2005"); // this concat method is highly inefficient and not recommended
        System.out.println("New date again = "+ newDate2);

        newDate2 = "25" + "/" + "04" + "/" + "2005";
        System.out.println("new Date = "+newDate2);

        newDate2 = "25".concat("/").concat("04").concat("/").concat("2005"); //this is called method chaining
        System.out.println("New Date = "+newDate2);

        System.out.println(newDate2.replace('/','-')); //replacing '/' to '-'

        System.out.println(newDate2.replaceFirst("2","00")); //replacing first 2 to 00 (sequence of char getting replaced to another sequence of char)

        System.out.println(newDate2.replaceAll("/","---"));

        System.out.println("-".repeat(20));
        System.out.println("\nABC".repeat(3).indent(8));
        System.out.println("-".repeat(20));
        System.out.println("\n     ABC".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
