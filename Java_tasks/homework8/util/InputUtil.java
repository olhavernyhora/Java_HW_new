package com.epam.util;

import com.epam.validator.LibrarySizeLessThanZero;
import com.epam.validator.PercentageOutOfBound;
import com.epam.validator.SearchYearOutOfBound;
import com.epam.validator.Validator;
import com.epam.view.ViewBooks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {
    private static Scanner sc = new Scanner(System.in);

    public static int inputLibSize(){
        while (true){
            try { int size = sc.nextInt();
                Validator.validateLibrarySize(size);
                return size;
            }
            catch (LibrarySizeLessThanZero e){
                ViewBooks.printMessage(ViewBooks.WRONG_INPUT, e.getMessage());
            }
            catch (InputMismatchException ex) {
                ViewBooks.printMessage(ViewBooks.WRONG_INPUT, "Only numbers are allowed here");
                sc.next();
            }
        }
    }
    public static int inputSearchYear() {
        while (true) {
            try {
                int year = sc.nextInt();
                Validator.validateSearchYear(year);
                return year;
            } catch (SearchYearOutOfBound e) {
                ViewBooks.printMessage(ViewBooks.WRONG_INPUT, e.getMessage());
            } catch (InputMismatchException e) {
                ViewBooks.printMessage(ViewBooks.WRONG_INPUT, "Only numbers are allowed here");
                sc.next();
            }
        }
    }

    public static String inputAuthor(){
        sc.nextLine();
        return sc.nextLine();
    }

    public static double inputPercent() {
        while (true) {
            try {
                double percent = sc.nextDouble();
                Validator.validateDiscount(percent);
                return percent;
            } catch (PercentageOutOfBound e) {
                ViewBooks.printMessage(e.getMessage(), ViewBooks.ENTER_DISCOUNT);
            } catch (InputMismatchException e) {
                ViewBooks.printMessage(ViewBooks.WRONG_INPUT, "Only numbers are allowed here");
                sc.next();
            }
        }
    }
}
