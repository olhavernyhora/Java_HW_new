package homework5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int [] arr = createArrayIntegers(getArraySize());
        System.out.println("Your Array ->  " + Arrays.toString(arr));
        reverseArray(arr);
    }

    static int[] createArrayIntegers(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) - 15;
        }
        return array;
    }

    static int getArraySize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number greater than 0 -> ");
        try {
            int num = sc.nextInt();
            if (num <= 0) {
                System.out.println("You entered invalid number");
                System.exit(0);
            }
            return num;

            /* Not sure if this is a correct way to stop User from entering
            * symbols, that's why used this method only in the first task*/
        } catch (InputMismatchException ex) {
            System.out.println("You entered incorrect data.");
        }
        return getArraySize();
    }

    static void reverseArray(int[] arr){
        System.out.print("Reversed array will look like this ->  ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

