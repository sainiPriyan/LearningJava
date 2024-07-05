public class anotherOverloadingChallenge {

    public static void main(String[] args)
    {
System.out.println(getDurationString(900));
System.out.println(getDurationString(59,100));
    }

    public static String getDurationString (int seconds)
    {
        if (seconds>=0){
int minutes = seconds/60;
int remainingSec = seconds%60;
return getDurationString(remainingSec,minutes);
        }
        else return "Seconds must be positive.";

    }

    public static String getDurationString (int seconds,int minutes)
    {
        if (seconds < 60 && seconds >=0 && minutes >=0 ) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            return hours + "h "+remainingMinutes+"m "+seconds+"s";
        }
        else return  "Seconds must be less than 60, both seconds and minutes must be positive.";
    }

}
