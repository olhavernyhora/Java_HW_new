package homework5;

import java.util.Arrays;

public class AddTask2 {
    public static void main(String[] args) {
        int[] array1 = createArrayIntegers(4);
        int[] array2 = createArrayIntegers(8);
        System.out.println("Chosen arrays are " + Arrays.toString(array1) +
                " and " + Arrays.toString(array2));
        int[] array3 = createArrayConcat(array1, array2);
        System.out.println("New array is " + Arrays.toString(array3));
    }


    static int[] createArrayIntegers(int size) {
        if (size <= 0) {
            System.out.println("Incorrect number of elements for an array ");
            System.exit(0);
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) - 15;
        }
        return array;
    }

    static int[] createArrayConcat(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        arr3 = Arrays.copyOf(arr1, arr3.length);
        int j = 0;
        for (int i = arr1.length; i < arr3.length; i++){
            arr3[i] = arr2[j];
            j++;
        }
        return arr3;
    }
}
