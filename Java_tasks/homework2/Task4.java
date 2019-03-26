package homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Please enter sum of deposite ->  ");
        Scanner sc = new Scanner(System.in);
        int dep = sc.nextInt();
        System.out.print("Please enter number of months for your deposite ->  ");
        int month = sc.nextInt();
        int interest = 15;
        float interestCalc = (float) interest/12/100*month;
        float profit = dep*interestCalc;

        System.out.println("Your profit will be:  " + profit + " UAH");
    }
}
