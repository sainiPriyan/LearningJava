import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {



        int[] array = randomArray(10);
        System.out.println(Arrays.toString(array));

//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        for (int i = 0; i<length/2;i++){
//            int temp;
//
//            temp = array[i];
//            array[i] = array[length-1-i];
//            array[length-1-i] = temp;
//        }
            int[] array2 = array.clone();
            System.out.println("Method 1 - "+Arrays.toString(descendingSort(array)));
            System.out.println("-------------------------------");
            System.out.println("Method 2 - "+Arrays.toString(descendingSort2(array2)));

        }

    public static int[] randomArray(int size){
        Random random = new Random();
        int[] array = new int[size];

        for(int i = 0;i<size;i++){
            array[i] = random.nextInt(101);
        }
return array;
    }

    public static int[] descendingSort(int[] array){
    int counter = 1;
    int length = array.length;
        for (int j = 0; j < length-1; j++) {
            for (int i = 0; i < length - 1 - j; i++) {
                int temp;
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    System.out.println("Method 1, Iteration number - "+counter+" "+Arrays.toString(array));
                    counter++;
                }
            }
        }
        return array;
    }

    public static int[] descendingSort2(int[] array){
        int counter = 1;
        int temp;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i<array.length-1;i++){
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                    System.out.println("Method 2, Iteration number - "+counter+" "+Arrays.toString(array));
                    counter++;
                }

            }
        }
    return array;}
}
