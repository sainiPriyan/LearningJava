public class enhancedSwitchChallenge {
    public static void main(String[] args)
    {
printDayOfWeek(10);
printDayOfWeekIf(3);
    }
public static void printDayOfWeek(int day)
{
    String dayOfWeek = switch (day) {
        case 0 -> "sunday";
        case 1 -> "monday";
        case 2 -> "tuesday";
        case 3 -> "wednesday";
        case 4 -> "thursday";
        case 5 -> "friday";
        case 6 -> "saturday";
        default ->"invalid day";
    };
System.out.println("day of week is "+dayOfWeek);
    }
    public static void printDayOfWeekIf (int day){
        if(day==0){System.out.println("sunday");}
        else if (day==1){System.out.println("monday");}
        else if (day==2){System.out.println("tuesday");}
        else if (day==3){System.out.println("wednesday");}
        else if (day==4){System.out.println("thursday");}
        else if (day==5){System.out.println("friday");}
        else if (day==6){System.out.println("saturday");}
        else System.out.println("invalid day");

    }


}




