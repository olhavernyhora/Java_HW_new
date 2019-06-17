package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringList {
    private List<Person> listOfAllPeople;

    public FilteringList(Person... person) {
        this.listOfAllPeople = new ArrayList<>();
        for (Person per: person) {
            if (per == null){
            } else {
                listOfAllPeople.add(per);
            }
        }
    }

    public void getListOfMenForService() {
        List<Person> list = listOfAllPeople.stream().filter(x -> x.getGenre().equals("male"))
                .filter(x -> x.getAge() > 18 && x.getAge() < 60).collect(Collectors.toList());
        System.out.println("Men that are subjects for military service " + list);
    }

    public void getWomenAvrAge() {
        Double avrAge = listOfAllPeople.stream().filter(x -> x.getGenre().equals("female"))
                .mapToDouble(x -> x.getAge()).average().orElse(0);
        System.out.println("Average age of women in the list is " + avrAge);
    }
}
