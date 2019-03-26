package homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Please enter number of pounds ->  ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int kg = (int) (number*453.6/1000);
        float gram = (float) (number*453.6/1000);
        int gram1 = (int) ((gram - kg)*1000);

        System.out.println("Indicated weight is " + kg + " kg and " + gram1 + " gram" );
    }
}
