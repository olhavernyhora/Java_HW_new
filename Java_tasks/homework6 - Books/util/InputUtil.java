package com.epam.util;

import com.epam.view.ViewBooks;

import java.util.Scanner;

public class InputUtil {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt(){
        int size = sc.nextInt();
        while (size <= 0){
            ViewBooks.printMessage(ViewBooks.WRONG_INPUT, ViewBooks.ENTER_NUMBER);
            size = sc.nextInt();
        }
            return size;
    }

    public static String inputAuthor(){
        sc.nextLine();
        return sc.nextLine();
    }

    public static double inputPercent(){
        double percent = sc.nextDouble();
        while (percent < -100 || percent > 100 ){
            ViewBooks.printMessage(ViewBooks.WRONG_INPUT, ViewBooks.ENTER_DISCOUNT);
            percent = sc.nextDouble();
        }
        return percent;
    }
}
