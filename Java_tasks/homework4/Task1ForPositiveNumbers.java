package homework4;

import java.util.Scanner;

public class Task1ForPositiveNumbers {
    static String convertToBianiry (int inputNumber){
        String binary = "";
        final int BINARY_DEV = 2;
        if (inputNumber < 0) {
            binary = "You entered invalid number  ";
        } else {
            while (inputNumber > 0){
                binary = (inputNumber % BINARY_DEV) + binary;
                inputNumber = inputNumber / BINARY_DEV;
            }
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a positive number:  ");
        int inputNumber = sc.nextInt();
        String binary = convertToBianiry(inputNumber);
        System.out.println("Your number is " + binary);
    }
}
