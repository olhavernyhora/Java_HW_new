package homework5;

import java.util.Arrays;

public class AddTask1 {
    public static void main(String[] args) {
        int[] array = createArrayIntegers(5);
        System.out.println("Your array is  " + Arrays.toString(array));
        System.out.println("Arithmetic average of the array is  " + countAvg(array));
        countElements(array);
    }
    static int[] createArrayIntegers(int size) {
        if (size <= 0){
            System.out.println("Incorrect number of elements for an array ");
            System.exit(0);
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) - 15;
        }
        return array;
    }

    static int countAvg(int [] array){
        int length = array.length;
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum/length;
    }

    static void countElements(int [] array){
        int counter = 0;
        int arithmeticAvg = countAvg(array);
        for (int value : array) {
            if (value > arithmeticAvg){
                counter += 1;
            }
        }
        System.out.println("Number of elements that are greater than Arithmetic average is  " + counter);
    }
}

