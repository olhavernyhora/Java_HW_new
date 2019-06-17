package task1And2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringClass {
    private List<String> listOfStrings;

    public StringClass(String... string) {
        this.listOfStrings = new ArrayList<>();
        for (String str: string) {
            Optional<String> opt = Optional.ofNullable(str);
            opt.ifPresent(listOfStrings::add);
        }
    }

    public void printList() {
        listOfStrings.stream().forEach(x -> System.out.print(x + ", "));
    }

    public void sortList(){
        listOfStrings.sort((String one, String two) -> one.compareTo(two) * -1);
    }

    public List<String> filteringListOfString(String letter) {
        return listOfStrings.stream().filter(string -> string.startsWith(letter)).collect(Collectors.toList());
    }
    public List<String> convertStringToUpperCase() {
       return listOfStrings.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
    }
}
