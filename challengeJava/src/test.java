public class test {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(reverse(35));
        System.out.println(8^2);
    }


    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int hcf = 1;

        for (int i = first < second ? first : second; i > 0; i--) {
            if (first % i == 0 && second % i == 0) {
                hcf = i;
                break;
            }
        }
        return hcf;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int digits = 1;

        while (number > 9) {
            number /= 10;
            digits++;
        }

        return digits;
    }

    public static int reverse(int number) {
        if (number < 0) {
            return -1;
        }
        if (number < 10) {
            return number;
        }

        int reverse = 0;
        int digit=1;

       for (int i = getDigitCount(number)-1; i >0; i--)
       {
           digit*=10;
       }

        while (number > 0) {
            reverse += (number % 10) * 10 ^ (getDigitCount(number) - 1);
            number /= 10;
        }

        return reverse;

    }
}