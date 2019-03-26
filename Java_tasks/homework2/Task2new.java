package homework2;

import java.util.Scanner;

public class Task2new {
    public static void main(String[] args) {
        System.out.print("Please enter number of pounds ->  ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int numberofgrinkg = 1000;
        double gram = number*453.6/numberofgrinkg;
        int kg = (int)gram;
        int gram1 = (int) ((gram - kg)*numberofgrinkg);

        System.out.println("Indicated weight is " + kg + " kg and " + gram1 + " gram" );
    }
}

