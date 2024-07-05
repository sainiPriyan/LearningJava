public class test {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1000,2));
    }
    public static int getDaysInMonth (int month, int year)
    {
        if(month>=1 && month<=12 && year>=1 && year <=9999)
        {
            if (year%4==0 && month == 2)
            {
                return 29;
            }

            else {
                switch (month){
                    case 1, 3, 5, 7, 8, 10, 12: return 31;
                    case 2: return 28;
                    case 4, 6, 9, 11: return 30;
                    default: return -1;


                }
            }
        }

        else return -1;
    }
}

