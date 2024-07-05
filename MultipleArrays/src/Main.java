import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        int[][] array2 = new int[4][4];
//        System.out.println(Arrays.toString(array2));
//        System.out.println("Length of the array = "+ array2.length);
//
//        for (int[] ele : array2) {
//            for(var innerEle : ele){
//                System.out.print(innerEle + " ");
//            }
//            System.out.println();
//        }

        System.out.println(Arrays.deepToString(array2));
        System.out.println("-".repeat(50));

        for(int i = 0; i<4;i++){
            for(int j =0; j<4;j++){
                array2[i][j] = i*10+j+1;
            }
        }
        System.out.println(Arrays.deepToString(array2));
        System.out.println("-".repeat(50));

        Random random = new Random();

        for(int i = 0; i<4;i++){
            for(int j =0; j<4;j++){
                array2[i][j] = random.nextInt(101);
            }
        }
        System.out.println(Arrays.deepToString(array2));
        System.out.println("-".repeat(50));

        array2[1] = new int[] {10,20,30};
        System.out.println(Arrays.deepToString(array2));
        System.out.println("-".repeat(50));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[] {"one","two","three"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new int[][] {{1,2,3},{9,8,},{5}};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new boolean[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));
        System.out.println("-".repeat(50));
    }
}
