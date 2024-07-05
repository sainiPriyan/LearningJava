

public class switchStatement {

    public static void main(String[] args) {

        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("it was a 3 , 4 or a 5");
                System.out.println("actually it was a " + switchValue);
            }
            default -> System.out.println("Value was not 1, 2, 3, 4 or 5");
        }

        String month = "JANUARY";
        System.out.println(month+ " is in the "+getQuarter(month)+ " quarter.");

    }

    public static String getQuarter (String month){

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st";}
            case "APRIL", "MAY", "JUNE " -> "2nd";
            default ->{
                yield  month + " is bad";
        }
        };
    }








}
