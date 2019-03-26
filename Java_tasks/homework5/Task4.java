package homework5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] array1 = createArrayIntegers(getArraySize());
        System.out.println("Your array is " + Arrays.toString(array1));
        int[] arrPositive = arrayPositive(array1);
        int[] arrNegative = arrayNegative(array1);
        System.out.println("New arrays with positive and negative numbers from Arrayg1 are  " +
                Arrays.toString(arrPositive) + "  and  " + Arrays.toString(arrNegative));
    }

    static int getArraySize() {
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

    static int getNegativeLength(int[] array){
        int negativeLength = 0;
        for (int value : array) {
            if (value < 0){
                negativeLength += 1;
            }
        }
        return negativeLength;
    }

    static int[] arrayPositive(int[] array){
        int length = array.length - getNegativeLength(array);
        int j = 0;
        int[] arrPositive = new int[length];
        for (int i = 0; i < array.length; i++){
            if (array[i] >= 0){
                arrPositive[j] = array[i];
                j++;
            }
        }
        return arrPositive;
    }

    static int[] arrayNegative(int[] array){
        int length = getNegativeLength(array);
        int[] arrNegative = new int[length];
        int j = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < 0){
                arrNegative[j] = array[i];
                j++;
            }
        }
        return arrNegative;
    }
}