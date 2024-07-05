public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex)
    {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >=0 && tonerLevel <=100)? tonerLevel : -1 ;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int toner) {
       int tonerAmount = toner;
        if (tonerAmount>100 || tonerAmount<0) return -1;
        else {
            tonerLevel += tonerAmount;
            return  tonerLevel;}
    }
    public int printPages(int pages) {
        if (duplex) {
            System.out.println("It is a duplex printer");

            double p = (double) pages/2 + 0.5 ;
            pagesPrinted += p;
            return  (int) p;
        }
        else {
            System.out.println("It is not a duplex printer");
            pagesPrinted+= pages;
            return  pages;}
    }



}
