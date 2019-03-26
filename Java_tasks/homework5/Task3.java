package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int size = getArraySize();
        int[] array1 = createArrayIntegers(size);
        int[] array2 = createArrayIntegers(size);
        System.out.println("You arrays are:  " + Arrays.toString(array1) +
                "  and  " + Arrays.toString(array2));
        int[] array3 = sumOfArrays(array1, array2);
        System.out.println("New array is represented like this: " + Arrays.toString(array3));
    }
    static int getArraySize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number greater than 0 -> ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("You entered invalid number. " +
                    "Program is not able to create an array with such number of elements.");
            System.exit(0);
        }
        return size;
    }
    static int[] createArrayIntegers(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) - 15;
        }
        return array;
    }

    static int[] sumOfArrays(int[] array1, int[] array2){
        int[] sumArray = new int[array1.length];
        for(int i = 0; i < array1.length; i++){
            sumArray[i] = array2[i] + array1[i];
        }
        return sumArray;
    }

}
