package task1And2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Sorting array and list
        IntegerClass arrayIntegers = new IntegerClass(10);
        System.out.println("Array of Integers before sorting - " + arrayIntegers);
        arrayIntegers.sortArray();
        System.out.println("Array of Integers after sorting - " + arrayIntegers);

        StringClass listOfStrings = new StringClass("new", "list", "of", "words", "anna", "trade", "topic", null);
        System.out.println("List before sorting -> " + listOfStrings);
//        listOfStrings.printList();

        listOfStrings.sortList();
        System.out.println("\nList after sorting -> ");
        listOfStrings.printList();

//        Working with filters
        Integer[] filteredArray = arrayIntegers.filteringArrayForPositiveNumbers();
        System.out.println("\n" + Arrays.toString(filteredArray));

        System.out.println(listOfStrings.filteringListOfString("t"));

//        Task2
        System.out.println(listOfStrings.convertStringToUpperCase());

        String testString2 = "hello";
        String testString = null;
        ConverterInterface<String> converter = str -> str.replace("l", "TT");
        if (converter.stringIsPresent(testString2)){
            System.out.println(converter.convertString(testString2));
        }

        if (converter.stringIsPresent(testString)){
            System.out.println(converter.convertString(testString));
        } else {
            System.out.println("No string");
        }
    }
}
