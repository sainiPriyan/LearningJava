import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        System.out.println(Arrays.toString(reverse(new int[] {1,2,3,4,5,6,7,8,9,10})));
        System.out.println("-".repeat(50));
        System.out.println(Arrays.toString(reverse2(new int[] {1,2,3,4,5,6,7,8,9,10})));
    }

    private static int[] reverse(int[] array){
        int temp;
        for (int i = 0; i<array.length/2;i++){
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        return array;
    }

    private static int[] reverse2(int[] array){
        int[] reveredArray = array.clone();

        int i = array.length-1;
        for(int element : array){
            reveredArray[i--] = element;
        }
        return reveredArray;
    }

}
