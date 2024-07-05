public class Main {
    public static void main(String[] args) {

        Printer printer1 = new Printer(50,true);
        System.out.println("Initial page count: "+ printer1.getPagesPrinted());
        System.out.printf("Number of pages used : %d, Total Pages used: %d %n%n", printer1.printPages(5), printer1.getPagesPrinted());
        System.out.printf("Number of pages used : %d, Total Pages used: %d %n%n", printer1.printPages(14), printer1.getPagesPrinted());
        System.out.printf("Number of pages used : %d, Total Pages used: %d %n%n", printer1.printPages(15), printer1.getPagesPrinted());
        System.out.printf("Number of pages used : %d, Total Pages used: %d %n%n", printer1.printPages(7), printer1.getPagesPrinted());
    }
}
