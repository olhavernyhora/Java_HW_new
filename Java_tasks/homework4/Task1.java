package homework4;

import java.util.Scanner;

public class Task1 {
    static String convertToBianiry (int inputNumber){
        String binary = Integer.toBinaryString(inputNumber);
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any number ->  ");
        int inputNumber = sc.nextInt();
        String binary = convertToBianiry(inputNumber);
        System.out.println("Your number is " + binary);
    }
}