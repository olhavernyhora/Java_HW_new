package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = createArrayIntegers(getArraySize());
        System.out.println("Your array is -> " + Arrays.toString(arr));
        numberOdd(arr);
        sumOdd(arr);
    }

    static int[] createArrayIntegers(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) - 15;
        }
        return array;
    }

    static int getArraySize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number greater than 0 -> ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("You entered invalid number");
            System.exit(0);
        }
        return size;
    }

    static void numberOdd(int[] array){
        int number = 0;
        for (int element: array) {
            if (element%2 != 0) {
                number += 1;
            }
        }
        System.out.println("Number of Odd digits in your array = " + number);
    }

    static void sumOdd(int[] array){
        int sum = 0;
        for (int element: array) {
            if (element%2 != 0) {
                sum += element;
            }
        }
        System.out.println("Sum of Odd digits in your array = " + sum);
    }
}
