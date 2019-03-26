package com.epam.view;

public class ViewBooks {
    public static final String WRONG_INPUT = "Wrong input! Please try one more time.";
    public static final String ENTER_NUMBER = "Enter any positive number ->";
    public static final String ENTER_DISCOUNT = "Please enter a number from -100.00 to 100.00";
    public static final String ENTER_AUTHOR = "Please enter full name of the author";
    public static final String ENTER_YEAR = "Please enter year to choose all books that were published after it";

    public static void printMessage(String text, String text2){
        System.out.println(text + " " + text2);
    }

    public static void print(String text){
        System.out.println(text);
    }
}
