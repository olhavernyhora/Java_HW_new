package homework4;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your phrase:  ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        String result = findUni(str);
        System.out.println("Unique characters of your phrase are ->  " + result);
    }

    static String findUni(String str){
        String chars = "";
        int index = 0;
        int length = str.length();
        while (index < length) {
            char ch = str.charAt(index);
            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                chars = chars + ch;
            }
            index++;
        }
        return chars;
    }
}
