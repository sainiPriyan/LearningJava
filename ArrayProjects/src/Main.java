import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int [] intArray = new int[10];
        intArray[5] = 10;
        intArray[2] = 1;

        System.out.println("2nd element of the array is "+intArray[1]+" and " +
                "the 6th one is "+ intArray[5]);
        System.out.println("------------------------------------------");
        double[] doubleArray = new double[10];
        doubleArray[0] = 4.5;
        doubleArray[1] = 4;
        doubleArray[9] = (double)22/7;

        System.out.println("1st - "+doubleArray[0]+
                "\n2nd - "+doubleArray[1]+"\n10th - "+doubleArray[9]);

        System.out.println("------------------------------------------");

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first element = "+firstTen[0]);
        int firstTenLength = firstTen.length;
        System.out.println("Length of the array = "+firstTenLength);
        System.out.println("Last element = "+firstTen[firstTenLength-1]);

        System.out.println("------------------------------------------");

         int[] newArray;
        //newArray =new int[] {5,4,3,2,1};
        newArray =new int[5];

        for(int i = 0; i<newArray.length; i++){
            newArray[i] = newArray.length-i;
        }

//        for(int i = 0; i<newArray.length; i++){
//            System.out.println(i+1+" element is = "+newArray[i]);
//        }

        for (int element : newArray){
            System.out.println("-> "+element);
        }
        System.out.println("------------------------------------------");

        System.out.println(Arrays.toString(newArray));

        Object object = newArray;

        if(object instanceof int[])
            System.out.println("object is really an int array!");

        Object[] objectArray = new Object[4];

        objectArray[0] = "Hello World!";
        objectArray[1] = new StringBuilder("cat");
        objectArray[2] = 99;
        objectArray[3] = intArray;

        //System.out.println(Arrays.toString(objectArray));
        
        System.out.println(ArrayMethods.toString(objectArray));





    }
}
