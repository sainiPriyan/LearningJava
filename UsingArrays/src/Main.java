import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        int[] array = getRandomArrays(10);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("-----------------------------------");

        int[] array2 = new int[10];
        System.out.println(Arrays.toString(array2));
        Arrays.fill(array2,5);
        System.out.println(Arrays.toString(array2));

        System.out.println("-----------------------------------");

        int[] array3 = getRandomArrays(10);
        int[] array4 = Arrays.copyOf(array3,5);

        System.out.println(Arrays.toString(array3));

        System.out.println(Arrays.toString(array4));
        Arrays.sort(array4);
        System.out.println(Arrays.toString(array4));

        int[] array5 = Arrays.copyOf(array3,15);

        System.out.println(Arrays.toString(array5));
        Arrays.sort(array5);
        System.out.println(Arrays.toString(array5));

        System.out.println("-----------------------------------");

        String[] sArray = {"Able","Jane","Mark","Ralph","David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));

        if(Arrays.binarySearch(sArray,"Mark")>=0)
        {
            System.out.println("Found Mark in the list!");
        }
        System.out.println("-----------------------------------");

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {0,1,2,3,4,5};

        if (Arrays.equals(s1,s2))
            System.out.println("Arrays are equal!");
        else System.out.println("They are not equal!");



    }


    private static int[] getRandomArrays (int length){
        Random random = new Random();
        int[] array = new int[length];

        for(int i = 0;i<length;i++){
            array[i] = random.nextInt(11); //random number between 0 and 99 (not 100)
        }
        return array;
    }
}
